package bai2;
public class CanBo {
     private String hoTen_323;
    private String ngaySinh_323;
    private String gioiTinh_323;
    private String diaChi_323;

    public CanBo() {}

    public CanBo(String hoTen_323, String ngaySinh_323, String gioiTinh_323, String diaChi_323) {
        this.hoTen_323 = hoTen_323;
        this.ngaySinh_323 = ngaySinh_323;
        this.gioiTinh_323 = gioiTinh_323;
        this.diaChi_323 = diaChi_323;
    }
    public String getHoTen_323() { return hoTen_323; }
    public void setHoTen_323(String hoTen_323) { this.hoTen_323 = hoTen_323; }

    public String getNgaySinh_323() { return ngaySinh_323; }
    public void setNgaySinh_323(String ngaySinh_323) { this.ngaySinh_323 = ngaySinh_323; }

    public String getGioiTinh_323() { return gioiTinh_323; }
    public void setGioiTinh_323(String gioiTinh_323) { this.gioiTinh_323 = gioiTinh_323; }

    public String getDiaChi_323() { return diaChi_323; }
    public void setDiaChi_323(String diaChi_323) { this.diaChi_323 = diaChi_323; }

    public void hienThiThongTin_323() {
        System.out.println("Ho ten: " + hoTen_323);
        System.out.println("Ngay sinh: " + ngaySinh_323);
        System.out.println("Gioi tinh: " + gioiTinh_323);
        System.out.println("Đia chi: " + diaChi_323);
    }
}
