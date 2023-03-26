
package QLKho;

import java.util.Objects;

public class dienThoai {
    private String tenDT;
    private String hangDT;
    private int namSX;
    private int iD;
    private int soLuong;

    public dienThoai(int iD) {
        this.iD = iD;
    }
   
   dienThoai(){}
   dienThoai(String tenDT, String hangDT, int namSX, int iD, int soLuong){
       super();
       this.hangDT=hangDT;
       this.namSX=namSX;
       this.tenDT=tenDT;
       this.iD=iD;
       this.soLuong=soLuong;
       
   }

    public String getTenDT() {
        return tenDT;
    }

    public void setTenDT(String tenDT) {
        this.tenDT = tenDT;
    }

    public String getHangDT() {
        return hangDT;
    }

    public void setHangDT(String hangDT) {
        this.hangDT = hangDT;
    }

    public int getNamSX() {
        return namSX;
    }

    public void setNamSX(int namSX) {
        this.namSX = namSX;
    }

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    @Override
    public String toString() {
        return "dienThoai{" + "tenDT=" + tenDT + ", hangDT=" + hangDT + ", namSX=" + namSX + ", iD=" + iD + ", soLuong=" + soLuong + '}';
    }
    
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        dienThoai other = (dienThoai) obj;
        return Objects.equals(this.iD, other.iD);
    }
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + this.iD;
        return hash;
    }
    
}
