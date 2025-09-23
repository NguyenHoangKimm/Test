package com.mycompany.baitapontapjava.Bai9;
import java.util.Scanner;
class TheMuon {
    private String soPhieuMuon_323;
    private String ngayMuon_323;
    private String hanTra_323;
    private String soHieuSach_323;
    private String tenSach_323;
    private SinhVien sv; // thông tin sinh viên mượn sách
    public void nhap(Scanner sc) {
        sv = new SinhVien();
        System.out.println("=== Nhap thong tin sinh vien ===");
        sv.nhap(sc);
        System.out.println("=== Nhap thong tin the muon ===");
        System.out.print("Nhap so phieu muon: ");
        soPhieuMuon_323 = sc.nextLine();
        System.out.print("Nhap ngay muon (dd/mm/yyyy): ");
        ngayMuon_323 = sc.nextLine();
        System.out.print("Nhap han tra (dd/mm/yyyy): ");
        hanTra_323 = sc.nextLine();
        System.out.print("Nhap so hieu sach: ");
        soHieuSach_323 = sc.nextLine();
        System.out.print("Nhap ten sach: ");
        tenSach_323 = sc.nextLine();
    }
    public void hienThi() {
        sv.hienThi();
        System.out.println("So phieu muon: " + soPhieuMuon_323);
        System.out.println("Ngay muon: " + ngayMuon_323);
        System.out.println("Han tra: " + hanTra_323);
        System.out.println("So hieu sach: " + soHieuSach_323);
        System.out.println("Ten sach: " + tenSach_323);
    }
    public String getHanTra() {
        return hanTra_323;
    }
    public String getTenSach() {
        return tenSach_323;
    }
    public SinhVien getSinhVien() {
        return sv;
    }
}
