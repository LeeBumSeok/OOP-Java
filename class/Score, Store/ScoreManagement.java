public class ScoreManagement {
    private static char toLevel(int score) {
        // 90 ~ 100: A
        // 80 ~ 89: B
        // 70 ~ 79: C
        // 0 ~ 69: F

        if (score >= 90)
            return 'A';
        else if (score >= 80)
            return 'B';
        else if (score >= 70)
            return 'C';

        return 'F';
    }

    public static void main(String args[]) {
        System.out.println(toLevel(100)); // A
        System.out.println(toLevel(89)); // B
        System.out.println(toLevel(73)); // C
        System.out.println(toLevel(69)); // F
        System.out.println(toLevel(80)); // B
        System.out.println(toLevel(70)); // C
        System.out.println(toLevel(100)); // A
    }
}