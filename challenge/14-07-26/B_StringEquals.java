public class B_StringEquals {
    String s;
    public static void main (String[] args){
        String str1="Aniket";
        String str2="Aniket";
        System.out.println("Using String");
        System.out.println("=="+str1==str2);
        System.out.println("equal="+str1.equals(str2));
        B_StringEquals obj1=new B_StringEquals();
        obj1.s="Aniket";
        B_StringEquals obj2=new B_StringEquals();
        obj2.s="Aniket";
        System.out.println("Using String object");
        System.out.println("=="+obj1.s==obj2.s);
        System.out.println("equal="+(obj1.s).equals(obj2.s));
    }
}
