package a06ChronoUnitdemo6;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Test {
    public static void main(String[] args) {
        //获取当前时间
        LocalDateTime ldt1 = LocalDateTime.now();
        //获取指定时间
        LocalDateTime ldt2 = LocalDateTime.of(2004, 8, 30, 2, 5, 3);

        System.out.println("相差的年数：" + ChronoUnit.YEARS.between(ldt2, ldt1));//相差的年数：19
        System.out.println("相差的月数：" + ChronoUnit.MONTHS.between(ldt2, ldt1));//相差的月数：239
        System.out.println("相差的周数：" + ChronoUnit.WEEKS.between(ldt2, ldt1));//相差的周数：1039
        System.out.println("相差的天数：" + ChronoUnit.DAYS.between(ldt2, ldt1));//相差的天数：7275
        System.out.println("相差的时数：" + ChronoUnit.MINUTES.between(ldt2, ldt1));//相差的时数：10477083
        System.out.println("相差的分数：" + ChronoUnit.SECONDS.between(ldt2, ldt1));//相差的分数：628624985

    }
}
