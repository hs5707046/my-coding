public class ArayMethod {
    static void show(int []a){
        a[0]=100;
        for(int i:a){
            System.out.println(i);
        }
    }
     public static void main(String[] args) {
        int[] arr={10,20,30};
        show(arr);
        System.out.println("After passing through the metnhod");
for(int i:arr){
    System.out.println(i);
}
    }
}
