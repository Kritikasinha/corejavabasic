public class Largest {
    public static void main(String[] args) {
        int arr[]={10,5,23,101,69,57,88};
        int max=arr[0];
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
