import java.util.*;

public class RoundRobin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of processes: ");
        int n = sc.nextInt();

        int pid[] = new int[n];
        int bt[] = new int[n]; // Burst time
        int at[] = new int[n]; // Arrival time
        int ct[] = new int[n]; // Completion time
        int tat[] = new int[n]; // Turn around time
        int wt[] = new int[n]; // Waiting time
        int rem_bt[] = new int[n]; // Remaining burst time

        for (int i = 0; i < n; i++) {
            System.out.println("\nProcess " + (i + 1) + ":");
            pid[i] = i + 1;
            System.out.print("Arrival Time: ");
            at[i] = sc.nextInt();
            System.out.print("Burst Time: ");
            bt[i] = sc.nextInt();
            rem_bt[i] = bt[i];
        }

        System.out.print("\nEnter Time Quantum: ");
        int tq = sc.nextInt();

        int t = 0; // current time
        Queue<Integer> q = new LinkedList<>();
        boolean visited[] = new boolean[n];

        q.add(0);
        visited[0] = true;

        while (!q.isEmpty()) {
            int i = q.poll();

            // If process has remaining burst time
            if (rem_bt[i] > 0) {
                if (rem_bt[i] > tq) {
                    t += tq;
                    rem_bt[i] -= tq;
                } else {
                    t += rem_bt[i];
                    rem_bt[i] = 0;
                    ct[i] = t;
                }
            }

            // Check for newly arrived processes
            for (int j = 0; j < n; j++) {
                if (at[j] <= t && !visited[j] && rem_bt[j] > 0) {
                    q.add(j);
                    visited[j] = true;
                }
            }

            // If current process still has time left, re-add it to queue
            if (rem_bt[i] > 0)
                q.add(i);
        }

        // Calculate TAT and WT
        double totalTAT = 0, totalWT = 0;
        for (int i = 0; i < n; i++) {
            tat[i] = ct[i] - at[i];
            wt[i] = tat[i] - bt[i];
            totalTAT += tat[i];
            totalWT += wt[i];
        }

        // Display Results
        System.out.println("\nProcess\tAT\tBT\tCT\tTAT\tWT");
        for (int i = 0; i < n; i++) {
            System.out.println("P" + pid[i] + "\t" + at[i] + "\t" + bt[i] + "\t" + ct[i] + "\t" + tat[i] + "\t" + wt[i]);
        }

        System.out.printf("\nAverage Turnaround Time: %.2f", (totalTAT / n));
        System.out.printf("\nAverage Waiting Time: %.2f\n", (totalWT / n));

        sc.close();
    }
}
