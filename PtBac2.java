package BaiTap4;

public class PtBac2 {
    private int a;
    private int b;
    private int c;

    public PtBac2 (int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int checkHeSo() {
        if (a == 0 && b == 0 && c == 0) {
            return 0;
        } else if (a == 0 && b == 0) {
            return 1;
        } else if (a == 0) {
            return 2;
        } else {
            return 3;
        }
    }

    public int checkDelta() {
        if (this.calDelta() < 0) {
            return 1;
        } else if (this.calDelta() == 0) {
            return 2;
        } else {
            return 3;
        }
    }

    public int calDelta() {
        return (this.b * this.b) - (4 * this.a * this.c);
    }

    public void tinhNghiem() {
        switch (checkHeSo()) {
            case 0:
                System.out.println("Phương trình vô số nghiệm");
                break;
            case 1:
                System.out.println("Phương trình vô nghiệm");
                break;
            case 2:
                System.out.println("Nghiệm phương trình là: " + (-this.c / this.b));
                break;
            case 3:
                switch (checkDelta()) {
                    case 1:
                        System.out.println("Phương trình vô nghiệm");
                        break;
                    case 2:
                        System.out.println("Phương trình có nghiệm kép: " + (-this.b / (2*this.a)));
                        break;
                    case 3:
                        System.out.println("Phương trình có 2 nghiệm");
                        System.out.println("Nghiệm 1:" + (-this.b + Math.sqrt(calDelta()))/ (2*this.a));
                        System.out.println("Nghiệm 2:" + (-this.b - Math.sqrt(calDelta()))/ (2*this.a));
                        break;
                }
        }
    }
}
