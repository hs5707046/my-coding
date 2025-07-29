public class nested {
    public static void main(String[] args) {
        //greater number among the three
        int a=12;
        int b=13;
        int c=11;
        if(a>b){
            if(a>c){
                System.out.println(a);
            }
            else{
                System.out.println(c);
            }
        }
        else{
            if(b>c){
                System.out.println(b);
            }
            else{
                System.out.println(c);
            }
        }
    }
}
