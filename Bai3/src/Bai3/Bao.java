
package Bai3;
class Bao extends TaiLieu {
    private String ngayPhatHanh_323;

    public Bao(String maTaiLieu_323, String tenNXB_323, int soBanPhatHanh_323,
               String ngayPhatHanh_323) {
        super(maTaiLieu_323, tenNXB_323, soBanPhatHanh_323);
        this.ngayPhatHanh_323 = ngayPhatHanh_323;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Ngày phát hành: " + ngayPhatHanh_323);
    }
}
