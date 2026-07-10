class Parent {
    public static void main(String[] args) {
        System.out.println("Main inside Parent Class");
    }
    // 1. Added the method to the Parent class
    public void show() {
        System.out.println("Show inside Parent Class");
    }
}

class Child extends Parent {
    // This looks like overriding, but it is actually Method Hiding
    public static void main(String[] args) {
        System.out.println("Main inside Child Class");
    }
     // 2. TRUE OVERRIDING: Overriding the instance method
    @Override
    public void show() {
        System.out.println("Show inside Child Class");
    }
}
class C {
    public static void main (String args[]){
        // Parent obj1=new Parent();
        // obj1.main(null);
        // Child obj2=new Child();
        // obj2.main(null);

        // Parent reference pointing to a Child object
        Parent obj3 = new Child(); 
        
        System.out.println("--- Testing Static (Hiding) ---");
        obj3.main(null); // Resolves at compile-time using the Parent reference
        
        System.out.println("\n--- Testing Instance (Overriding) ---");
        obj3.show(); // Resolves at runtime using the actual Child object
    }
}

