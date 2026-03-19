/*

   *
  **
 ***
****

*/

class p5{
  public static void main(String args[]){
    int n=4;
    for (int i=0;i<n;i++){
    //space
      for (int j=1;j<n-i;j++){
        System.out.print(" ");
      }
      //star
      for(int k=0;k<=i;k++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
