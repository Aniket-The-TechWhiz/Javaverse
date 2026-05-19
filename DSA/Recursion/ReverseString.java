class ReverseString{
    private static void printReverseString(String s,int idx){
        if(idx==(-1)){System.out.println(); return;}
        System.out.print(s.charAt(idx));
        printReverseString(s,idx-1);
    }
    public static void main (String args[]){
        String s="Aniket";
        printReverseString(s,s.length()-1);
    }
}