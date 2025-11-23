/*
jagged array is like their are 3 rows but each row has
different number of columns then we will use the jagged array
e.g. 
1 2 3 4 
3 4 
3 5 3 5 3 
3
*/

package Java_Core;

public class jaggedarray {
    public static void main (String args[])
    {
        int arr[][] =new int [4][];
        arr[0]= new int[]{1,2};
        arr[1]= new int[]{3,4,5};
        arr[2]= new int[]{6,7,8,9};
        arr[3]= new int[]{10,11};

        //ordinary for loop
        for (int i=0;i<arr.length;i++)
        {
            for (int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        //enhanced for loop
        for (int i[]:arr)
        {
            for (int j:i)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    } 
}
