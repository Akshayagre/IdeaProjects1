import java.text.SimpleDateFormat;
import java.util.Date;

public class datePattern {

    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(date);

        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy | hh-mm-ss");
        String str = sd.format(date);
        System.out.println(str);
    }
}
