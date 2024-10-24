import java.util.Calendar;
import java.util.Scanner;

public class Testdate {
    public static void main(String[] args) {
        int date, month, year, age;
        Scanner scanner=new Scanner(System.in);

            System.out.print("Nhap ngay: ");
            date = scanner.nextInt();
            System.out.print("Nhap thang: ");
            month = scanner.nextInt();
            System.out.print("Nhap nam: ");
            year = scanner.nextInt();

            Calendar birthday = Calendar.getInstance();
            birthday.set(year, month- 1, date);

            int nam = birthday.get(Calendar.YEAR);
            int thang = birthday.get(Calendar.MONTH);
            int ngay = birthday.get(Calendar.DAY_OF_MONTH);
            System.out.println("Mung Sinh nhat "
                    + ngay + "/"
                    + (thang + 1) + "/"
                    + nam);
            Calendar now = Calendar.getInstance();
            int namhientai = now.get(Calendar.YEAR);
            age = namhientai - nam;
            System.out.println("Tuoi: " + age);

    }
}
