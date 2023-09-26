import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class demo_bt2Test {

    @Test
    void check_point1() {
        assertEquals("C", check_point(25,  15));
    }
    @Test
    void check_point2() {
        assertEquals("B", check_point(35, 30));
    }
    @Test
    void check_point3() {
        assertEquals("A", check_point(60,35));
    }
    @Test
    void check_point4() {
        assertEquals("Error!", check_point('a', (char) 15));
    }
    @Test
    void check_point5() {
        assertEquals("Error!", check_point('@',15));
    }
    @Test
    void check_point6() {
        assertEquals("Error!", check_point(-15,5));
    }
    @Test
    void check_point7() {
        assertEquals("Error!", check_point(70,10));
    }
    @Test
    void check_point8() {
        assertEquals("Error!", check_point(30,'b'));
    }
    @Test
    void check_point9() {
        assertEquals("Error!", check_point(30,'@'));
    }
    @Test
    void check_point10() {
        assertEquals("Error!", check_point(40,-20));
    }
    @Test
    void check_point11() {
        assertEquals("Error!", check_point(40,50));
    }
    private String check_point(int a, int b){
        if (a >= 0 && a <= 60) {
            // Diem ly thuyet toi da la 60.
            if (b >= 0 && b <= 40) {
                // Diem thuc hanh toi da la 40.
                int sum = a + b;
                if (sum >= 80) {
                    return "A";
                } else if (sum >= 60 && sum < 80){
                    return "B";
                } else if (sum < 60) {
                    return "C";
                }
            }
        }
        return "Error!";
    }
}