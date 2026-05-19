public class MoveAllXToEnd {
    private static String printAns(String str,String newString,int idx,int cnt){
        
        if(idx==str.length()){
            for(int i=0;i<cnt;i++){
                newString+='x';
            }
            return newString;
        }
        char c=str.charAt(idx);
        
        if (c == 'x') {
            return printAns(str, newString, idx + 1, cnt + 1);
        } 
        else {
            return printAns(str, newString + c, idx + 1, cnt);
        }
        
    }

    public static void main (String args[]){
        String s="axxxbcxxx";

        System.out.println(printAns(s,"",0,0));
    }
}
