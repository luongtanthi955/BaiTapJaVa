
package BaiTap1;

public class NhanVien {
    String ten;
    int tuoi;
    String diaChi;
    double tienLuong;
    int tongSoGioLam;

    public NhanVien() {
    }

    public NhanVien(String ten, int tuoi, String diaChi, double tienLuong, int tongSoGioLam) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.tienLuong = tienLuong;
        this.tongSoGioLam = tongSoGioLam;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public double getTienLuong() {
        return tienLuong;
    }

    public void setTienLuong(double tienLuong) {
        this.tienLuong = tienLuong;
    }

    public int getTongSoGioLam() {
        return tongSoGioLam;
    }

    public void setTongSoGioLam(int tongSoGioLam) {
        this.tongSoGioLam = tongSoGioLam;
    }
    
    public void getThongTin(){
        System.out.println("Ten nhan vien: "+ten);
        System.out.println("Tuoi nhan vien: "+tuoi);
        System.out.println("Dia chi nhan vien: "+diaChi);
        System.out.println("Tien luong nhan vien: "+tienLuong);
        System.out.println("Tong so gio lam cua nhan vien: "+tongSoGioLam);
        System.out.println("Tien thuong cua nhan vien: "+tinhThuong());  
    }
    
    public int tinhThuong(){
        if(tongSoGioLam<100)
            return 0;
        else if (tongSoGioLam>=100 && tongSoGioLam<200)
            return (int) (tienLuong*0.1);
         return (int) (tienLuong*0.2);
    }  
}