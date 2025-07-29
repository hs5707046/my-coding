public class MissingNumber {
    public static void main(String[] args) {
        int[] array={1,2,3,5};
        int x=0;
        int y=0;
        for(int i=1;i<=array.length+1;i++){

            x=x^i;
        }
for(int value:array){
    y=y^value;
}
System.out.println(x^y);
    
    }
}
