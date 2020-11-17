package paintbrush;

class Triangle extends Shape {
    double caculateArea() {
        return width * height / 2;
    }

    public String toString() {
        return " Triangle: " + "width = " + width + " height = " + height + " color = " + color;
    }

}