package paintbrush;

class Shape {
    Point p = new Point(100, 100);
    String color = "Blue";
    int width = 10, height = 10;

    void move(Point p) {
        this.p = p;
    }

    void changeColor(String color) {
        this.color = color;
    }

    double caculateArea() {
        return 0;
    }

    public String toString() {
        return "";
    }

    int countSizeParameters() {
        return 2;
    }

    void changeSize(int width, int height) {
        this.width = width;
        this.height = height;
    }

    void changeSize(int radious) {
        this.width = radious;
        this.height = -1;
    }

}