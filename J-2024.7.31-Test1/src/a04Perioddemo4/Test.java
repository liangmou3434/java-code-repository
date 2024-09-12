package a04Perioddemo4;

import java.time.LocalDate;
import java.time.Period;

public class Test {
    public static void main(String[] args) {
        //当前年月日
        LocalDate ld1 = LocalDate.now();
        //指定生日为时间
        LocalDate ld2 = LocalDate.of(2004, 8, 30);

        Period p = Period.between(ld2, ld1);//第二个参数减第一个参数,返回两个参数相差的时间
        System.out.println(p);//P19Y11M1D 相差19年,11个月,1天

        System.out.println(p.getYears());//19
        System.out.println(p.getMonths());//11
        System.out.println(p.getDays());//1

        //直接计算两个参数之间一共间隔多少个月
        System.out.println(p.toTotalMonths());//239

    }
}
