/* 
count total path in a maze to move from (0,0) to (n,m)
Time Complexity = 
conditions move only right and down not left , digonal
*/

public class CntTotalPath {

    public static int count(int i,int j,int n,int m){
        if(i==n || j==m){
            return 0;
        }
        if(i==n-1 && j==m-1){
            return 1;
        }
        int downPath=count(i+1,j,n,m);
        int rightPath=count(i,j+1,n,m);
        return downPath+rightPath;
    }
    public static void main (String args[]){
        int totalPath=count(0,0,3,3);
        System.out.println("Total path: "+totalPath);
    }
}
