package practice;

public class interfaceclassforcompany {
    public static void main (String args[])
    {
        Computer l=new Laptop();
        // Computer d=new Desktop();
        
        Developer dev=new Developer();
        dev.develop(l);
    }
}

interface Computer{ void code();}

class Laptop implements Computer{
    public void code(){System.out.println("Coding in laptop");}
}

class Desktop implements Computer{
    public void code(){System.out.println("Coding in desktop");}
}

class Developer {
    public void develop(Computer c)
    {
        c.code();
    }
}


