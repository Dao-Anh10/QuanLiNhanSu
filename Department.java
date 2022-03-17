public class Department {
    public int maBoPhan;
    public String tenBoPhan;
    public int soLuongNhanVien;

    public Department( int maBoPhan,String tenBoPhan,int soLuongNhanVien){
        this.maBoPhan = maBoPhan;
        this.tenBoPhan = tenBoPhan;
        this.soLuongNhanVien = soLuongNhanVien;
    }
    // hàm getter lay gia trị
    public int getMaBoPhan() {
        return maBoPhan;
    }

    public int getSoLuongNhanVien() {
        return soLuongNhanVien;
    }
    public String getTenBoPhan() {
        return tenBoPhan;
    }
    // hàm hiển thị thong tim Deparment
    public String toString(){
        
        return "MaBP: " + maBoPhan + "\t" + "TenBP: " + tenBoPhan+ "\t" + "SoLuongNV: " + soLuongNhanVien;

    }

}
