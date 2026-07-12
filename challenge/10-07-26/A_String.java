class A_String{
    public static void main (String args[]){
        System.out.println(1+2+"hello"); //3hello
        System.out.println("hello"+1+3); //hello13
        System.out.println("hello" + (1 + 3)); // Outputs: hello4 due to paranthesis it calculate first number and then add it to string 
        //multiplication and divison operator has higher priority then plus
        System.out.println("Result: " + 2 * 3); // Outputs: Result: 6 
        System.out.println("Result: " + 10 / 2); // Outputs: Result: 5
        //THIS WILL NOT COMPILE: System.out.println("Result: " + 5 - 2); 
        System.out.println(1 + 2 - 3 + "hello"); // Outputs: 0hello
        System.out.println(1+2*3); // 2*3=6 1+6 = 7 
        //if same priority then left -to -right
        System.out.println(1+2*3/2-1); //2 * 3 becomes 6 , 6 / 2 ,1 + 3 - 1 =3
    }
}