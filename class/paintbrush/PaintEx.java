import java.util.Scanner;
import Paint.ShapeType;

public class PaintEx {
    static Scanner scanner;
    static Paint p;
    

    public static void CreateShape() {
        System.out.println("아래 메뉴 중 선택하세요.");
        System.out.println("1. 삼각형");
        System.out.println("2. 원");
        System.out.println("3. 사각형");

        switch (scanner.nextInt()) {
            case 1:
                p.CreateShape(ShapeType.TRIANGLE);
            case 2:
                p.CreateShape(ShapeType.CIRCLE);
            case 3:
                p.CreateShape(ShapeType.RECTANGLE);
        }
    }

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        p = new Paint();

        while (true) {
            System.out.println("아래 메뉴 중 선택하세요.");
            System.out.println("1. 도형 생성");
            System.out.println("2. 이동");
            System.out.println("3. 색상 변경");
            System.out.println("4. 넓이 구하기");
            System.out.println("5. 사이즈 변경");
            System.out.println("6. 종료");

            switch (scanner.nextInt()) {
                case 1:
                    CreateShape();
                    System.out.println(p.showShapeList());
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    scanner.close();
                    break;
            }
        }
    }
}