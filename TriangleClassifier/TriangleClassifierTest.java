package BaiTap9;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TriangleClassifierTest {
@Test
    @DisplayName("Triangle")
    public void testTriangle() {
    int a = 3;
    int b = 4;
    int c = 5;

    boolean expected = true;
    boolean result = TriangleClassifier.testTriangle(a, b, c);
    assertEquals(expected, result);
}

@Test
    @DisplayName("Equilateral Triangle")
    public void testEquilateralTriangle() {
    int a = 3;
    int b = 3;
    int c = 3;

    boolean expected = true;
    boolean result = TriangleClassifier.testEquilateralTriangle(a, b, c);
    assertEquals(expected, result);
}

    @Test
            @DisplayName("Isoceless Triangle")
    public void testIsoscelessTriangle() {
        int a = 3;
        int b = 3;
        int c = 4;

        boolean expected = true;
        boolean result = TriangleClassifier.testIsoscelesTriangle(a, b, c);
        assertEquals(expected, result);
    }
}
