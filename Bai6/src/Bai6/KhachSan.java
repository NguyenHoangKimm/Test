package Bai6;
import java.util.ArrayList;
import java.util.Scanner;
class KhachSan {
    private ArrayList<KhachTro> dsKhach_323 = new ArrayList<>();
    private Scanner sc_323 = new Scanner(System.in);

    // Nhập khách trọ
    public void nhapKhach() {
        System.out.print("Nhap ho ten: ");
        String ten_323 = sc_323.nextLine();
        System.out.print("Nhap ngay sinh: ");
        String ngaySinh_323 = sc_323.nextLine();
        System.out.print("Nhap CMND: ");
        String cmnd_323 = sc_323.nextLine();

        System.out.print("Nhap so ngay tro: ");
        int soNgay_323 = Integer.parseInt(sc_323.nextLine());
        System.out.print("Nhap loai phong: ");
        String loaiPhong_323 = sc_323.nextLine();
        System.out.print("Nhap gia phong/ngay: ");
        double giaPhong_323 = Double.parseDouble(sc_323.nextLine());

        Nguoi nguoi_323 = new Nguoi(ten_323, ngaySinh_323, cmnd_323);
        KhachTro khach_323 = new KhachTro(nguoi_323, soNgay_323, loaiPhong_323, giaPhong_323);

        dsKhach_323.add(khach_323);
        System.out.println("==> Đa them khach tro thanh cong!");
    }

    // Hiển thị danh sách khách trọ
    public void hienThiDS() {
        if (dsKhach_323.isEmpty()) {
            System.out.println("Chua co khach tro nao.");
        } else {
            for (KhachTro k : dsKhach_323) {
                k.hienThi();
                System.out.println("-----------------------");
            }
        }
    }

    // Xóa khách theo CMND
    public void xoaKhach() {
        System.out.print("Nhap CMND khach can xoa: ");
        String cmnd_323 = sc_323.nextLine();
        KhachTro khachXoa_323 = null;
        for (KhachTro k : dsKhach_323) {
            if (k.getCmnd_323().equalsIgnoreCase(cmnd_323)) {
                khachXoa_323 = k;
                break;
            }
        }
        if (khachXoa_323 != null) {
            dsKhach_323.remove(khachXoa_323);
            System.out.println("==> Đa xoa khach co CMND: " + cmnd_323);
        } else {
            System.out.println("Khong tim thay khach co CMND nay.");
        }
    }

    // Tính tiền trả phòng
    public void tinhTien() {
        System.out.print("Nhap CMND khach can tinh tien: ");
        String cmnd_323 = sc_323.nextLine();
        for (KhachTro k : dsKhach_323) {
            if (k.getCmnd_323().equalsIgnoreCase(cmnd_323)) {
                System.out.println("So tien phai tra: " + k.tinhTien() + " VND");
                return;
            }
        }
        System.out.println("Khong tim thay khach co CMND nay.");
    }
}
