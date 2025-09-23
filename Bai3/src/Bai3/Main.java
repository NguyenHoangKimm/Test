package Bai3;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        QuanLySach ql_323 = new QuanLySach();
        Scanner sc_323 = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Nhap tai lieu moi");
            System.out.println("2. Tim kiem theo ma");
            System.out.println("3. Tìm kiem theo loai (sach/tapchi/bao)");
            System.out.println("4. Hien thi tat ca");
            System.out.println("5. Thoat");
            System.out.print("Chon: ");
            int chon_323 = Integer.parseInt(sc_323.nextLine());

            switch (chon_323) {
                case 1:
                    ql_323.nhapTaiLieu();
                    break;
                case 2:
                    System.out.print("Nhap ma tai lieu can tim: ");
                    String ma_323 = sc_323.nextLine();
                    ql_323.timKiemTheoMa(ma_323);
                    break;
                case 3:
                    System.out.print("Nhap loai tai lieu can tim (sach/tapchi/bao): ");
                    String loai_323 = sc_323.nextLine();
                    ql_323.timKiemTheoLoai(loai_323);
                    break;
                case 4:
                    ql_323.hienThiTatCa();
                    break;
                case 5:
                    System.out.println("Ket thuc chuong trinh.");
                    return;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        }
    }
}