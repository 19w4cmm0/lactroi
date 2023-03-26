
package QLKho;

public class nhaCungCap {
    private String ten;
    private String diaChi;
    private int soDienThoai;
    private String matHang;
 
    nhaCungCap(){}
    nhaCungCap(String ten, String diaChi, int soDienThoai, String matHang){
        this.ten=ten;
        this.diaChi=diaChi;
        this.soDienThoai=soDienThoai;
        this.matHang=matHang;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(int soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getMatHang() {
        return matHang;
    }

    public void setMatHang(String matHang) {
        this.matHang = matHang;
    }
}
