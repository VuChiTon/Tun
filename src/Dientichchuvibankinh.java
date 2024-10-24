import java.util.Scanner;

public class Dientichchuvibankinh {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("Nhập length: "); double length= scanner.nextDouble();
        System.out.print("Nhập width: "); double width= scanner.nextDouble();
        // Công thức tính.
        double area= length * width;
        double perimeter= (length + width) * 2;
        double radius= perimeter / Math.PI *2;
        // hiển thị đáp án.
        System.out.println("Area= "+area);
        System.out.println("Perimeter= "+perimeter);
        System.out.println("radius= "+radius);

        scanner.close();

    }
}
