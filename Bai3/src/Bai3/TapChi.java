package Bai3;
class TapChi extends TaiLieu {
    private int soPhatHanh_323;
    private int thangPhatHanh_323;

    public TapChi(String maTaiLieu_323, String tenNXB_323, int soBanPhatHanh_323,
                  int soPhatHanh_323, int thangPhatHanh_323) {
        super(maTaiLieu_323, tenNXB_323, soBanPhatHanh_323);
        this.soPhatHanh_323 = soPhatHanh_323;
        this.thangPhatHanh_323 = thangPhatHanh_323;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("So phat hanh: " + soPhatHanh_323);
        System.out.println("Thang phat hanh: " + thangPhatHanh_323);
    }
}

