package Bai4;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        TuyenSinh ts_323 = new TuyenSinh();
        Scanner sc_323 = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Nhap thi sinh moi");
            System.out.println("2. Tim kiem theo SBD");
            System.out.println("3. Hien thi tat ca thi sinh");
            System.out.println("4. Thoat");
            System.out.print("Chon: ");
            int chon_323 = Integer.parseInt(sc_323.nextLine());

            switch (chon_323) {
                case 1:
                    ts_323.nhapThiSinh();
                    break;
                case 2:
                    ts_323.timKiemTheoSBD();
                    break;
                case 3:
                    ts_323.hienThiTatCa();
                    break;
                case 4:
                    System.out.println("Ket thuc chương trinh.");
                    return;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        }
    }
}
