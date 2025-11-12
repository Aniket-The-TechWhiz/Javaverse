import java.util.*;

public class PriorityScheduling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of processes: ");
        int n = sc.nextInt();

        int pid[] = new int[n]; // process id
        int at[] = new int[n];  // arrival time
        int bt[] = new int[n];  // burst time
        int pr[] = new int[n];  // priority
        int ct[] = new int[n];  // completion time
        int tat[] = new int[n]; // turnaround time
        int wt[] = new int[n];  // waiting time
        boolean done[] = new boolean[n]; // finished flag

        for (int i = 0; i < n; i++) {
            System.out.println("\nProcess " + (i + 1) + ":");
            pid[i] = i + 1;
            System.out.print("Arrival Time: ");
            at[i] = sc.nextInt();
            System.out.print("Burst Time: ");
            bt[i] = sc.nextInt();
            System.out.print("Priority (Lower number = Higher priority): ");
            pr[i] = sc.nextInt();
        }

        int completed = 0, t = 0;

        while (completed < n) {
            int idx = -1;
            int highestPriority = Integer.MAX_VALUE;

            // find process with highest priority (smallest number) among arrived and not done
            for (int i = 0; i < n; i++) {
                if (at[i] <= t && !done[i]) {
                    if (pr[i] < highestPriority) {
                        highestPriority = pr[i];
                        idx = i;
                    }
                    else if (pr[i] == highestPriority && at[i] < at[idx]) {
                        idx = i; // tie breaker – earlier arrival
                    }
                }
            }

            if (idx == -1) {
                t++; // if no process arrived yet
                continue;
            }

            t += bt[idx];
            ct[idx] = t;
            tat[idx] = ct[idx] - at[idx];
            wt[idx] = tat[idx] - bt[idx];
            done[idx] = true;
            completed++;
        }

        // Output results
        System.out.println("\nProcess\tAT\tBT\tPR\tCT\tTAT\tWT");
        double avgTAT = 0, avgWT = 0;
        for (int i = 0; i < n; i++) {
            avgTAT += tat[i];
            avgWT += wt[i];
            System.out.println("P" + pid[i] + "\t" + at[i] + "\t" + bt[i] + "\t" + pr[i] +
                    "\t" + ct[i] + "\t" + tat[i] + "\t" + wt[i]);
        }

        System.out.printf("\nAverage Turnaround Time: %.2f", avgTAT / n);
        System.out.printf("\nAverage Waiting Time: %.2f\n", avgWT / n);

        sc.close();
    }
}
