package Bai5;
import java.util.ArrayList;
import java.util.Scanner;
class KhuPho {
    private ArrayList<HoDan> dsHoDan_323 = new ArrayList<>();

    public void nhapKhuPho() {
        Scanner sc_323 = new Scanner(System.in);
        System.out.print("Nhap so ho dan: ");
        int n_323 = Integer.parseInt(sc_323.nextLine());

        for (int i = 0; i < n_323; i++) {
            System.out.println("\n==> Nhap ho dan thu " + (i + 1));
            System.out.print("Nhap so nha: ");
            int soNha_323 = Integer.parseInt(sc_323.nextLine());

            HoDan ho_323 = new HoDan(soNha_323);
            ho_323.nhapHoDan(sc_323);
            dsHoDan_323.add(ho_323);
        }
    }

    public void hienThiHoCoNguoi80Tuoi() {
        System.out.println("\n===== Cac ho co nguoi 80 tupi =====");
        boolean timThay_323 = false;
        for (HoDan ho : dsHoDan_323) {
            if (ho.coNguoi80Tuoi()) {
                ho.hienThi();
                timThay_323 = true;
            }
        }
        if (!timThay_323) {
            System.out.println("Khong co ho nao co nguoi 80 tuoi.");
        }
    }
}
