package nguyentientho.t3h.baitap.ls6.bai1andbai2;

import java.util.*;

/**
 * @project: T3H_JAVA2002E_BaiTap
 * @author: Nguyễn Tiến Thọ
 */
public class Queues {

    public static void displayQueue(List listQueue) {
        Iterator<Customer> ite = listQueue.iterator();
        Customer valueList = ite.next();
        while (ite.hasNext()) {
            valueList.displayObjectCustomer();
        }
    }

    public static void findCustomer(LinkedList<Customer> listQueue) {
        for (Customer customer : listQueue) {
            if (customer.getMusicName().equals("toichuabietyeu")) {
                customer.displayObjectCustomer();
            }
        }
    }


    public static void main(String[] args) {
        var listQueue = new LinkedList<Customer>();
        listQueue.offer(new Customer("01", "Văn A", "12h", ""));
        listQueue.offer(new Customer("02", "Nguyễn Thọ", "13h", "toichuabietyeu"));
        listQueue.offer(new Customer("03", "Văn C", "14h", ""));
        listQueue.offer(new Customer("04", "Văn D", "15h", ""));
        listQueue.offer(new Customer("05", "Văn E", "16h", ""));
        listQueue.offer(new Customer("06", "Văn F", "17h", ""));
        listQueue.offer(new Customer("07", "Văn G", "18h", ""));
        listQueue.offer(new Customer("08", "Nguyễn Tiến", "19h", "toichuabietyeu"));
        listQueue.offer(new Customer("09", "Văn I", "20h", ""));
        listQueue.offer(new Customer("00", "Văn J", "21h", ""));

        // Bài 1: Sử dụng đối tượng iterator để duyệt và lấy các phần tử trong 1 list ra hiển thị
//        displayQueue(listQueue);

        // Bài 2: Nếu music chờ đang nghe là tôi chưa biết yêu thì hiển thị ra
        findCustomer(listQueue);
    }

}
