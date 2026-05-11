import java.util.*;

class Job {
    char id;
    int deadline, profit;

    Job(char id, int deadline, int profit) {
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }
}

public class JobScheduling {

    public static void scheduleJobs(Job jobs[], int n) {

        // Sort jobs by profit in descending order
        Arrays.sort(jobs, (a, b) -> b.profit - a.profit);

        boolean slot[] = new boolean[n];
        char result[] = new char[n];

        int totalProfit = 0;

        for (int i = 0; i < n; i++) {

            for (int j = Math.min(n, jobs[i].deadline) - 1; j >= 0; j--) {

                if (!slot[j]) {
                    slot[j] = true;
                    result[j] = jobs[i].id;
                    totalProfit += jobs[i].profit;
                    break;
                }
            }
        }

        System.out.println("Selected Jobs:");

        for (char c : result) {
            if (c != 0)
                System.out.print(c + " ");
        }

        System.out.println("\nTotal Profit: " + totalProfit);
    }

    public static void main(String[] args) {

        Job jobs[] = {
                new Job('A', 2, 100),
                new Job('B', 1, 19),
                new Job('C', 2, 27),
                new Job('D', 1, 25),
                new Job('E', 3, 15)
        };

        scheduleJobs(jobs, jobs.length);
    }
}