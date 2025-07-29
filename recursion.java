public class recursion {
    static void print(int num){
        if(num==0){
            return;
        }
        System.out.println("Amit");
        print(num-1);
        System.out.println("Sristava");//Stackfall
      }   
    public static void main(String[] args) {
      print(5);
    }
}
