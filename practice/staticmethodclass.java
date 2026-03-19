

public class staticmethodclass {
    static void mymethod()
    {
        System.out.println("Hello static");
    }
    void yourmethod()
    {
        System.out.println("Hello without static");
    }
    public static void main(String args[])
    {
        //class method with static belongs to main class
        mymethod();

        //this not belongs to main class we want to create oject of class
        staticmethodclass obj=new staticmethodclass();
        obj.yourmethod();
    }
}
