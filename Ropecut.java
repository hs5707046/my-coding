public class Ropecut {
    static int Maxcut(int ropeLen,int a,int b,int c){
        if(ropeLen==0){
            return 0;
        }
        if(ropeLen<0){
            return -1;
        }
       int x= Maxcut(ropeLen-a,a,b,c);
       int y= Maxcut(ropeLen-b,a,b,c);
       int z= Maxcut(ropeLen-c,a,b,c);
       int finalresult=Math.max(Math.max(x,y),z);
       if(finalresult==-1){
        return -1;
       }
       else 
       return finalresult+1;

    }
    public static void main(String[] args) {
        System.out.println(Maxcut(5,5,2,1));
        
    }

}
