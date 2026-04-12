package practice;

public class SortArray {

    public static void main(String[] args) {

        int arr[] = { 5, 2, 8, 1 };

        // simple sorting (bubble sort)
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // print sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}