public class Logical {
    public static void main(String[] args) {
        int a = 6;
        int b = 3;

        System.out.println(a > b && b > 0); // true
        System.out.println(a < b || b == 3); // true
        System.out.println(!(a == b));       // true
    }
}