public class InsertionSort {
    public static void main(String[] args){
        int [] arr = {2,9,5,4,8,1,6};
        insertion_Sort(arr);

        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
    private static void insertion_Sort(int [] arr){
        int n = arr.length;

        for(int i = 1; i < n; i++){
            int curr = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > curr) {

                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = curr;
        }
    }
}

