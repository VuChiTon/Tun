import java.util.Scanner;

public class TinhTong {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập số nguyên dương cần tính tổng: ");
        int n=scanner.nextInt();
        int sum=0;
        for (int i = 0; i < n; i++){
            System.out.println("Nhập số thứ "+ (i+1) + ":");
            int number = scanner.nextInt();
            sum += number;
        }
        System.out.println("Tổng là " + sum);
        scanner.close();

    }
}
