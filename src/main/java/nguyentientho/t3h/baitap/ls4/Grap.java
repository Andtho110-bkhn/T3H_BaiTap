package nguyentientho.t3h.baitap.ls4;
 
public class Grap implements GrapInterface {
 
    protected String ten;
    protected long luong;
     
    public Grap() { 
    }
     
    public Grap(String ten) {
        this.ten = ten;
    }

    @Override
    public String loaiXe() {
        // Lớp con ghi đè để lấy loại xe
        return "Xe";
    }
    
    @Override
    public void tinhTien() {
        // Lớp con ghi đè để tính giá cuốc xe
    }
     
    @Override
    public void thongTinXe() {
        System.out.println("===== Tài xế: " + ten + " =====");
        System.out.println("- Loại xe: " + loaiXe());
        System.out.println("- Tiền cuốc: " + luong + " VND");
    }
}