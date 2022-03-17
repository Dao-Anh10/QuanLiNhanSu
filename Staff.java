
public abstract class Staff {

    protected int maNhanVien;   
    protected String tenNhanVien;
    protected int tuoiNhanVien;
    protected int heSoLuong;
    protected int ngayVaoLam;
    protected String boPhan;
    protected int soNgayNghiPhep;

    public Staff(int maNhanVien, String tenNhanVien,int tuoiNhanVien,int heSoLuong,int ngayVaoLam, String boPhan, int soNgayNghiPhep ){
        this.maNhanVien = maNhanVien;
        this.tenNhanVien = tenNhanVien;
        this.tuoiNhanVien = tuoiNhanVien;
        this.heSoLuong = heSoLuong;
        this.ngayVaoLam = ngayVaoLam;
        this.boPhan = boPhan;
        this.soNgayNghiPhep = soNgayNghiPhep;

    }

    // hàm hiển thị thong tin
    public abstract void displayInformation();
}