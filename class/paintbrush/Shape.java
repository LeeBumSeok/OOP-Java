class Shape {
    Point p = new Point(100, 100);
    String color = "Blue";

    void move(Point p) {
        this.p = p;
    }

    void changeColor(String color) {
        this.color = color;
    }

    double caculateArea() {
        return 0;
    }

}