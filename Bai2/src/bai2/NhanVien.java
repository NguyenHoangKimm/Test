package bai2;
class NhanVien extends CanBo {
    private String congViec_323;

    public NhanVien(String hoTen_323, String ngaySinh_323, String gioiTinh_323, String diaChi_323, String congViec_323) {
        super(hoTen_323, ngaySinh_323, gioiTinh_323, diaChi_323);
        this.congViec_323 = congViec_323;
    }

    public String getCongViec_323() { return congViec_323; }
    public void setCongViec_323(String congViec_323) { this.congViec_323 = congViec_323; }

    @Override
    public void hienThiThongTin_323() {
        super.hienThiThongTin_323();
        System.out.println("Cong viec: " + congViec_323);
    }
}
