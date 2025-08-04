public class PackageSorter {

    // Sorting logic
    public static String sort(int width, int height, int length, int mass) {
        boolean isBulky = width >= 150 || height >= 150 || length >= 150 || (long) width * height * length >= 1_000_000;
        boolean isHeavy = mass >= 20;

        if (isBulky && isHeavy) {
            return "REJECTED";
        } else if (isBulky || isHeavy) {
            return "SPECIAL";
        } else {
            return "STANDARD";
        }
    }

    // Test cases for different scenario
    public static void main(String[] args) {
        System.out.println(sort(100, 100, 100, 10));  // STANDARD
        System.out.println(sort(200, 50, 50, 10));    // SPECIAL (bulky)
        System.out.println(sort(100, 100, 100, 25));  // SPECIAL (heavy)
        System.out.println(sort(200, 200, 200, 25));  // REJECTED (bulky + heavy)
        System.out.println(sort(150, 10, 10, 5));     // SPECIAL (dimension = 150)
        System.out.println(sort(100, 100, 100, 20));  // SPECIAL (mass = 20)
        System.out.println(sort(99, 99, 102), 19);    // STANDARD
    }
}
