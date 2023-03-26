
package QLKho;


public class nhapKho extends dienThoai{
    private int soLuongNhap;
    private int donGia;
    private String ngayNhap;

    public nhapKho(int soLuongNhap, int donGia, String ngayNhap) {
        this.soLuongNhap = soLuongNhap;
        this.donGia = donGia;
        this.ngayNhap=ngayNhap;
    }
   
   nhapKho(){}
   nhapKho(String tenDT, String hangDT, int namSX, int iD, int soLuong, int soLuongNhap, int donGia, String ngayNhap){
       super(tenDT, hangDT, namSX, iD, soLuong);
       this.soLuongNhap=soLuongNhap;
       this.donGia=donGia;
       this.ngayNhap=ngayNhap;
   }
    public int getSoLuongNhap() {
        return soLuongNhap;
    }

    public void setSoLuongNhap(int soLuongNhap) {
        this.soLuongNhap = soLuongNhap;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public String getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(String ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    @Override
    public String toString() {
        return(this.getClass().getName()+" ["+super.toString().substring((this.getClass().getSuperclass().getName().length()-3
            ), (super.toString().length())-1)+ ", soLuongNhap="+soLuongNhap +", donGia="+donGia + ", NgayNhap="+ ngayNhap+"]");
    }

    
    
    
   
}
