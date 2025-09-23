package Bai4;
import java.util.ArrayList;
import java.util.Scanner;
class TuyenSinh {
    private ArrayList<ThiSinh> dsThiSinh_323 = new ArrayList<>();
    private Scanner sc_323 = new Scanner(System.in);

    // Nhập thí sinh
    public void nhapThiSinh() {
        System.out.print("Nhap SBD: ");
        String sbd_323 = sc_323.nextLine();
        System.out.print("Nhap ho ten: ");
        String hoTen_323 = sc_323.nextLine();
        System.out.print("Nhap dia chi: ");
        String diaChi_323 = sc_323.nextLine();
        System.out.print("Nhap dien uu tien: ");
        String uuTien_323 = sc_323.nextLine();
        System.out.print("Chon khoi (A/B/C): ");
        String khoi_323 = sc_323.nextLine();

        ThiSinh ts_323 = null;
        if (khoi_323.equalsIgnoreCase("A")) {
            ts_323 = new ThiSinhKhoiA(sbd_323, hoTen_323, diaChi_323, uuTien_323);
        } else if (khoi_323.equalsIgnoreCase("B")) {
            ts_323 = new ThiSinhKhoiB(sbd_323, hoTen_323, diaChi_323, uuTien_323);
        } else if (khoi_323.equalsIgnoreCase("C")) {
            ts_323 = new ThiSinhKhoiC(sbd_323, hoTen_323, diaChi_323, uuTien_323);
        }

        if (ts_323 != null) {
            dsThiSinh_323.add(ts_323);
            System.out.println("==> Da them thi sinh thanh cong!");
        } else {
            System.out.println("Khoi khong hop le!");
        }
    }

    // Tìm kiếm theo số báo danh
    public void timKiemTheoSBD() {
        System.out.print("Nhap SBD can tim: ");
        String sbdTim_323 = sc_323.nextLine();
        for (ThiSinh ts : dsThiSinh_323) {
            if (ts.getSbd_323().equalsIgnoreCase(sbdTim_323)) {
                ts.hienThi();
                return;
            }
        }
        System.out.println("Khong tim thay thi sinh co SBD = " + sbdTim_323);
    }

    // Hiển thị tất cả
    public void hienThiTatCa() {
        if (dsThiSinh_323.isEmpty()) {
            System.out.println("Chua co thi sinh nao.");
        } else {
            for (ThiSinh ts : dsThiSinh_323) {
                ts.hienThi();
                System.out.println("-------------------");
            }
        }
    }
}
