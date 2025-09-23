package bai2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        QuanLyCanBo qlcb_323 = new QuanLyCanBo();
        Scanner sc_323 = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Nhap can bo moi");
            System.out.println("2. Tim kiem theo ho ten");
            System.out.println("3. Hien thi toan bo can bo");
            System.out.println("4. Thoat");
            System.out.print("Chon: ");
            int chon_323 = Integer.parseInt(sc_323.nextLine());

            switch (chon_323) {
                case 1:
                    qlcb_323.nhapCanBo_323();
                    break;
                case 2:
                    System.out.print("Nhap ten can tim: ");
                    String ten_323 = sc_323.nextLine();
                    qlcb_323.timKiemTheoTen_323(ten_323);
                    break;
                case 3:
                    qlcb_323.hienThiTatCa_323();
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
