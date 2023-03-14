package ru.meself;
import java.util.Arrays;

public class Sort {
    public int[] Bubble(int[] num){
        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < num.length-1; i++) {
                if(num[i] > num[i+1]){
                    isSorted = false;
                    buf = num[i];
                    num[i] = num[i+1];
                    num[i+1] = buf;
                }
            }
        }
        return(num);
    }
//    public int[] QuickSort(int[] a, int L, int R) {
//        int i = L;
//        int j = R;
//        int x = a[(L + R)/2];
//        do{
//            while (a[i] < x){
//                i++;
//            }
//            while (a[j] > x){
//                j--;
//            }
//            if(i <= j) {
//                int tmp = a[i];
//                a[i] = a[j];
//                a[j] = tmp;
//                i++;
//                j--;
//            }
//        }while(i <= j);
//        if (L < j){
//            QuickSort(a, i, R);
//        }
//        if (R > i){
//            QuickSort(a, L, j);
//        }
//        return(a);
//    }
    public static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int pivotIndex = partition(arr, start, end);
            quickSort(arr, start, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, end);
        }
    }

    private static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int i = start - 1;

        for (int j = start; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, end);
        return i + 1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
