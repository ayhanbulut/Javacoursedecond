package Day_15;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class StringBuilder {

    public static void main(String[] args) {
        java.lang.StringBuilder stra=new java.lang.StringBuilder();

        System.out.println("stra.append(\"ayhan\").reverse() = " + stra.append("ayhan").reverse());

        stra.append("  hello  ayhan");

        System.out.println("stra = " + stra);

        System.out.println("stra.capacity() = " + stra.capacity());
        System.out.println("stra.length() = " + stra.length());
        stra.setCharAt(4,'g');
        System.out.println("stra = " + stra);
        String a="ayhan";
        a=a.replace('a','b');
        a=a.replaceFirst("b","a");
        System.out.println("a = " + a);


    }

    public static class DataDate02 {

        public static void main(String[] args) {

            LocalDate currentDate=LocalDate.now();

            System.out.println("currentDate = " + currentDate);

            //How to get current time by typing java code

            LocalTime currentTime=LocalTime.now();

            System.out.println("currentTime = " + currentTime);

            //how to get "current date and time"

            LocalDateTime currentDateTime=LocalDateTime.now();

            System.out.println("currentDateTime = " + currentDateTime);
            // how can i get diffent country local date

            LocalDate currentDateInJapan=LocalDate.now(ZoneId.of("Asia/Tokyo"));
            System.out.println("currentDateInJapan = " + currentDateInJapan);

            LocalTime currentLocalTimeInUzbekistan=LocalTime.now(ZoneId.of("Asia/Tashkent"));

            System.out.println("currentLocalTimeInUzbekistan = " + currentLocalTimeInUzbekistan);

            LocalDate cd1=LocalDate.now();

            LocalDate cdNext=cd1.plusYears(10).plusMonths(5).plusDays(10);

            System.out.println(cdNext);
            DateTimeFormatter dt=DateTimeFormatter.ofPattern("dd/MMM/yyyy");
            String formattedCurrentDate2= dt.format(LocalDate.now());
            System.out.println("dt = " + formattedCurrentDate2);

            java.lang.StringBuilder stra=new java.lang.StringBuilder();

            stra.append("java ").append("is ").append("easy.");

            System.out.println("stra = " + stra);
        }
    }
}
