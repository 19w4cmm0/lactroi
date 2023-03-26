
package QLKho;

import java.util.ArrayList;

public class danhSachXuatKho {
    private ArrayList<xuatKho> danhSachXuat;
    public danhSachXuatKho(ArrayList<xuatKho> danhSachXuat) {
        this.danhSachXuat = danhSachXuat;
    }

    public danhSachXuatKho() {
        this.danhSachXuat = new ArrayList<xuatKho>();
    }
    public void themXuatKho(xuatKho xk){
        this.danhSachXuat.add(xk);
    }
    public void inDanhSachXuatKho(){
        for( xuatKho XuatKho : danhSachXuat){
            System.out.println(XuatKho);
        }
    }
}
