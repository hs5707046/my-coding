public class SetMatrixZero1 {
    public static void main(String[] args) {
        int[][] array={{1,1,1},{1,0,1},{1,1,1}};
        int n=array.length;
        int m=array[0].length;
        int[] col=new int[m];
        int[] row=new int[n];
        for(int i=0;i<n;i++){
             for(int j=0;j<m;j++){
                if(array[i][j]==0){
                    row[i]=1;
                    col[j]=1;
                }
             }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(row[i]==1||col[j]==1){
                    array[i][j]=0;
                }
            }
        }
        for(int[]x:array){
            for(int y:x){
                System.out.print(y+" ");
            }
            System.out.println();
        }


    }
}
