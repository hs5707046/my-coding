public class nested1 {
    public static void main(String[] args) {
        int a=15;
        int b=20;
        int c=25;
        int d=13;
        if(a>b){
            if(a>c){
                if(a>d){
                    System.out.println(a);
                }
                else{
                    System.out.println(d);
                }
            }
            else{
                if(c>d){
                    System.out.println(c);
                }
                else{
                    System.out.println(d);
                }
            }
           }
           else{
            if(b>c){
                if(b>d){
                    System.out.println(b);
                }
                else{
                    System.out.println(d);
                }
            }
            else{
                if(c>d){
                    System.out.println(c);
                }
                else{
                    System.out.println(d);
                }
            }
           }
    }
}
