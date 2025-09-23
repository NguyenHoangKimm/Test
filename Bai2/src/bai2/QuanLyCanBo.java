package bai2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class QuanLyCanBo {
    private List<CanBo> danhSachCanBo_323 = new ArrayList<>();
    private Scanner sc_323 = new Scanner(System.in);
    public void nhapCanBo_323() {
        System.out.println("Chon loai can bo: 1. Cong nhan | 2. Ky su | 3. Nhan vien");
        int chon_323 = Integer.parseInt(sc_323.nextLine());
        System.out.print("Họ ten: ");
        String hoTen_323 = sc_323.nextLine();
        System.out.print("Ngay sinh: ");
        String ngaySinh_323 = sc_323.nextLine();
        System.out.print("Gioi tinh: ");
        String gioiTinh_323 = sc_323.nextLine();
        System.out.print("Đia chi: ");
        String diaChi_323 = sc_323.nextLine();
        switch (chon_323) {
            case 1:
                System.out.print("Nhap bac cong nhan (1-7): ");
                int bac_323 = Integer.parseInt(sc_323.nextLine());
                danhSachCanBo_323.add(new CongNhan(hoTen_323, ngaySinh_323, gioiTinh_323, diaChi_323, bac_323));
                break;
            case 2:
                System.out.print("Nganh dao tao: ");
                String nganhDaoTao_323 = sc_323.nextLine();
                danhSachCanBo_323.add(new KySu(hoTen_323, ngaySinh_323, gioiTinh_323, diaChi_323, nganhDaoTao_323));
                break;
            case 3:
                System.out.print("Cong viec: ");
                String congViec_323 = sc_323.nextLine();
                danhSachCanBo_323.add(new NhanVien(hoTen_323, ngaySinh_323, gioiTinh_323, diaChi_323, congViec_323));
                break;
            default:
                System.out.println("Lua chon khong hop le!");
        }
    }
    public void timKiemTheoTen_323(String ten_323) {
        boolean found_323 = false;
        for (CanBo cb_323 : danhSachCanBo_323) {
            if (cb_323.getHoTen_323().equalsIgnoreCase(ten_323)) {
                cb_323.hienThiThongTin_323();
                found_323 = true;
            }
        }
        if (!found_323) {
            System.out.println("Khong tim thay can bo co ten: " + ten_323);
        }
    }
    public void hienThiTatCa_323() {
        for (CanBo cb_323 : danhSachCanBo_323) {
            cb_323.hienThiThongTin_323();
            System.out.println("------------------");
        }
    }
}

