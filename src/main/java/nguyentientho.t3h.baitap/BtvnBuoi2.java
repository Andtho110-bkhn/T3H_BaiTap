package nguyentientho.t3h.baitap;

import java.util.Scanner;

public class BtvnBuoi2 {

    // Bài 1: Tính tổng các số nhỏ hơn 100.
    public long tinhTong(int n) {
        long tong = 0;
        for (int i = 0; i < n; i++) {
            tong = tong + i;
        }
        System.out.println("Tổng các số từ 0 đến 99 là = " + tong);
        return tong;
    }

    // Bài 2: Giai thừa của 10
    public long giaiThua() {
        long fact = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập số cần cần tính giai thừa: ");
        int numb = sc.nextInt();
        if (numb == 0 || numb == 1) {
            System.out.println(" Kết quả giai thừa = 1");
        } else {
            for (int i = 2; i <= numb; i++) {
                fact = fact*i;
            }
            System.out.println("=>> Kết quả giai thừa = " + fact);
        }
        return numb;
    }

    public static void main(String[] args) {
        BtvnBuoi2 tt = new BtvnBuoi2();
        tt.tinhTong(100);
        tt.giaiThua();
    }
}
