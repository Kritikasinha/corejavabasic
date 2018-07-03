import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] ={10,20,5,3,4,9};
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
        bubb(arr);
        System.out.println(" ");
         System.out.println("After Sorting");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
    }

         public static void bubb( int arr[]){
            int l = arr.length;
            int temp = 0;
            for (int i=0; i < l ; i++){
                for (int j = 1;j <(l-i); j++) {
                  //  System.out.println(i + " "+ j);
                    if(arr[j-1]>arr[j]){
                        temp=arr[j-1];
                        arr[j-1]=arr[j];
                        arr[j]=temp;
                    }
                }
            }

    }

    }
