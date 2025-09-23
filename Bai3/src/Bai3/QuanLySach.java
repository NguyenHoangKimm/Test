
package Bai3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class QuanLySach {
    private List<TaiLieu> danhSachTaiLieu_323 = new ArrayList<>();
    private Scanner sc_323 = new Scanner(System.in);

    // Nhập thông tin tài liệu
    public void nhapTaiLieu() {
        System.out.println("Chon loai tai lieu: 1. Sach | 2. Tap chi | 3. Bao");
        int loai_323 = Integer.parseInt(sc_323.nextLine());

        System.out.print("Ma tai lieu: ");
        String maTaiLieu_323 = sc_323.nextLine();
        System.out.print("Nha xuat ban: ");
        String tenNXB_323 = sc_323.nextLine();
        System.out.print("So ban phat hanh: ");
        int soBanPhatHanh_323 = Integer.parseInt(sc_323.nextLine());

        switch (loai_323) {
            case 1:
                System.out.print("Ten tac gia: ");
                String tenTacGia_323 = sc_323.nextLine();
                System.out.print("So trang: ");
                int soTrang_323 = Integer.parseInt(sc_323.nextLine());
                danhSachTaiLieu_323.add(new Sach(maTaiLieu_323, tenNXB_323, soBanPhatHanh_323, tenTacGia_323, soTrang_323));
                break;
            case 2:
                System.out.print("So phat hanh: ");
                int soPhatHanh_323 = Integer.parseInt(sc_323.nextLine());
                System.out.print("Thang phat hanh: ");
                int thangPhatHanh_323 = Integer.parseInt(sc_323.nextLine());
                danhSachTaiLieu_323.add(new TapChi(maTaiLieu_323, tenNXB_323, soBanPhatHanh_323, soPhatHanh_323, thangPhatHanh_323));
                break;
            case 3:
                System.out.print("Ngay phat hanh: ");
                String ngayPhatHanh_323 = sc_323.nextLine();
                danhSachTaiLieu_323.add(new Bao(maTaiLieu_323, tenNXB_323, soBanPhatHanh_323, ngayPhatHanh_323));
                break;
            default:
                System.out.println("Loai khong ho le!");
        }
    }
    public void timKiemTheoMa(String ma_323) {
        boolean found_323 = false;
        for (TaiLieu tl_323 : danhSachTaiLieu_323) {
            if (tl_323.getMaTaiLieu_323().equalsIgnoreCase(ma_323)) {
                tl_323.hienThiThongTin();
                found_323 = true;
            }
        }
        if (!found_323) {
            System.out.println("Khong tim thay tai lieu co ma: " + ma_323);
        }
    }
    public void timKiemTheoLoai(String loai_323) {
        boolean found_323 = false;
        for (TaiLieu tl_323 : danhSachTaiLieu_323) {
            if ((loai_323.equalsIgnoreCase("sach") && tl_323 instanceof Sach) ||
                (loai_323.equalsIgnoreCase("tapchi") && tl_323 instanceof TapChi) ||
                (loai_323.equalsIgnoreCase("bao") && tl_323 instanceof Bao)) {
                tl_323.hienThiThongTin();
                System.out.println("----------------");
                found_323 = true;
            }
        }
        if (!found_323) {
            System.out.println("Khong co tai lieu thuoc loai: " + loai_323);
        }
    }
    public void hienThiTatCa() {
        for (TaiLieu tl_323 : danhSachTaiLieu_323) {
            tl_323.hienThiThongTin();
            System.out.println("----------------");
        }
    }
}
