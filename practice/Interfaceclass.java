package practice;

interface Dad
{
    public void dadDisplay();
}
interface Mom
{
    void momDisplay();
}
class Child implements Dad,Mom
{
    @Override
    public void momDisplay() {
        System.out.println("This is mom display method");
    }

    @Override
    public void dadDisplay() {
        System.out.println("This is dad display method");
    }

}

public class Interfaceclass {
    public static void main (String args[])
    {
        Dad d=new Child();
        d.dadDisplay();
        // Child c=new Child();
        // c.dadDisplay();
        // c.momDisplay();
    }
}
