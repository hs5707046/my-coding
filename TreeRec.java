public class TreeRec {

    static void fun(int num){
        if(num<=0){
            return;
        }
        System.out.println("pre call"+num);
        fun(num-1);
        System.out.println("in between call"+num);
        fun(num-2);
        System.out.println("post call"+num);
    }
    public static void main(String[] args) {
        fun(3);
    }
}
