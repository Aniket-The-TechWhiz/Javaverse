public class XRaiseToN {
    private static int printXRaiseToN(int x,int n){
        if(n==0)return 1;
        if(x==0)return 0;
        return x*(printXRaiseToN(x,n-1));
    }
    public static void main (String agrs[]){
        System.out.println(printXRaiseToN(2,3));
    }
}
