package nguyentientho.t3h.baitap.ls3;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @project: T3H_JAVA2002E_BaiTap
 * @author: Nguyễn Tiến Thọ
 */
public class ChuaBTVNBBuoi3 {

    // Bài 1a:
    public static void addElement() {
        int[] arr = {90, 90, 20, 27, 35, 22, 10, 8, 8};
        int n = arr.length + 1;
        int valueOfEnd = arr[arr.length - 1];
        int[] newArr = new int[n];
        System.out.println("Mang truoc khi chen: " + Arrays.toString(arr));
        int positon = 2;
        int value = 100;
        for (int i = arr.length - 1; i > positon; i--) {
            arr[i] = arr[i-1];
        }
        arr[positon] = value;
        for (int j = 0; j < arr.length; j++) {
            newArr[j] = arr[j];
        }
        newArr[newArr.length - 1] = valueOfEnd;
        System.out.println("Mang sau chen: " + Arrays.toString(newArr));
    }

    // Bài 1b:
    /* trước khi xóa phần tử trùng cần sắp xếp lại mảng */
    public static int removeDuplicate(int[] arr, int length) {
        if (arr.length == 0 || arr.length == 1) return 0;
        int j = 0;
        int[] tam = new int[length];
        for (int i = 0; i < length - 1; i++) {
            if (arr[i] != arr[i+1]) {
                tam[j++] = arr[i];
            }
        }
        tam[j++] = arr[length - 1];
        System.out.println("Mang tam: " + Arrays.toString(tam));
        int[] newArr = new int[j];
        for (int k = 0; k < tam.length; k++) {
            if (k < j) {
                newArr[k] = tam[k];
            }
        }
        System.out.println("Mang cuoi: " + Arrays.toString(newArr));
        return j;
    }

    public static void main(String[] args) {
//        addElement();

        int[] arr = {90, 90, 20, 27, 35, 22, 10, 8, 8};
        int length = arr.length;
        System.out.println("Mang truoc sap xep" + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Mang sau khi sap xep" + Arrays.toString(arr));
        removeDuplicate(arr, length);
    }
}
