package paintbrush;

class Rect extends Shape {
    double caculateArea() {
        return width * height;
    }

    public String toString() {
        return " Rect: " + "width = " + width + " height = " + height + " color = " + color;
    }
}