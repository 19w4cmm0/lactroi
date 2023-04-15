
package QLKho2;

import java.util.Scanner;

public class samSung extends dienThoai{
     private int chucNangSuDung;
     private int loaiManHinh;
     private String maSS;
    public samSung(){
    super();
    }
    public samSung(String tenDT,int namSX, int moDel, int soLuong, int chucNangSuDung, int loaiManHinh, String maSS){
        super(tenDT, namSX, moDel, soLuong);
        this.chucNangSuDung=chucNangSuDung;
        this.loaiManHinh=loaiManHinh;
        this.maSS=maSS;
    }

    public String getChucNangSuDung() {
        if(chucNangSuDung ==1)
            return "Gaming phone";
        else if(chucNangSuDung==0)
            return "Smart phone thuong";
        else return null;
    }

    public void setChucNangSuDung(int chucNangSuDung) {
        this.chucNangSuDung = chucNangSuDung;
    }

    public String getLoaiManHinh() {
        if(loaiManHinh ==1)
           return "man hinh gap";
        else if(loaiManHinh==0)
           return "man hinh phang";
        else return null;
    }

    public void setLoaiManHinh(int loaiManHinh) {
        this.loaiManHinh = loaiManHinh;
    }

    public String getMaSS() {
        return maSS;
    }

    public void setMaSS(String maSS) {
        this.maSS = maSS;
    }
    
    @Override 
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.println("Chuc nang su dung(Gaming phone: 1/Tac vu thong thuong: 0)");
        chucNangSuDung = sc.nextInt();
        System.out.println("Loai man hinh(man hinh gap: 1/ man hinh phang: 0)");
        loaiManHinh = sc.nextInt();
    }

    @Override
    public void hien(){
        super.hien();
        System.out.println("samSung{" + "chucNangSuDung=" + getChucNangSuDung() + ", loaiManHinh=" + getLoaiManHinh() + ", maSS=" + getMaSS() + "}");
    }

    
    
    
}
