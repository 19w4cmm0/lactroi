
package QLKho;

import java.util.ArrayList;

public class danhSachNhapKho {
    private ArrayList<nhapKho> danhSachNhap;
    public danhSachNhapKho(ArrayList<nhapKho> danhSachNhap) {
        this.danhSachNhap = danhSachNhap;
    }

    public danhSachNhapKho() {
        this.danhSachNhap = new ArrayList<nhapKho>();
    }
    public void themNhapKho(nhapKho nk){
        this.danhSachNhap.add(nk);
    }
    public void inDanhSachNhapKho(){
        for( nhapKho NhapKho : danhSachNhap){
            System.out.println(NhapKho);
        }
    }
    
    
    
}
