public class power {
    static int computePower(int num,int power){
if(power==1){
    return num;
}

int result=computePower(num,power-1);
return num*result;
    }
   public static void main(String[] args) {
    //base case
    //small problem 
    System.out.println(computePower(5,3));
   } 
}
