package bai2;
class KySu extends CanBo {
    private String nganhDaoTao_323;

    public KySu(String hoTen_323, String ngaySinh_323, String gioiTinh_323, String diaChi_323, String nganhDaoTao_323) {
        super(hoTen_323, ngaySinh_323, gioiTinh_323, diaChi_323);
        this.nganhDaoTao_323 = nganhDaoTao_323;
    }

    public String getNganhDaoTao_323() 
    { 
        return nganhDaoTao_323; 
    }
    public void setNganhDaoTao_323(String nganhDaoTao_323) 
    { 
        this.nganhDaoTao_323 = nganhDaoTao_323; 
    }

    @Override
    public void hienThiThongTin_323() {
        super.hienThiThongTin_323();
        System.out.println("Nganh đao tao: " + nganhDaoTao_323);
    }
}
