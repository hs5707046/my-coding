public class SumofDigit {
static void sum(int num,int sum){
if(num==0){
    System.out.println(sum);
    return;
}
int lastDigit=num%10;
sum=sum+lastDigit;
sum(num/10,sum);

}
    public static void main(String[] args) {
        sum(123,0);  
    
    }
}
