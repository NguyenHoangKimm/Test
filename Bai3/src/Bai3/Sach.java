
package Bai3;
class Sach extends TaiLieu {
    private String tenTacGia_323;
    private int soTrang_323;

    public Sach(String maTaiLieu_323, String tenNXB_323, int soBanPhatHanh_323,
                String tenTacGia_323, int soTrang_323) {
        super(maTaiLieu_323, tenNXB_323, soBanPhatHanh_323);
        this.tenTacGia_323 = tenTacGia_323;
        this.soTrang_323 = soTrang_323;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Tac gia: " + tenTacGia_323);
        System.out.println("So trang: " + soTrang_323);
    }
}
