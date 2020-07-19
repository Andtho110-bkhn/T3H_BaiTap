package nguyentientho.t3h.baitap.ls6.bai3;

/**
 * @project: T3H_JAVA2002E_BaiTap
 * @author: Nguyễn Tiến Thọ
 */
public class Menu {
    public int id;
    public String name;
    public int parentId;

    public Menu() {
    }

    public Menu(int id, String name, int parentId) {
        this.id = id;
        this.name = name;
        this.parentId = parentId;
    }
}
