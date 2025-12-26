package practice;

public class foreachclass {
    public static void main(String args[])
    {
        int arr[]={12,34,343,23,22,13};
        for (int i:arr)
        {
            System.out.println(i);
        }

        int arr1[]=new int[3];
        for (int i=0;i<arr1.length;i++)
        {
            arr1[i]=i*10;
        }
        for (int i:arr1)
        {
            System.out.println(i);
        }

        int arr2[]={1,2,2,2,2,3,4,2,2,5,2,2,6,7};
        for (int i:arr2)
        {
            if (i==2) continue;
            System.out.println(i);
        }
    }
}
