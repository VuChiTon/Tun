import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        int a, b, c;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập a:"); a=scanner.nextInt();
        System.out.println("Nhập b:"); b=scanner.nextInt();
        System.out.println("Nhập c:"); c=scanner.nextInt();
        if(a==0){
            if(b==c)
                System.out.println("PTVSN");
            else
                System.out.println("PTVN");
        }else{
            float x=(float) (c-b)/a;
            System.out.println("Làm đúng rồi x="+x);

            scanner.close();
        }


    }
}
