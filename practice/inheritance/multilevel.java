package practice.inheritance;
class grandparent {
    void greet() {
        System.out.println("Hello from Grandparent");
    }
}   
class parent extends grandparent {
    void show() {
        System.out.println("Hello from Parent");
    }
}
class child extends parent {
    void display() {
        System.out.println("Hello from Child");
    }
}
public class multilevel {
    public static void main(String args[]) {
        child obj = new child();
        obj.greet();
        obj.show();
        obj.display();
    }
}
