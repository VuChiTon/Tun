import java.util.Scanner;

public class THTT {
    public static void main(String[] args) {
        int a, b, tong, hieu, tich;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập a: "); a=scanner.nextInt();
        System.out.println("Nhập b: "); b=scanner.nextInt();
        tong=a+b; hieu= a-b; tich=a*b;
        System.out.println("Tong= "+tong);
        System.out.println("Hieu= "+hieu);
        System.out.println("Tich= "+tich);
        if (b==0)
            System.out.println("b không tính thương");
        else{
            double thuong= (double) a/b;
            System.out.println("Thuong= "+thuong);

            scanner.close();
        }



    }
}
