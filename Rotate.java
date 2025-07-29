public class Rotate {
    public static void main(String[] args) {
        int[][] array={{1,2,3},{4,5,6},{7,8,9}};
        int n=array.length;
        int m=array[0].length;
        int[][] newArray=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
              newArray[j][n-i-1]=array[i][j];
            }
        }
        for(int[]x:newArray){
            for(int y:x){
                System.out.print(y+" ");
            }
            System.out.println();
        }
    }
}
