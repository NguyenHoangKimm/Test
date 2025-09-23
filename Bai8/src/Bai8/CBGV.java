package com.mycompany.baitapontapjava.Bai8;

import java.util.Scanner;
class CBGV extends Nguoi {
    private double luongCung_323;
    private double thuong_323;
    private double phat_323;
    private double luongThucLinh_323;

    @Override
    public void nhap(Scanner sc) {
        super.nhap(sc);
        System.out.print("Nhap luong cung: ");
        luongCung_323 = Double.parseDouble(sc.nextLine());
        System.out.print("Nhap thuong: ");
        thuong_323 = Double.parseDouble(sc.nextLine());
        System.out.print("Nhap phat: ");
        phat_323 = Double.parseDouble(sc.nextLine());
        tinhLuong();
    }

    private void tinhLuong() {
        luongThucLinh_323 = luongCung_323 + thuong_323 - phat_323;
    }

    @Override
    public void hienThi() {
        super.hienThi();
        System.out.println("Luong cung: " + luongCung_323);
        System.out.println("Thuong: " + thuong_323);
        System.out.println("Phat: " + phat_323);
        System.out.println("Luong thuc linh: " + luongThucLinh_323);
    }

    public double getLuongThucLinh() {
        return luongThucLinh_323;
    }
}