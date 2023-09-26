public class demo_bt2 {
    int a, b;
    public static void main(String[] args) {

    }
    public static String check_point(int a, int b){
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
