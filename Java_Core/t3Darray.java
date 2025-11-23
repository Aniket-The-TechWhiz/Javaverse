/* 3D array looks like a cube or a box
e.g.               ____________
                  /__________/|    
                  ||        | |
                  ||________|_|
                  |/________|/

In 3D array we have depth, rows and columns
e.g.
depth\row|  0  |  1  |
------------------------
   0     | 1 2 3|4 5 6|
------------------------
   1     |7 8 9 |10 11 12|
------------------------    
*/
package Java_Core;

public class t3Darray {
    public static void main (String args[])
    {
        int arr[][][] =new int [][][]{
            {{1,2,3},{4,6,7}},
            {{8,9,10},{11,12,13}},
        };
        
        for (int i=0;i<arr.length;i++)
        {
            for (int j=0;j<arr[i].length;j++)
            {
                for (int k=0;k<arr[i][j].length;k++)
                {
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
