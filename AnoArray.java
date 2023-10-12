class AnoArray{
    public static void main(String[] args) {
        AnoArray.sum(new int []{10,80,30});
    }
    static void sum(int []no){
        int total =0;
        for(int i:no){
            total = total+i;
        }
        System.out.println("Sum is " +total);
    }
}