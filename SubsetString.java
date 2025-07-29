public class SubsetString {
    public static void main(String[] args) {
        String str="abc";
        subset(str,"");
    }
    static void subset( String str, String sub){
        if(str.isEmpty()){
            System.out.println(sub);
            return;
        }
        char ch=str.charAt(0);
        subset(str.substring(1),sub+ch);
        subset(str.substring(1),sub);

    }
}
