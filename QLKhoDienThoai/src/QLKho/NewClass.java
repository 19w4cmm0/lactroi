
package QLKho;

import java.util.Scanner;
public class NewClass {

    public static void menu(){
        danhSachDienThoai dsdt = new danhSachDienThoai();
        danhSachNhapKho dsnk = new danhSachNhapKho();
        danhSachXuatKho dsxk = new danhSachXuatKho();
        Scanner sc = new Scanner(System.in);
        boolean luachon=true;
        do{
        System.out.println("#1.Danh sach dien thoai");
        System.out.println("#2.Search dien thoai");
        System.out.println("#3.Nhap kho");
        System.out.println("#4.Xuat kho");
        System.out.println("#5.Add mau dien thoai moi");
        System.out.println("#6.Xoa dien thoai");
        System.out.println("#7.Kiem tra dien thoai co ton tai trong kho hay khong");
        System.out.println("#8.Sap xep dien thoai theo gia");
        System.out.println("Chon chuc nang");
        System.out.println("+--------------------------------+");
        
        int chon = sc.nextInt();
        sc.nextLine();
        switch(chon){
            
            case 1 -> { 
                dsdt.inDanhSachDienThoai();
            }              
            case 2 -> {
                System.out.println("Nhap ten dien thoai: ");
                String tenDT = sc.nextLine();
                System.out.println("Ket qua tim kiem: ");
                dsdt.searchDT(tenDT);
            }
            case 3 -> {
                System.out.println("Nhap ten dien thoai: ");
                String tenDT = sc.nextLine();
                System.out.println("Nhap hang dien thoai: ");
                String hangDT = sc.nextLine();
                System.out.println("Nhap nam san xuat: ");
                int namSX = sc.nextInt();
                System.out.println("Nhap ID: ");
                int iD = sc.nextInt();
                System.out.println("Nhap so luong: ");
                int soLuong = sc.nextInt();
                 System.out.println("Nhap don gia dien thoai: ");
                int giaDT = sc.nextInt();
                System.out.println("So luong nhap: ");
                int soLuongNhap = sc.nextInt();
                System.out.println("nhap ngay nhap hang: ");
                String ngayNhap = sc.nextLine();
                nhapKho nk = new nhapKho(tenDT, hangDT, namSX, iD, soLuong, giaDT, soLuongNhap, ngayNhap);
                dsnk.themNhapKho(nk);
                dsnk.inDanhSachNhapKho();
              
                    
                
            }
            case 4 -> {
                System.out.println("Nhap ten dien thoai: ");
                String tenDT = sc.nextLine();
                System.out.println("Nhap hang dien thoai: ");
                String hangDT = sc.nextLine();
                System.out.println("Nhap nam san xuat: ");
                int namSX = sc.nextInt();
                System.out.println("Nhap ID: ");
                int iD = sc.nextInt();
                System.out.println("Nhap so luong: ");
                int soLuong = sc.nextInt();
                System.out.println("So luong: ");
                int soLuongNhap = sc.nextInt();
                System.out.println("Nhap gia dien thoai: ");
                int giaDT = sc.nextInt();
                System.out.println("So luong xuat hang: ");
                int soLuongXuat = sc.nextInt();
                System.out.println("nhap ngay xuat hang: ");
                String ngayXuat = sc.nextLine();
                xuatKho nx = new xuatKho(tenDT, hangDT, namSX, iD, soLuong, giaDT, soLuongXuat, ngayXuat);
                dsxk.themXuatKho(nx);
                dsxk.inDanhSachXuatKho();
                }
        
            case 5 -> {
                System.out.println("Nhap ten dien thoai: ");
                String tenDT = sc.nextLine();
                System.out.println("Nhap hang dien thoai: ");
                String hangDT = sc.nextLine();
                System.out.println("Nhap nam san xuat: ");
                int namSX = sc.nextInt();
                System.out.println("Nhap ID: ");
                int iD = sc.nextInt();
                System.out.println("Nhap so luong: ");
                int soLuong = sc.nextInt();
                System.out.println("Nhap gia dien thoai: ");
                int giaDT = sc.nextInt();
                dienThoai dt = new dienThoai(tenDT, hangDT, namSX, iD, soLuong, giaDT);
                dsdt.themDienThoai(dt);
                
            }
            case 6 -> {
                System.out.println("Nhap id can xoa: ");
                int iD = sc.nextInt();
                dienThoai dt = new dienThoai(iD);
                System.out.println("Xoa dien thoai trong danh sach: "+dsdt.xoaDT(dt));
            }
            case 7 ->  {
                System.out.println("Nhap ID dien thoai: ");
                int iD = sc.nextInt();
                dienThoai dt = new dienThoai(iD);
                System.out.println("Kiem tra dien thoai co trong kho: " + dsdt.kiemTraTonTai(dt));
            }
            case 8 -> {
                dsdt.sxDT();
                dsdt.inDanhSachDienThoai();
            }
            default -> System.exit(0);              
        }      
    }while(luachon);
    }
    public static void main(String[] args) {
        System.out.println("+----------------------------------+");
        menu();
    }
}
