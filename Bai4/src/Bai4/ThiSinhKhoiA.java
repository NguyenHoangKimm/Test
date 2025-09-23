package Bai4;
class ThiSinhKhoiA extends ThiSinh {
    private final String khoi_323 = "Toan, Ly, Hoa";

    public ThiSinhKhoiA(String sbd_323, String hoTen_323, String diaChi_323, String uuTien_323) {
        super(sbd_323, hoTen_323, diaChi_323, uuTien_323);
    }

    @Override
    public void hienThi() {
        super.hienThi();
        System.out.println("Khoi A - Mon thi: " + khoi_323);
    }
}