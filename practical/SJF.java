import java.util.*;

class SJFnonpreemptive {
    int process, arrival_time, brust_time, completion_time, turn_around_time, waiting_time;
    boolean flag;

    void SJFnon(int p, int at, int bt) {
        process = p;
        arrival_time = at;
        brust_time = bt;
        flag = true;
    }
}

public class SJF {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of Process : ");
        int n = sc.nextInt();

        SJFnonpreemptive[] obj = new SJFnonpreemptive[n];
        SJFnonpreemptive[] completed = new SJFnonpreemptive[n];

        // Input processes
        for (int i = 0; i < n; i++) {
            obj[i] = new SJFnonpreemptive();
            System.out.print("Enter Arrival time (" + (i + 1) + "): ");
            int at = sc.nextInt();
            System.out.print("Enter Burst time (" + (i + 1) + "): ");
            int bt = sc.nextInt();
            obj[i].SJFnon(i + 1, at, bt);
        }

        // Sort by Arrival Time first
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (obj[i].arrival_time > obj[j].arrival_time) {
                    SJFnonpreemptive temp = obj[i];
                    obj[i] = obj[j];
                    obj[j] = temp;
                }
            }
        }

        // First process runs first
        int currentTime = obj[0].arrival_time;
        int completedCount = 0;

        while (completedCount < n) {
            SJFnonpreemptive ready[] = new SJFnonpreemptive[n];
            int count = 0;

            // Find ready processes
            for (int j = 0; j < n; j++) {
                if (obj[j].flag && obj[j].arrival_time <= currentTime) {
                    ready[count] = obj[j];
                    count++;
                }
            }

            // If no process has arrived yet, increment time
            if (count == 0) {
                currentTime++;
                continue;
            }

            // Sort ready queue by burst time (and arrival time if equal)
            for (int k = 0; k < count - 1; k++) {
                for (int s = k + 1; s < count; s++) {
                    if (ready[k].brust_time > ready[s].brust_time ||
                       (ready[k].brust_time == ready[s].brust_time &&
                        ready[k].arrival_time > ready[s].arrival_time)) {
                        SJFnonpreemptive temp = ready[k];
                        ready[k] = ready[s];
                        ready[s] = temp;
                    }
                }
            }

            // Select shortest process (first in sorted ready list)
            SJFnonpreemptive selected = ready[0];
            selected.completion_time = currentTime + selected.brust_time;
            selected.turn_around_time = selected.completion_time - selected.arrival_time;
            selected.waiting_time = selected.turn_around_time - selected.brust_time;
            selected.flag = false;

            // Update time
            currentTime = selected.completion_time;

            // Add to completed
            completed[completedCount] = selected;
            completedCount++;
        }

        // Display output
        System.out.println("\nP\tAT\tBT\tCT\tTAT\tWT");
        for (int i = 0; i < n; i++) {
            System.out.println(completed[i].process + "\t" +
                    completed[i].arrival_time + "\t" +
                    completed[i].brust_time + "\t" +
                    completed[i].completion_time + "\t" +
                    completed[i].turn_around_time + "\t" +
                    completed[i].waiting_time);
        }

        sc.close();
    }
}
