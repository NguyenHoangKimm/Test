package bai2;
class CongNhan extends CanBo {
    private int bac_323; // bậc công nhân (1–7)

    public CongNhan(String hoTen_323, String ngaySinh_323, String gioiTinh_323, String diaChi_323, int bac_323) {
        super(hoTen_323, ngaySinh_323, gioiTinh_323, diaChi_323);
        this.bac_323 = bac_323;
    }

    public int getBac_323() { return bac_323; }
    public void setBac_323(int bac_323) { this.bac_323 = bac_323; }

    @Override
    public void hienThiThongTin_323() {
        super.hienThiThongTin_323();
        System.out.println("Bac cong nhan: " + bac_323 + "/7");
    }
}
