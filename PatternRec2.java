public class PatternRec2 {
    public static void main(String[] args) {
        display(4,1);
    }
    static void display(int r,int c){
         if(r==0){
            return;
         }
         if(c<=r){
            display(r,c+1);
            System.out.print("*");
            
         }else{
            display(r-1,1);
         System.out.println();
         
         }
    }
}
