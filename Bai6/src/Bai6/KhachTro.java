package Bai6;
class KhachTro {
    private Nguoi nguoi_323;
    private int soNgayTro_323;
    private String loaiPhong_323;
    private double giaPhong_323;

    public KhachTro(Nguoi nguoi_323, int soNgayTro_323, String loaiPhong_323, double giaPhong_323) {
        this.nguoi_323 = nguoi_323;
        this.soNgayTro_323 = soNgayTro_323;
        this.loaiPhong_323 = loaiPhong_323;
        this.giaPhong_323 = giaPhong_323;
    }

    public String getCmnd_323() {
        return nguoi_323.getCmnd_323();
    }

    public double tinhTien() {
        return soNgayTro_323 * giaPhong_323;
    }

    public void hienThi() {
        nguoi_323.hienThi();
        System.out.println("So ngay tro: " + soNgayTro_323 + ", Loai phong: " + loaiPhong_323 + ", Gia phong/ngay: " + giaPhong_323);
    }
}

