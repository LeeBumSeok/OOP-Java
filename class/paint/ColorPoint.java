public class ColorPoint extends Point {
    ColorPoint(int x, int y, String color) {
        super(x, y, color);
        System.out.println("ColorPoint Class");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("color = " + color);
    }
}