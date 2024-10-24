import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class datetime {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        // Lấy ngày tháng năm
        int năm = calendar.get(Calendar.YEAR);
        int tháng = calendar.get(Calendar.MONTH);
        int ngày = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(năm);
        System.out.println(tháng+1);
        System.out.println(ngày);
        // chỉnh tùy ý
        calendar.set(Calendar.YEAR,2024);
        calendar.set(Calendar.MONTH,9);
        calendar.set(Calendar.DAY_OF_MONTH,19);
        // check
        int nămSinh = calendar.get(Calendar.YEAR);
        int thángSinh = calendar.get(Calendar.MONTH);
        int ngàySinh = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println("ngày tháng năm sinh: "
                    +ngàySinh+"/"
                    +(thángSinh+1)+"/"
                    +nămSinh);
        // Xuất định dạng
        SimpleDateFormat time = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a");
        //Tạo đối tượng
        Date d = calendar.getTime();
        String a = time.format(d);
        System.out.println(a);
    }
}
