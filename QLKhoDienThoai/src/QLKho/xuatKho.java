
package QLKho;


public class xuatKho extends dienThoai{
    private int soLuongXuat;
    private String ngayXuat;

    public xuatKho(int soLuongXuat, String ngayXuat) {
        this.soLuongXuat = soLuongXuat;
        this.ngayXuat=ngayXuat;
    }
   
   xuatKho(){}
   xuatKho(String tenDT, String hangDT, int namSX, int iD, int soLuong, int giaDT ,int soLuongXuat ,String ngayXuat){
       super(tenDT, hangDT, namSX, iD, soLuong, giaDT);
       this.soLuongXuat=soLuongXuat;
       this.ngayXuat=ngayXuat;
   }

    public int getSoLuongXuat() {
        return soLuongXuat;
    }

    public void setSoLuongXuat(int soLuongXuat) {
        this.soLuongXuat = soLuongXuat;
    }

    public String getNgayXuat() {
        return ngayXuat;
    }

    public void setNgayXuat(String ngayXuat) {
        this.ngayXuat = ngayXuat;
    }
  

    @Override
    public String toString() {
        return(this.getClass().getName()+" ["+super.toString().substring((this.getClass().getSuperclass().getName().length()-3
            ), (super.toString().length())-1)+ ", soLuongXuat="+soLuongXuat +", NgayXuat="+ ngayXuat+"]");
    }

    
    
}
