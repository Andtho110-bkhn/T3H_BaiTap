package nguyentientho.t3h.baitap.ls3;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

/**
 * @project: T3H_JAVA2002E_BaiTap
 * @author: Nguyễn Tiến Thọ
 */
public class BtvnBuoi3 {
    /*
       Bài 1:
       Cho một mảng tĩnh như sau: int[] arr = {90,90,20,27,35,22,10,8,8}
       a) Chèn thêm giá trị 100 vào phần tử có index = 2 trong mảng arr, lúc này kích thước mảng tăng lên 1 và mảng output sẽ là:
          int[] arr = {90,90,100,20,27,35,22,10,8,8}
       b) Xóa các phần tử bị trùng nhau trong mảng, mảng mới sẽ là mảng chứa các phẩn tử duy nhất.
    */
    /* Câu 1a */
    // Cách 1: tạo mảng mới và add thủ công
    public static void addElement2Array(int[] srcArr) {
        int[] destinationArr = new int[10];
        for (int i = 0; i < 2; i++) {
            destinationArr[i] = srcArr[i];
        }
        destinationArr[2] = 100;
        for (int j = 2; j < srcArr.length; j++) {
            destinationArr[j + 1] = srcArr[j];
        }
        System.out.println("Mảng mới sau khi thêm phần tử là: " + Arrays.toString(destinationArr));
    }

    // cách 2: sử dụng method arraycoppy
    public static int[] addElement2Array2(int[] srcArr, int index, int element) {
        int[] destinationArr = new int[srcArr.length + 1];
        System.arraycopy(srcArr, 0, destinationArr, 0, index);
        destinationArr[index] = element;
        System.arraycopy(srcArr, index, destinationArr, index + 1, srcArr.length - index);
        System.out.println("Mảng mới sau khi thêm phần tử là: " + Arrays.toString(destinationArr));
        return destinationArr;
    }

    /* cách 3: sử dụng method insert Trong ArrayUtils Class của thư viện Apache Commons Lang 3 nằm trong gói
     org.apache.commons.lang3. Cần phải add thư viện vào trước mới có thể sử dụng method này */
    public static int[] addElement2Array3(int[] srcArr, int index, int element) {
        int[] destinationArr = ArrayUtils.insert(index, srcArr, element);
        System.out.println("Mảng mới sau khi thêm phần tử là: " + Arrays.toString(destinationArr));
        return destinationArr;
    }

    // Còn 1 cách nữa sử dụng arrayList nhưng em xin phép không sử dụng trong bài array tĩnh này.

    /* Câu 1b */
    public static void removeDuplicate(int[] srcArr, int length) {
        if (length == 0 || length == 1) return;
        for (int i = 0; i < length - 1; i++) {
            int count = 0;
            for (int j = i + 1; j < length; j++) {
                if (srcArr[j] == srcArr[i]) {
                    count++;
                } else srcArr[j - count] = srcArr[j];
            }
            length = length - count;
        }
        System.out.print("mảng mới sau khi xóa phần tử trùng là: [ ");
        for (int k = 0; k < length; k++) {
            System.out.printf("%s ", srcArr[k]);
        }
        System.out.print("]");
    }

    /* Câu 2 */
    public static void tinhTienDien() {
        Scanner sc = new Scanner(System.in);
        System.out.print("1. Xin mời nhập số lượng hộ dân muốn tính tiền điện: ");
        int numbHome = sc.nextInt();
        long[] arrSrc = new long[numbHome];
        System.out.println("2. Tiếp theo mời nhập số lượng điện tiêu thụ của mỗi hộ dân");
        int i;
        for (i = 1; i <= numbHome; i++) {
            System.out.println("Số lượng điện tiêu thụ của hộ thứ " + i);
            arrSrc[i] = sc.nextLong();
            long soDien = arrSrc[i];
            if (0 < soDien && soDien < 51) {
                System.out.println("Số tiền điện phải trả là = " + (soDien*1549) + " VND");
            } else if (50 < soDien && soDien < 101) {
                System.out.println("Số tiền điện phải trả là = " + (soDien*1600) + " VND");
            } else if (100 < soDien && soDien < 201) {
                System.out.println("Số tiền điện phải trả là = " + (soDien*1857) + " VND");
            } else if (200 < soDien && soDien < 301) {
                System.out.println("Số tiền điện phải trả là = " + (soDien*2340) + " VND");
            } else if (300 < soDien && soDien < 401) {
                System.out.println("Số tiền điện phải trả là = " + (soDien*2615) + " VND");
            } else if (400 < soDien) {
                System.out.println("Số tiền điện phải trả là = " + (soDien*2710) + " VND");
            }
        }
    }

    public static void main(String[] args) {
        int[] srcArr = {90, 90, 20, 27, 35, 22, 10, 8, 8};
        int length = srcArr.length;
//        addElement2Array(srcArr);
//        addElement2Array2(srcArr, 2, 100);
//        addElement2Array3(srcArr, 2, 100);

//        removeDuplicate(srcArr, length);
        tinhTienDien();
    }
}
