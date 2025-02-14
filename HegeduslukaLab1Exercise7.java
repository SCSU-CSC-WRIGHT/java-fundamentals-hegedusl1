public class HegeduslukaLab1Exercise7 {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed.");
        }
    }
}