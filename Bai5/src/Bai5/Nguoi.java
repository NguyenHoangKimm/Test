package Bai5;
import java.time.LocalDate;
class Nguoi {
    private String hoTen_323;
    private int namSinh_323;
    private String ngheNghiep_323;

    public Nguoi(String hoTen_323, int namSinh_323, String ngheNghiep_323) {
        this.hoTen_323 = hoTen_323;
        this.namSinh_323 = namSinh_323;
        this.ngheNghiep_323 = ngheNghiep_323;
    }

    public int getTuoi() {
        int namHienTai_323 = LocalDate.now().getYear();
        return namHienTai_323 - namSinh_323;
    }

    public void hienThi() {
        System.out.println("Ho ten: " + hoTen_323 + ", Nam sinh: " + namSinh_323 +
                           ", Nghe nghiep: " + ngheNghiep_323 + ", Tuoi: " + getTuoi());
    }
}
