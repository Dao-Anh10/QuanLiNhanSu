public class Manager extends Staff implements ICalculator {
    public String chucDanh;
    
    public Manager(int maNhanVien, String tenNhanVien,int tuoiNhanVien,int heSoLuong,int ngayVaoLam, String boPhan, int soNgayNghiPhep,String chucDanh){
        super(maNhanVien, tenNhanVien, tuoiNhanVien, heSoLuong, ngayVaoLam, boPhan, soNgayNghiPhep);
        this.chucDanh = chucDanh;

    }
    // hàm tinh lương manager
    public double calculateSalary(){
        double luongTrachNhiem = 0;
        if (chucDanh.equals("Business Leader")) {
             luongTrachNhiem = 8000000;
        }else if (chucDanh.equals("Project Leader")) {
            luongTrachNhiem = 5000000;
        }
        else if (chucDanh.equals("Technical Leader")) {
            luongTrachNhiem = 6000000;
        }

        
        return heSoLuong * 5000000 + luongTrachNhiem;
    };
    // hàm hiển thị thộng tin manager
    public void displayInformation(){
        
        System.out.printf("MaNV: %d \t TenNV : %s \t TuoiNV: %d \t HeSL: %d \t NgayVL: %d \t BoP: %s \t SoNN: %d \t ChucD: %s.",maNhanVien,tenNhanVien,tuoiNhanVien,heSoLuong,ngayVaoLam, boPhan,soNgayNghiPhep,chucDanh);

    };
}
