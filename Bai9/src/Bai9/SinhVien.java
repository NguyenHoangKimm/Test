
package com.mycompany.baitapontapjava.Bai9;
import java.util.Scanner;
class SinhVien {
    private String hoTen_323;
    private String maSV_323;
    private String ngaySinh_323;
    private String lop_323;

    public void nhap(Scanner sc) {
        System.out.print("Nhap ho ten: ");
        hoTen_323 = sc.nextLine();
        System.out.print("Nhap ma sinh vien: ");
        maSV_323 = sc.nextLine();
        System.out.print("Nhap ngay sinh (dd/mm/yyyy): ");
        ngaySinh_323 = sc.nextLine();
        System.out.print("Nhap lop: ");
        lop_323 = sc.nextLine();
    }

    public void hienThi() {
        System.out.println("Ho ten: " + hoTen_323);
        System.out.println("Ma SV: " + maSV_323);
        System.out.println("Ngay sinh: " + ngaySinh_323);
        System.out.println("Lop: " + lop_323);
    }

    public String getHoTen() {
        return hoTen_323;
    }
}
