public class StringRec {
    public static void main(String[] args) {
        String str="aabbccdd";
       
        rec(str,"");
      
    }
    static void rec(String str,String x ){
        if(str.isEmpty()){
            System.out.println(x);
            return;
        }
        char ch=str.charAt(0);
        if(ch=='a'){
            rec(str.substring(1),x);
        }
        else{
            rec(str.substring(1),x+ch);
        }
    }
}
