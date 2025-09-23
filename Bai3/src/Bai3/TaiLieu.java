package Bai3;
class TaiLieu {
    private String maTaiLieu_323;
    private String tenNXB_323;
    private int soBanPhatHanh_323;

    public TaiLieu(String maTaiLieu_323, String tenNXB_323, int soBanPhatHanh_323) {
        this.maTaiLieu_323 = maTaiLieu_323;
        this.tenNXB_323 = tenNXB_323;
        this.soBanPhatHanh_323 = soBanPhatHanh_323;
    }

    public String getMaTaiLieu_323() { return maTaiLieu_323; }
    public void setMaTaiLieu_323(String maTaiLieu_323) { this.maTaiLieu_323 = maTaiLieu_323; }

    public String getTenNXB_323() { return tenNXB_323; }
    public void setTenNXB_323(String tenNXB_323) { this.tenNXB_323 = tenNXB_323; }

    public int getSoBanPhatHanh_323() { return soBanPhatHanh_323; }
    public void setSoBanPhatHanh_323(int soBanPhatHanh_323) { this.soBanPhatHanh_323 = soBanPhatHanh_323; }

    public void hienThiThongTin() {
        System.out.println("Ma tai lieu: " + maTaiLieu_323);
        System.out.println("Nha xuat ban: " + tenNXB_323);
        System.out.println("So ban phat hanh: " + soBanPhatHanh_323);
    }
}
