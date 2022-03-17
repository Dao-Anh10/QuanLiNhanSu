public class Employee extends Staff implements ICalculator{
    public int soGioLamThem;

    public Employee(int maNhanVien, String tenNhanVien,int tuoiNhanVien,int heSoLuong,int ngayVaoLam, String boPhan, int soNgayNghiPhep, int soGioLamThem ){
        super(maNhanVien, tenNhanVien, tuoiNhanVien, heSoLuong, ngayVaoLam, boPhan, soNgayNghiPhep);
        this.soGioLamThem = soGioLamThem;

    }
    // hàm tính luong nhan vien
    public double calculateSalary(){
        return heSoLuong * 3000000 + soGioLamThem * 200000;
    };
    // hàm hiển thi thôn tin nhân viên 
    public void displayInformation(){

        System.out.printf("MaNV: %d \t TenNV : %s \t TuoiNV: %d \t HeSL: %d \t NgayVL: %d \t BoP: %s \t SoNN: %d \t SoGLT: %d.",maNhanVien,tenNhanVien,tuoiNhanVien,heSoLuong,ngayVaoLam, boPhan,soNgayNghiPhep,soGioLamThem);

    };

}
