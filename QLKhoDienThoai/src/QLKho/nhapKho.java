
package QLKho;


public class nhapKho extends dienThoai{
    private int soLuongNhap;
    private String ngayNhap;

    public nhapKho(int soLuongNhap, String ngayNhap) {
        this.soLuongNhap = soLuongNhap;
        this.ngayNhap=ngayNhap;
    }
   
   nhapKho(){}
   nhapKho(String tenDT, String hangDT, int namSX, int iD, int soLuong, int giaDT, int soLuongNhap, String ngayNhap){
       super(tenDT, hangDT, namSX, iD, soLuong, giaDT);
       this.soLuongNhap=soLuongNhap;
       this.ngayNhap=ngayNhap;
   }
    public int getSoLuongNhap() {
        return soLuongNhap;
    }

    public void setSoLuongNhap(int soLuongNhap) {
        this.soLuongNhap = soLuongNhap;
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
            ), (super.toString().length())-1)+ ", soLuongNhap="+soLuongNhap + ", NgayNhap="+ ngayNhap+"]");
    }

    
    
    
   
}
