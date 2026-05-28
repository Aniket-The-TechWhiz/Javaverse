/*
print all permutation of a string 
for example abc
the 3!= 6 posibilities 
            abc
            acb
            bac
            bca
            cab
            cba

Time compelxity = O(n!)
*/

public class PrintAllPermutaion {
    public static void permutation(String str,String permutation){
        if(str.length()==0){
            System.out.println(permutation);
            return;
        }

        for(int i=0;i<str.length();i++){
            char currChar=str.charAt(i);

            String newStr=str.substring(0,i)+str.substring(i+1);
            permutation(newStr,permutation+currChar);
        }
    }
    public static void main(String args[]){
        permutation("abc","");
    }
}
