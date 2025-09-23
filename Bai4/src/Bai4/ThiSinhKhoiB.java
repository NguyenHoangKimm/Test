package Bai4;
class ThiSinhKhoiB extends ThiSinh {
    private final String khoi_323 = "Toan, Hoa, Sinh";

    public ThiSinhKhoiB(String sbd_323, String hoTen_323, String diaChi_323, String uuTien_323) {
        super(sbd_323, hoTen_323, diaChi_323, uuTien_323);
    }

    @Override
    public void hienThi() {
        super.hienThi();
        System.out.println("Khoi B - Mon thi: " + khoi_323);
    }
}
