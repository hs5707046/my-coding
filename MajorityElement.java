public class MajorityElement {//mpore vooting
    public static void main(String[] args) {
        int[] array={1,2,2,3,1,1,1,1};
        int count=0;
        int element=0;
        for(int i=0;i<array.length;i++){
            if(count==0){
                count=1;
                element=array[i];
            }
            else if(array[i]==element){
                count++;
            }
            else{
                count--;
            }
        }
        int count1=0;
        for(int i=0;i<array.length;i++){
            if(array[i]==element){
                count1++;
            }
            if(count1>(int)array.length/2){
                System.out.println(element);
            }
        }

    }
}
