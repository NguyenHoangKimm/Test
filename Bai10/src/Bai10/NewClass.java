package Bai10;
import java.util.Scanner;

class BienLai {
    private KhachHang khachHang_323;
    private int chiSoCu_323;
    private int chiSoMoi_323;
    private double soTien_323;

    public void nhap(Scanner sc) {
        khachHang_323 = new KhachHang();
        System.out.println("\n=== Nhap thong tin khach hang ===");
        khachHang_323.nhap(sc);

        System.out.print("Nhap chi so cu: ");
        chiSoCu_323 = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap chi so moi: ");
        chiSoMoi_323 = Integer.parseInt(sc.nextLine());

        tinhTien();
    }

    private void tinhTien() {
        soTien_323 = (chiSoMoi_323 - chiSoCu_323) * 750;
    }

    public void hienThi() {
        khachHang_323.hienThi();
        System.out.println("Chi so cu: " + chiSoCu_323);
        System.out.println("Chi so moi: " + chiSoMoi_323);
        System.out.println("So tien phai tra: " + soTien_323 + " VND");
    }
}
