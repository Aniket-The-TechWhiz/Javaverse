class B{
    final int num;
    B(){
        num=01;
    }
}

class A_FinalVariable {
    public static void main (String args[]){
        B obj=new B();
        System.out.println(obj.num);
    }
}


// You have two primary ways to do this in Java:
// ------------------------------
// ## 1. Direct Initialization (Inline)
// You assign the value directly at the moment you declare the variable. [3] 

// class B {
//     final int num = 10; // Assigned immediately at declaration
// }


// * How it works: Every instance of class B will permanently have num set to 10.

// ## 2. Instance Initializer Block
// You can use an unnamed block of code { ... } inside the class. This block runs automatically every time a new object is created, right before the constructor execution. [4] 

// class B {
//     final int num;

//     // Instance initializer block
//     {
//         num = 20; // Assigned here instead of a constructor
//     }
// }


// * How it works: This is useful if you need to run complex logic (like a try-catch block or a loop) to calculate the final value before assigning it.




// For a static final variable (also known as a compile-time or runtime constant), you cannot use a constructor or a standard instance block. This is because static variables belong to the class itself, not to individual objects.
// You have two ways to assign a value to a static final variable without a constructor:
// ------------------------------
// ## 1. Direct Inline Initialization
// You assign the value immediately when you declare the variable. This is the most common method for defining constants.

// class B {
//     // Assigned immediately at declaration
//     public static final int MAX_LIMIT = 100; 
// }


// * How it works: The value is set as soon as the class is loaded into memory.

// ## 2. Static Initializer Block
// If you need to run complex logic, calculations, or error handling (like a try-catch block) to determine the value, you must use a static { ... } block.

// class B {
//     public static final int CONFIG_VALUE;

//     // Static initializer block
//     static {
//         // You can use loops, conditional statements, or call methods here
//         int calculatedValue = 50 * 2; 
//         CONFIG_VALUE = calculatedValue; // Assigned exactly once
//     }
// }


// * How it works: This block executes automatically exactly once when the class is first loaded by the Java Virtual Machine (JVM), before any objects are created.

// ------------------------------
// ## ⚠️ Crucial Rules for static final Variables

// * No Object Required: Because these are static, you can access them directly using the class name (e.g., B.MAX_LIMIT) without ever creating an object using the new keyword.
// * Strict Single Assignment: You must assign a value to a static final variable either inline or inside the static block. If you forget to initialize it in either place, the compiler will throw an error.
// * Constructors are Forbidden: You cannot initialize a static final variable inside a constructor. Since a constructor runs every time a new object is created, it would violate the rule that a final variable can only be assigned once.

