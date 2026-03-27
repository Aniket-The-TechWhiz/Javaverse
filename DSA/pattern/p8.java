/*
    ******
   ******
  ******
 ******
******
*/

class p8{
  public static void main(String args[]){
    int n=5,space=n-1;
    
  for (int i=0;i<n;i++){
    for (int k=0;k<space;k++){
      System.out.print(" ");
    }
    for(int j=0;j<=n;j++){
      System.out.print("*");
    }
    System.out.println();
    space--;
  }
  }
}
