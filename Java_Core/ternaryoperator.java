/* A ternary operator example 
it works as :- condition ? expression1 : expression2
where condition gets true the expression1 will store in resutl else expression2 will store in result
like in below exampel if n%2==0 is true then "Even number" will store in result else "odd number" will store in result
*/

package Basic;

public class ternaryoperator {
    public static void main (String args[])
    {
        int n=4;
        String result = (n%2==0)? "Even number" : "odd number";
        System.out.println(result);
    }
}
