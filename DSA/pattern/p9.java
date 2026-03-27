/*
    1 
   2 2 
  3 3 3 
 4 4 4 4 
5 5 5 5 5 
*/

class p9{
public static void main (String args[]){
   int n=5,space=n-1;
   for(int i=0;i<n;i++){
     for(int k=0;k<space;k++){
      System.out.print(" ");
     }
     for(int j=0;j<=i;j++){
      System.out.print((i+1)+" ");
     }
     System.out.println();
     space--;
   }
}
}
