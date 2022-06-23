package LuyenTapOOP;

public class KhoiA extends LuyenTapOOP.ThiSinh {
    public static final String KHOI_A = "Toan, Ly, Hoa";

    public KhoiA(int soBaoDanh, int mucUuTien, String hoTen, String diaChi) {
        super(soBaoDanh, mucUuTien, hoTen, diaChi);
    }

    @Override
    public String toString() {
        return "KhoiA{" +
                "soBaoDanh=" + soBaoDanh +
                ", mucUuTien=" + mucUuTien +
                ", hoTen='" + hoTen + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", monThi='" + KHOI_A + '\'' +
                '}';
    }
}
