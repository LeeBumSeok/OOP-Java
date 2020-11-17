package paintbrush;

class Circle extends Shape {
    final static double pi = 3.141592;

    double caculateArea() {
        return pi * width * width;
    }

    public String toString() {
        return " Circle: " + "radius = " + width + " color = " + color;
    }

    int countSizeParameters() {
        return 1;
    }
}