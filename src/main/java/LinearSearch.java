public class LinearSearch {
    public static void main(String[] args) {
        int arr[]= {1,5,4,8,0,44};
        int key = 4;
      //  System.out.println(key+" is found at index:"+ linear(arr,key));
        linear(arr,key);
    }
   static int linear(int arr[], int key) {
       for (int i : arr) {
           if (i == key) {
               return i;
               //System.out.println(key + " is found at index:" + i);
           }
           else{
             //  System.out.println(key + " is not found");
                return -1;
           }
       }
       return 1;
   }
}

