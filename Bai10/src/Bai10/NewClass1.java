package Bai10;
import java.util.Scanner;

class KhachHang {
    private String hoTenChuHo_323;
    private String soNha_323;
    private String maCongTo_323;

    public void nhap(Scanner sc) {
        System.out.print("Nhap ho ten chu ho: ");
        hoTenChuHo_323 = sc.nextLine();
        System.out.print("Nhap so nha: ");
        soNha_323 = sc.nextLine();
        System.out.print("Nhap ma cong to: ");
        maCongTo_323 = sc.nextLine();
    }

    public void hienThi() {
        System.out.println("Ho ten chu ho: " + hoTenChuHo_323);
        System.out.println("So nha: " + soNha_323);
        System.out.println("Ma cong to: " + maCongTo_323);
    }
}
