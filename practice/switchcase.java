
public class switchcase {
    public static void main(String args[])
    {
        String day="Tuesday";
        switch(day)
        {
            case "Monday","Tuesday","Wednesday","Thursday","Friday"->System.out.println("Weekday");
            case "Saturday","Sunday"->System.out.println("Weekend");
            default->System.out.println("Invalid day");
        }
    }
}
