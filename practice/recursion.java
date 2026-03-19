public class recursion {
    public static void main(String args[])
    {
        String a=revS("aniket",5);
        System.out.println(a);
    }

    public static String revS(String s,int n)
    {
        String temp="";
        if(n>=0)
        {
             temp=s.charAt(n)+revS(s,n-1);
        }
        return temp;
    }
}