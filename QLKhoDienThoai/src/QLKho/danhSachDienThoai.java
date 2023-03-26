
package QLKho;

import java.util.ArrayList;

public class danhSachDienThoai{
    private ArrayList<dienThoai> danhSach;

    public danhSachDienThoai(ArrayList<dienThoai> danhSach) {
        this.danhSach = danhSach;
    }

    public danhSachDienThoai() {
        this.danhSach = new ArrayList<dienThoai>();
    }
    
    public void themDienThoai(dienThoai dt){
        this.danhSach.add(dt);
    }
    public void inDanhSachDienThoai(){
        for( dienThoai DienThoai : danhSach){
            System.out.println(DienThoai);
            
        }
    } 
    public boolean kiemTraTonTai(dienThoai dt){
        return this.danhSach.contains(dt);
    }
    public void searchDT(String tenDT){
        for ( dienThoai DienThoai : danhSach){
            if(DienThoai.getTenDT().indexOf(tenDT)>=0){
                System.out.println(DienThoai);
            }
        }
    }
    public boolean xoaDT(dienThoai dt){
        return this.danhSach.remove(dt);
    }
}
