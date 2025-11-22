/*
    before java 14 we used to write switch case like this
    switch (day)
    {
        case "MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY":      
            System.out.println("Weekday");
            break;
        case "SATURDAY","SUNDAY":
            System.out.println("Weekend");
            break;
        default:
            System.out.println("Invalid day");
    }
    but from java 14 we can write switch case like below    
*/

package Java_Core;

public class newswitchcase {
    public static void main (String args[])
    {
        String day="MONDAY";

        switch (day)
        {
            case "MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY"-> System.out.println("Weekday");
            case "SATURDAY","SUNDAY"-> System.out.println("Weekend");
            default -> System.out.println("Invalid day");
        }
    }
}
