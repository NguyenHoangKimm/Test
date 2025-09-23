package Bai6;
class Nguoi {
    private String hoTen_323;
    private String ngaySinh_323;
    private String cmnd_323;

    public Nguoi(String hoTen_323, String ngaySinh_323, String cmnd_323) {
        this.hoTen_323 = hoTen_323;
        this.ngaySinh_323 = ngaySinh_323;
        this.cmnd_323 = cmnd_323;
    }

    public String getCmnd_323() {
        return cmnd_323;
    }

    public void hienThi() {
        System.out.println("Ho ten: " + hoTen_323 + ", Ngay sinh: " + ngaySinh_323 + ", CMND: " + cmnd_323);
    }
}
