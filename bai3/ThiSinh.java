package LuyenTapOOP;

public class ThiSinh {
    int soBaoDanh, mucUuTien;
    String hoTen, diaChi;

    public ThiSinh() {
    }

    public ThiSinh(int soBaoDanh, int mucUuTien, String hoTen, String diaChi) {
        this.soBaoDanh = soBaoDanh;
        this.mucUuTien = mucUuTien;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
    }

    public int getSoBaoDanh() {
        return soBaoDanh;
    }

    @Override
    public String toString() {
        return "ThiSinh{" +
                "soBaoDanh=" + soBaoDanh +
                ", mucUuTien=" + mucUuTien +
                ", hoTen='" + hoTen + '\'' +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }
}
