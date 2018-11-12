import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
       int[] arr = {3, 44, 38 ,5 ,47};
       Arrays.sort(arr);
        System.out.println( isSorted(arr));
    }

    static int binarySearch(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;

        while(left != right){
            int start = (left + right) /2;
            if(arr[start] > target){
                right = start;
            }
            if(arr[start] < target){
                left = start;
            }
            if(arr[start] == target)
                return start;
        }

        return -1;
    }

    static int binarySearch(int[] arr, int target, int left, int right){
        int start = (right + left)/2;

        if(left == right)
            return -1;

        if(arr[start] == target){
            return start;
        }

        if(arr[start] > target){
            right = start - 1;
            return binarySearch(arr, target, left, right);
        }

        if(arr[start] < target){
            left = start + 1;
            return binarySearch(arr, target, left, right);
        }
        return -1;
    }

    static void insertionSort(int[] arr){
        int n = arr.length;
        for (int i = 1; i < n - 1 ; i++) {
            int key = arr[i];
            int pos = i - 1;

            while(pos >= 0 && arr[pos] > key){
                arr[pos + 1] = arr[pos];
                pos--;
            }

            arr[pos+1] = key;
        }
    }

    static void selectionSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n - 1 ; i++) {
            int min = arr[i];
            int min_index = i;
            for (int j = i; j < n; j++) {
                if(min > arr[j]){
                    min = arr[j];
                    min_index = j;
                }
            }
            int temp = arr[i];
            arr[i] = min;
            arr[min_index] = temp;
        }
    }

    static void bubbleSort(int[] arr){
        int n = arr.length;
        for (int i = n - 1; i >= 0 ; i--) {
            for (int j = 0; j < i; j++) {
                if(arr[j] > arr[j+1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

    public static int BubbleSort(int[] arr) {
                int InversionCount = 0;
                for (int j = 0; j < arr.length - 1; j++) {
                    boolean isSwapped = false;

                    for (int i = 0; i < arr.length - 1 - j; i++) {
                        if (arr[i] > arr[i + 1]) {
                            swap(arr, i, i + 1);
                            isSwapped = true;
                            InversionCount++;
                        }
                    }
                    if (!isSwapped)
                return InversionCount;
        }
        return InversionCount;
    }

    static boolean isSorted(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] > arr[i + 1])
                return  false;
        }

        return true;
    }
}
