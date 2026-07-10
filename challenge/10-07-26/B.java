class B {
    //we can overlad the main method
    public static void main (String args[]){
        System.out.println("Enter in main method");
        main(2);
        main("Aniket",1);
    }
    public static void main (int num){
        System.out.println(num);
    }
    public static void main (String name,int id){
        System.out.println(name+id);
    }
}
class next{
    public static void main (String args[]){
        System.out.println("Enter in second main method");
    }
}
