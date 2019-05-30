package dp.pra.validtest;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author mrficus
 */
public class DateTest {
    public static void main(String[] args) {
        System.out.println(System.getProperty("user.timezone"));
        System.out.println("user.timezone");
        //a表示上午/下午 另:格式化日期的时候，需要对月份mm使用大写来描述
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss.SSS a");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS a");
        System.out.println(sdf1.format(new Date()));
        System.out.println(sdf2.format(new Date()));
    }
}
