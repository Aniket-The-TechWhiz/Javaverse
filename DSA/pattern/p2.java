/*

*****
*   *
*   *
*****
*/

/*class p2{
  public static void main(String args[]){
    int r=4,c=5;
    for (int i=0;i<r;i++){
      if(i==0 || i==r-1){
        for(int j=0;j<c;j++){
          System.out.print("*");
        }
      }
      if(i!=0 && i!=r-1)
      {
        System.out.print("*");
        for(int j=1;j<c-1;j++){
          System.out.print(" ");
        }
        System.out.print("*");
      }
      System.out.println();
    }
  }
}*/

class p2 {
    public static void main(String args[]) {
        int r = 4, c = 5;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {

                if (i == 0 || j == 0 || i == r - 1 || j == c - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
