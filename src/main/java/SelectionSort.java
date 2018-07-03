public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {6, 8, 9, 11, 2, 4, -1, 6};
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        System.out.println("After Sorting");
        sort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void sort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < arr[index]){
                    index = j;//searching for lowest index
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }
}

