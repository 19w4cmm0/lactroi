
package QLKho;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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
    public void sxDT(){
        Collections.sort(this.danhSach, new Comparator<dienThoai>(){
            @Override
            public int compare(dienThoai dt1, dienThoai dt2){
                if(dt1.getGiaDT()<dt2.getGiaDT()){
                    return 1;
                }
                else if(dt1.getGiaDT() > dt2.getGiaDT()){
                    return -1;
                }
                else{
                    return 0;
                }
            }
        });
    }
}
