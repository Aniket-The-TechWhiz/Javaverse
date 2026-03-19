public class stringpoolclass {
    public static void main (String args[])
    {
        String str1="Hello";
        String str2="Hello";
        String str3=new String("Hello");
        String str4=new String("Hello");

        System.out.println(str1==str2); // true, both refer to same string literal in string pool
        System.out.println(str1==str3); // false, str3 refers to a new object in heap memory
        System.out.println(str3==str4); // false, str4 refers to another new object in heap memory  
        
    }
}
