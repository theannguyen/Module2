package LuyenTapOOP;

public class KhoiC extends LuyenTapOOP.ThiSinh {
    public static final String KHOI_C = "Van, Su, Dia";

    public KhoiC(int soBaoDanh, int mucUuTien, String hoTen, String diaChi) {
        super(soBaoDanh, mucUuTien, hoTen, diaChi);
    }

    @Override
    public String toString() {
        return "KhoiC{" +
                "soBaoDanh=" + soBaoDanh +
                ", mucUuTien=" + mucUuTien +
                ", hoTen='" + hoTen + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", monThi='" + KHOI_C + '\'' +
                '}';
    }
}
