package inheritance;

public class singlelevel{
    public static void main(String args[]) {
        child obj = new child();
        obj.show();
    }
    
}
class parent {
    void show() {
        System.out.println("Parent class method");
    }
}

class child extends parent{
    
}


