class decision{
    public static void main(String[] args) {
        int num=4;
        if((num^1)==num+1){//num-1
            System.out.println("EVEN");
        }else
        {
            System.out.println("odd");
        }
        if((num&1)==0){//num==1
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
        if((num|1)==num+1){//num=unchanged
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }




    }
}