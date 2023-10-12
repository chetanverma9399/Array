public class bubbleSort1 {
    public static void main(String[] args) {
        int [] a ={36,15,25,15,6,1,16,62,451};
        int temp ;
        for(int i=0;i<a.length;i++){
            int flag=0;
            for(int j=0;j<a.length-1-i;j++){
                if (a[i]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    flag=1;
                }
            }
            if(flag==0){
                break;
            }
        }
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
