package Bai7;

import java.util.Scanner;
class Nguoi {
    protected String hoTen_323;
    protected String ngaySinh_323;
    protected String queQuan_323;

    public void nhap(Scanner sc) {
        System.out.print("Nhap ho ten: ");
        hoTen_323 = sc.nextLine();
        System.out.print("Nhap ngay sinh (dd/mm/yyyy): ");
        ngaySinh_323 = sc.nextLine();
        System.out.print("Nhap que quan: ");
        queQuan_323 = sc.nextLine();
    }

    public void hienThi() {
        System.out.println("Ho ten: " + hoTen_323);
        System.out.println("Ngay sinh: " + ngaySinh_323);
        System.out.println("Que quan: " + queQuan_323);
    }

    public String getNgaySinh() {
        return ngaySinh_323;
    }

    public String getQueQuan() {
        return queQuan_323;
    }
}

