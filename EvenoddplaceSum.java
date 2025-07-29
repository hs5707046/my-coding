public class EvenoddplaceSum {
    public static void main(String[] args) {
        int num=1234;
        int position=0;
        int sumOdd=0;
        int sumEven=0;
        while(num>0){
            
            int lastDigit=num%10;
            position++;
            if(position%2==0){
                sumEven=sumEven+lastDigit;
            }
            else{
                sumOdd=sumOdd+lastDigit;
            }
            num=num/10;
        }
        System.out.println(sumOdd+","+sumEven);
    }
}
