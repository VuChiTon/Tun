import javax.swing.*;
import java.util.Scanner;

public class PTbac2{
    public static void main(String[] args) {
        Double a,b,c;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhập a: "); a = scanner.nextDouble();
        System.out.print("Nhập b: "); b = scanner.nextDouble();
        System.out.print("Nhập c: "); c = scanner.nextDouble();
        if (a==0){
            if (b==0){
                if (c==0)
                    System.out.println("PTVSN");
                else
                    System.out.println("PTVN");
            }else {
                double x = (double) -b/c;
                System.out.println("x= "+x);
            }
        }else{
            double Delta = b*b - 4*a*c;
            if (Delta<0)
                System.out.println("PTVN");
            else {
                if (Delta==0){
                    double x = (double) -b/2*a;
                    System.out.println("x1 = x2 = "+x);
                }else {
                    double x1 = (-b+Math.sqrt(Delta))/(2*a);
                    double x2 = (-b-Math.sqrt(Delta))/(2*a);
                    System.out.println("x1 = "+x1);
                    System.out.println("x2 = "+x2);
                }
            }
        }

    }
}