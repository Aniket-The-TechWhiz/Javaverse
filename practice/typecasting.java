package practice;


public class typecasting{
    public static void main(String args[])
    {
        int i=10;
        double d=i;
        System.out.println("double value:"+d);

        int ci=(int)d;
        System.out.println("change int:"+ci);

        double l=123456789;
        float f=(float)l;
        System.out.println("float value:"+f);
    }
}