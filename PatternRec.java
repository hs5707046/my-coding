public class PatternRec {
    public static void main(String[] args) {
        display(4,1);
    }
    static void display(int r,int c){
         if(r==0){
            return;
         }
         if(c<=r){
            System.out.print("*");
            display(r,c+1);
         }else{
         System.out.println();
         display(r-1,1);
         }
    }
}
