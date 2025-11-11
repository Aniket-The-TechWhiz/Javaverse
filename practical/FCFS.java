import java.util.*;

class FCFS{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of processes: ");
        int n=sc.nextInt();
        int []process=new int[n];
        int []arrival_time=new int[n];
        int []brust_time=new int[n];
        int []completion_time=new int[n];
        int []turn_around_time=new int[n];
        int []waiting_time=new int[n];

        for (int i=0;i<n;i++)
        {
            process[i]=i+1;
            System.out.println("Enter Arival time ("+(i+1)+") :");
            arrival_time[i]=sc.nextInt();

            System.out.println("Enter Burst time ("+(i+1)+") :");
            brust_time[i]=sc.nextInt();

        }
        sc.close();

        for (int i=0;i<n;i++)
        {
            for (int j=i+1;j<n;j++)
            {
                int temp;
                if (arrival_time[i]>arrival_time[j])
                {
                    temp=arrival_time[i];
                    arrival_time[i]=arrival_time[j];
                    arrival_time[j]=temp;

                    temp=brust_time[i];
                    brust_time[i]=brust_time[j];
                    brust_time[j]=temp;

                    temp=process[i];
                    process[i]=process[j];
                    process[j]=temp;
                }
                
            }
        }
        completion_time[0]=arrival_time[0]+brust_time[0];
        turn_around_time[0]=completion_time[0]-arrival_time[0];
        waiting_time[0]=turn_around_time[0]-brust_time[0];

        for (int i=1;i<n;i++)
        {
            int temp=0;
            if (arrival_time[i]>completion_time[i-1])
            {
                temp=arrival_time[i]-completion_time[i-1];
            }
            completion_time[i]=temp+completion_time[i-1]+brust_time[i];
            turn_around_time[i]=completion_time[i]-arrival_time[i];
            waiting_time[i]=turn_around_time[i]-brust_time[i];

        }

        //print table
        System.out.println("P\tAT\tBT\tCT\tTAT\tWT");

        for (int i=0;i<n;i++)
        {
            System.out.println(process[i]+"\t"+arrival_time[i]+"\t"+brust_time[i]+"\t"+completion_time[i]+"\t"+turn_around_time[i]+"\t"+waiting_time[i]);
        }
    }   
}