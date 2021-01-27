package com.duguyuan;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime {

    public static void main(String[] args) {
        // LocalDate获取当前日期
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate.toString());
        // LocalTime获取当前时间
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime.toString());
        // LocalDateTime获取当前日期及时间
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println(localDateTime.format(format));
    }

}
