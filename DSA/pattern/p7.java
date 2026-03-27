/* 
*          *
**        **
***      ***
****    ****
*****  *****
************
************
*****  *****
****    ****
***      ***
**        **
*          *
*/
class p7{
  public static void main (String args[]){
    int n=6,l=(n-1)*2;
    for (int i=0;i<n;i++){
      for (int j=0;j<=i;j++){
        System.out.print("*");
      }
      for (int k=1;k<=l;k++){
        System.out.print(" ");
      }
      for (int j=0;j<=i;j++){
        System.out.print("*");
      }
      System.out.println();
      l-=2;
    }
    l=0;
    for(int i=0;i<n;i++){
      for (int j=n;j>i;j--){
        System.out.print("*");
      }
      for(int k=1;k<=l;k++){
        System.out.print(" ");
      }
      for (int j=n;j>i;j--){
        System.out.print("*");
      }
      System.out.println();
      l+=2;
    }
  }
}
