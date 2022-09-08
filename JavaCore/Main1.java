import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import javax.print.attribute.standard.DateTimeAtCompleted;


public class Main1 {
    public static void main(String[] args) {
        int i = 10;
        int n = i++%5;
        System.out.println("Gia tri cua i và n");
        System.out.println(i);
        System.out.println(n);

        i = 10;
        n = ++i % 5;
        System.out.println("Gia tri cua i1 và n1");
        System.out.println(i);
        System.out.println(n);

        double Fahrenheit = 78.34;
        double Celsius = (double)5/9 *(Fahrenheit-32);
        System.out.println("Chuong trinh doi tu do F sang do C bang:");
        System.out.println(Celsius);

        double d = 9/5;
        d = (float)9/5;
        System.out.println("gia tri cua d");
        System.out.println(d);

        int x = 10;
        int y = 7;
        boolean hieu = (x-y)<5;
        System.out.println(hieu);

        String s1 = "cat";
        System.out.println(s1);

        String s2 = "cat";
        System.out.println(s2);

        String s3 = new String("cat");
        System.out.println(s3);

        String s4 = new String("cat");
        System.out.println(s4);

        String s5 = "Dog";
        System.out.println(s5);

        String s6 = new String("Dog");
        System.out.println(s6);

        System.out.println(s1 == s2);

        System.out.println(s1 == s3);

        System.out.println(s3 == s4);

        System.out.println(s5 == s6);

        System.out.println(s3.equals(s4));

        System.out.println(s3.equals(s1));

        System.out.println(s1.equals(s2));

        String txt = "Toi la coder";
        // chieu dai
        System.out.println("length:" + txt.length());
        // chuyen thanh chu hoa
        System.out.println("chu hoa:" + txt.toUpperCase());
        // chuyen thanh chu thuong
        System.out.println("chu thuong" + txt.toLowerCase());

        char ch = txt.charAt(5);
        System.out.println("ky tu:" + ch);
        
        //tim chu o 
        int firstIndex = txt.indexOf("o");
        System.out.println("firrstIndex" + firstIndex);

        int lastIndex = txt.lastIndexOf("o");
        System.out.println( "lastIndex:" +lastIndex);

        firstIndex = txt.indexOf("k");
        System.out.println("firstIndex" + firstIndex);

        String subString = txt.substring(1);
        System.out.println("subString :" + subString);
        subString = txt.substring(1,8);
        System.out.println("sub String2:" + subString);
        int index = txt.indexOf("la");
        System.out.println(index);

        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);

        LocalDateTime currentDate2 = LocalDateTime.now();
        System.out.println(currentDate2);

        LocalDateTime currentDate3 = LocalDateTime.of(LocalDate.of(1999,7,27),LocalTime.of(2,30,50));
        System.out.println(currentDate3);

        LocalDate birthday = LocalDate.of(1999,07,27);

        // tinh tuoi

        int birthdayYear = birthday.getYear();
        int currentYear = currentDate.getYear();

        int age = currentYear - birthdayYear;
        System.out.println("tuoi:" + age);

        int month = birthday.getMonthValue();
        System.out.println("month:" + month);
        int day = birthday.getDayOfMonth();
        System.out.println("day:" + day);

        LocalDate newDate = birthday.plusDays(300);
        System.out.println(newDate);
        
        System.out.println(birthday.isLeapYear());

        System.out.println(birthday.minusMonths(4));

        LocalTime startTime = LocalTime.of(10,30,12);

        LocalTime newTime = startTime.minusMinutes(45);
        System.out.println(newTime);

        LocalDateTime currentTime = LocalDateTime.now();
        LocalDateTime birthTime = LocalDateTime.of(
                                                    LocalDate.of(1999,07,27),
                                                    LocalTime.of(2,30,50));  
        birthTime = LocalDateTime.of(1999,07,27,2,30,50);
                                                    
        System.out.println(birthTime);

        boolean compareResult = currentTime.isEqual(birthTime);
        System.out.println("isequal:" + compareResult);

        boolean isAfter = currentTime.isAfter(birthTime);
        System.out.println("isafter:" + isAfter);

        boolean isBefore = currentTime.isBefore(birthTime);
        System.out.println("isbefore:" + isBefore);

        // muc tieu : hien thi ngay theo dang nam/thang/ngay, gio theo gi-phut-giay
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyy/dd/MM E W hh-mm-ss.SSS");
        String display = formatter.format(currentTime);
        System.out.println("hienthi:" + display);

        ////////////SCANNER//////////
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hay nhap so nguyen");
        int intNumber;
        intNumber = scanner.nextInt();
        System.out.println("ban da nhap:" + intNumber);
        scanner.nextLine();
        

        System.out.println("hay nhap so double");
        double doubleNumber = scanner.nextDouble();
        System.out.println("ban da nhap" + doubleNumber);
        scanner.nextLine();


        System.out.println("hay nhap text");
        String inputText;
        inputText = scanner.nextLine();
        System.out.println("ban da nhap" + inputText);

        System.out.println("hay nhap so tu ban phim");
        int number = scanner.nextInt();

        int randNumber = (int)(Math.random() *100);

        System.out.println("random number:" + randNumber);

        String compare = number > randNumber ? "so nhap tu ban phim lon hon" : "so nhap tu ban phim nho hon";

        System.out.println("so sanh:" + compare);

        scanner.close();

        
    }
}
