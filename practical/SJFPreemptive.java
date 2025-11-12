import java.util.*;

public class SJFPreemptive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of processes: ");
        int n = sc.nextInt();
        
        int pid[] = new int[n];
        int at[] = new int[n];   // Arrival time
        int bt[] = new int[n];   // Burst time
        int ct[] = new int[n];   // Completion time
        int tat[] = new int[n];  // Turn around time
        int wt[] = new int[n];   // Waiting time
        int remaining[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("\nProcess " + (i + 1) + ":");
            pid[i] = i + 1;
            System.out.print("Arrival Time: ");
            at[i] = sc.nextInt();
            System.out.print("Burst Time: ");
            bt[i] = sc.nextInt();
            remaining[i] = bt[i];
        }
        
        int complete = 0, t = 0, minIndex = -1, shortest = Integer.MAX_VALUE;
        boolean check = false;
        
        while (complete != n) {
            // Find process with minimum remaining time among arrived processes
            for (int j = 0; j < n; j++) {
                if ((at[j] <= t) && (remaining[j] < shortest) && remaining[j] > 0) {
                    shortest = remaining[j];
                    minIndex = j;
                    check = true;
                }
            }

            if (!check) {
                t++;
                continue;
            }

            remaining[minIndex]--;
            shortest = remaining[minIndex];
            
            if (shortest == 0)
                shortest = Integer.MAX_VALUE;

            // When a process gets completely executed
            if (remaining[minIndex] == 0) {
                complete++;
                check = false;

                ct[minIndex] = t + 1; // Completion time

                tat[minIndex] = ct[minIndex] - at[minIndex];
                wt[minIndex] = tat[minIndex] - bt[minIndex];
                
                if (wt[minIndex] < 0)
                    wt[minIndex] = 0;
            }
            t++;
        }

        // Display results
        System.out.println("\nProcess\tAT\tBT\tCT\tTAT\tWT");
        for (int i = 0; i < n; i++) {
            System.out.println("P" + pid[i] + "\t" + at[i] + "\t" + bt[i] + "\t" + ct[i] + "\t" + tat[i] + "\t" + wt[i]);
        }

        double avgWT = 0, avgTAT = 0;
        for (int i = 0; i < n; i++) {
            avgWT += wt[i];
            avgTAT += tat[i];
        }
        System.out.printf("\nAverage Waiting Time: %.2f", (avgWT / n));
        System.out.printf("\nAverage Turnaround Time: %.2f\n", (avgTAT / n));

        sc.close();
    }
}
