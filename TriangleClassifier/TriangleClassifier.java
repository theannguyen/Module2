package BaiTap9;

public class TriangleClassifier {
public static boolean testTriangle(int a, int b, int c) {
    if ((a + b + c) > 0) {
        return true;
    }
    return false;
}

public static boolean testEquilateralTriangle(int a, int b, int c) {
    if (a == b & b == c & c == c) {
        return true;
    }
    return false;
}

public static boolean testIsoscelesTriangle(int a, int b, int c) {
    if (a == b || b == c || a == c) {
        return true;
    }
    return false;
}
}
