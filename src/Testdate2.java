import java.time.Year;
import java.util.Scanner;

public class Testdate2 {
    public static void main(String[] args) {
        int Month, year, days;
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter month: ");
        Month=scanner.nextInt();

        System.out.println("Enter year: ");
        year=scanner.nextInt();

        switch (Month){
            case 1,3,5,7,8,10,12:
                days=31;
                break;
            case 4,6,9,11:
                days=30;
                break;
            case 2:
                if ((year % 4 == 0 && year % 100 !=0)||(year % 400==0)) {
                    days=29;
                }else {
                    days=28;
                }
            default:
                System.out.println("Wrong input!!!");
                scanner.close();
                return;
        }
        System.out.println("Days of the month: "+ days+" "+"Month: "+Month+" "+"Year: "+year);
        scanner.close();
    }
}
