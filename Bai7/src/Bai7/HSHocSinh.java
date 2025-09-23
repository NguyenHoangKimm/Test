package Bai7;

import java.util.Scanner;
class HSHocSinh extends Nguoi {
    private String lop_323;
    private String khoaHoc_323;
    private String kyHoc_323;

    @Override
    public void nhap(Scanner sc) {
        super.nhap(sc);
        System.out.print("Nhap lop: ");
        lop_323 = sc.nextLine();
        System.out.print("Nhap khoa hoc: ");
        khoaHoc_323 = sc.nextLine();
        System.out.print("Nhap ky hoc: ");
        kyHoc_323 = sc.nextLine();
    }

    @Override
    public void hienThi() {
        super.hienThi();
        System.out.println("Lop: " + lop_323);
        System.out.println("Khoa hoc: " + khoaHoc_323);
        System.out.println("Ky hoc: " + kyHoc_323);
    }

    public String getLop() {
        return lop_323;
    }
}