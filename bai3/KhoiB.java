package LuyenTapOOP;

public class KhoiB extends LuyenTapOOP.ThiSinh {
public static final String KHOI_B = "Toan, Hoa, Sinh";

    public KhoiB(int soBaoDanh, int mucUuTien, String hoTen, String diaChi) {
        super(soBaoDanh, mucUuTien, hoTen, diaChi);
    }

    @Override
    public String toString() {
        return "KhoiB{" +
                "soBaoDanh=" + soBaoDanh +
                ", mucUuTien=" + mucUuTien +
                ", hoTen='" + hoTen + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", monThi='"+ KHOI_B + '\'' +
                '}';
    }
}
