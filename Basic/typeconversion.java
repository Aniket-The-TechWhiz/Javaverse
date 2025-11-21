/*types casting has tow types implicit and explicit 
for example if a small container is sotred in a large container then it is called implicit type conversion and widening,
and if a large container is stored in a small container then it is called explicit type conversion and narrowing
 */
package Basic;

public class typeconversion {
    public static void main (String args[])
    {
        int a=105;
        double d=a;  //implicit type conversion and conversion from int to double
        System.out.println("The value of d is: " +d);

        double b=20.5;
        int c=(int)b; //explicit type conversion and casting from double to int
        System.out.println("The value of c is: " +c);

        String str="100";
        int num=Integer.parseInt(str); //string to integer conversion where Integer is wrapper class
        System.out.println("The value of num is: " +num);
   }
}
