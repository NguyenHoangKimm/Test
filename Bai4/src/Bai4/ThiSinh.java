package Bai4;
class ThiSinh {
    protected String sbd_323;
    protected String hoTen_323;
    protected String diaChi_323;
    protected String uuTien_323;

    public ThiSinh(String sbd_323, String hoTen_323, String diaChi_323, String uuTien_323) {
        this.sbd_323 = sbd_323;
        this.hoTen_323 = hoTen_323;
        this.diaChi_323 = diaChi_323;
        this.uuTien_323 = uuTien_323;
    }

    public String getSbd_323() {
        return sbd_323;
    }

    public void hienThi() {
        System.out.println("SBD: " + sbd_323 + ", Ho ten: " + hoTen_323 + 
                ", Đia chi: " + diaChi_323 + ", Uu tien: " + uuTien_323);
    }
}