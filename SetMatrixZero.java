public class SetMatrixZero {
    static void markRowZero(int i,int m,int[][] array){

for(int j=0;j<m;j++){
    if(array[i][j]!=0){
        array[i][j]=-1;
    }
}
    }
 static void markColumnZero(int j,int n,int[][] array){
for(int i=0;i<n;i++){
    if(array[i][j]!=0){
        array[i][j]=-1;
    }
}
    }
    public static void main(String[] args) {
        int[][] array={{1,1,1},{1,0,1},{1,1,1}};
        int n=array.length;
        int m=array[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(array[i][j]==0){
                    markRowZero(i,m,array);
                    markColumnZero(j,n,array);
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(array[i][j]==-1){
                    array[i][j]=0;
                }
            }
        }
        for(int x[]:array){
            for(int y:x){
                System.out.print(y+" ");
            }
            System.out.println();
        }


    }
}
