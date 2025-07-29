public class printdigit1 {
    static void printDigit(int num)
    {
   if(num==0){
    return;
    }
    printDigit(num/10);
    int lastDigit=num%10;
    System.out.println(lastDigit);

    }
    public static void main(String[] args) {
      printDigit(12345);  
    }
    
}
