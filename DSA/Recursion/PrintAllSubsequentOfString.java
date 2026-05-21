//Print all Subsequent of a String 
public class PrintAllSubsequentOfString {
    protected static void subsequence(String str,int idx,String newString){
        
        if(idx==str.length()){
            System.err.println(newString);
            return;
        }
        
        char currChar=str.charAt(idx);

        //to be
        subsequence(str,idx+1,newString+currChar);

        //not to be
        subsequence(str,idx+1,newString);
    }
    public static void main (String args[]){
        String str="abc";
        subsequence(str,0,"");
    }
}
