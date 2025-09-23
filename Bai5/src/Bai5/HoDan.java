package Bai5;

import java.util.ArrayList;
import java.util.Scanner;
class HoDan {
    private int soNha_323;
    private ArrayList<Nguoi> dsNguoi_323 = new ArrayList<>();

    public HoDan(int soNha_323) {
        this.soNha_323 = soNha_323;
    }

    public void nhapHoDan(Scanner sc_323) {
        System.out.print("Nhap so thanh vien trong ho: ");
        int soTV_323 = Integer.parseInt(sc_323.nextLine());
        for (int i = 0; i < soTV_323; i++) {
            System.out.println("==> Nhap thong tin thanh vien thu " + (i + 1));
            System.out.print("Ho ten: ");
            String ten_323 = sc_323.nextLine();
            System.out.print("Nam sinh: ");
            int namSinh_323 = Integer.parseInt(sc_323.nextLine());
            System.out.print("Nghe nghiep: ");
            String nghe_323 = sc_323.nextLine();

            dsNguoi_323.add(new Nguoi(ten_323, namSinh_323, nghe_323));
        }
    }

    public boolean coNguoi80Tuoi() {
        for (Nguoi n : dsNguoi_323) {
            if (n.getTuoi() == 80) {
                return true;
            }
        }
        return false;
    }

    public void hienThi() {
        System.out.println("==> Ho so nha: " + soNha_323);
        for (Nguoi n : dsNguoi_323) {
            n.hienThi();
        }
    }
}
