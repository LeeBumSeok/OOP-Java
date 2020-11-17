package paintbrush;

public class Paint {
    Shape[] shapes = new Shape[10];
    int count = 0;

    enum ShapeType {
        TRIANGLE, CIRCLE, RECTANGLE
    }

    void CreateShape(ShapeType type) {
        switch (type) {
            case TRIANGLE:
                shapes[count] = new Triangle();
                break;
            case CIRCLE:
                shapes[count] = new Circle();
                break;
            case RECTANGLE:
                shapes[count] = new Rect();
                break;
        }
        count++;
    }

    String showShapeList() {
        String result = "";
        for (int i = 0; i < count; i++) {
            result += i + 1 + ":";
            result += shapes[i].toString();
            result += '\n';
        }
        return result;
    }

    void move(int index, int x, int y) {
        Point p = new Point(x, y);
        shapes[index - 1].move(p);
    }

    void changeColor(int index, String color) {
        shapes[index - 1].changeColor(color);
    }

    double calculateArea(int index) {
        return shapes[index - 1].caculateArea();
    }

    void changeSize(int index, int width, int height) {
        shapes[index - 1].changeSize(width, height);
    }

    void changeSize(int index, int radius) {
        shapes[index - 1].changeSize(radius);
    }

    int countSizeParameters(int index) {
        return shapes[index - 1].countSizeParameters();
    }
}