public class SumofDigit1 {
    static int sum(int num){
        if(num==0){
            return 0;
        }
        int total=sum(num/10);
        int lastDigit=num%10;
        total=total+lastDigit;
        return total;
    }
    public static void main(String[] args) {
       System.out.println(sum(123)); 
    }
}
