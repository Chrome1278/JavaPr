import java.util.*;
public class MergingSort {
    public static void mergeSort(Student[] arr, int l, int r) {
        if (r <= l + 1) {
            return;
        }
        int center = l + (r - l) / 2;
        mergeSort(arr, l, center);
        mergeSort(arr, center, r);
        merge(arr, l, center, r);
    }
    private static void merge(Student[] arr, int l, int center, int r) {
        int c = 0;
        int i = l;
        int j = center;
        Student[] temp = new Student[r - l];
        while (i < center && j < r) {
            if (arr[i].getGPA() <= arr[j].getGPA()) {
                temp[c] = arr[i];
                i++;
            }
            else {
                temp[c] = arr[j];
                j++;
            }
            c++;
        }
        for (;i < center; i++, c++) {
            temp[c] = arr[i];
        }
        for (;j < r; j++, c++) {
            temp[c] = arr[j];
        }
        System.arraycopy(temp, 0, arr, l, temp.length);
    }
}
