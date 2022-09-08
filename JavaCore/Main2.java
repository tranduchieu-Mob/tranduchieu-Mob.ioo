import java.util.Scanner;

// import java.time.Duration;
// import java.time.LocalDateTime;
// import java.time.format.DateTimeFormatter;
// import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        // //Bài 1
        // String letter = "Than gui cac ban,\nDuoi day la cau noi noi tieng \n \t \"A journey of a thousand miles begins with a single step\" \nNo co nghia la \n \t \"Hanh trinh ngan dam bat dau tu mot buoc chan\" \nChuc cac ban thanh cong !!!";
        // System.out.println(letter);
        // //Bài2
        // double distant = 0.0;
        // String startTimeStr = "";
        // String finishTimeStr = "";
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Nhap khoang cach: ");
        // distant = scanner.nextDouble();
        // scanner.nextLine();
        // System.out.print("Nhap thoi gian bat dau: ");
        // startTimeStr = scanner.nextLine();
        // System.out.print("Nhap thoi gian ket thuc: ");
        // finishTimeStr =scanner.nextLine();
        // scanner.close();
        // LocalDateTime startTime = LocalDateTime.parse(startTimeStr, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
        // LocalDateTime finishTime = LocalDateTime.parse(finishTimeStr,DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
        // Duration duration = Duration.between(startTime, finishTime);
        // // Tính và in ra thời gian chạy của bạn
        // System.out.printf("Thoi gian chay %s phut\n", duration.toMinutes());
        // // Tính và in ra vận tốc trung bình của bạn (km/h)
        // System.out.printf("Van toc trung binh %s km/h\n", distant / duration.toMinutes()/60.0);


        // Double cannang = 0.0 ;
        // Double chieucao = 0.0 ;
        // double BMI = 0.0;
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("nhap can nang:");
        // cannang = scanner.nextDouble();
        // scanner.nextLine();
        // System.out.print("nhap chieu cao:");
        // chieucao = scanner.nextDouble();
        // scanner.close();
        // BMI = cannang / (chieucao*chieucao);
        // System.out.print(BMI);
        // if(BMI>24.9){
        //     System.out.print("Thua can");
        // }else{
        //     if(BMI <18.5){
        //         System.out.print("thieu can");
        //     }
        //  else {
        //     if(BMI>=18.5 && BMI<= 24.9){
        //         System.out.print("Candoi");
        //     }
        //     }
        // }

        
        // String season = new String("Summer");
        // switch (season) {
        //     case "Sprint": {
        //         System.out.println("mua xuan");
        //         break;
        //     }
        //     case "Summer": {
        //         System.out.println("mua he");
        //         break;
        //     }
        //     case "Autumn":{
        //         System.out.println("mua thu");
        //         break;
        //     }
        //     case "Winter":{
        //         System.out.println("mua dong");
        //         break;
        //     }
        //     default:
        //     System.out.println("khong co mua nay");
        // }


        // Scanner scanner = new Scanner(System.in);
        // System.out.println("nhap 1 thang bat ki:");
        // int thang = scanner.nextInt();
        // scanner.close();
        // switch (thang){
        //     case 1:
        //     case 3:
        //     case 5:
        //     case 7:
        //     case 8:
        //     case 12:
        //     case 10:{
        //         System.out.println("Co 31 ngay");
        //         break;
        //     }
        //     case 2:{
        //         System.out.println("co 28 hoac 29 ngay");
        //         break;
        //     }
        //     case 4:
        //     case 6:
        //     case 9:
        //     case 11:{
        //         System.out.println("co 30 ngay");
        //         break;
        //     }
        // }


        // for ( int index = 0;index >=0; index++){
        //     System.out.println("vong lap thu" + index);
        // }
        // for ( int index = 0 ; index < 10; index++){
        //     System.out.println("vong lap"+index);
        //     index = index + 2 ;
        // }
        // int count = 0;
        String text = "Toi la java coder";
        // for (int index = 0; index < text.length(); index++){
        // System.out.println("ky tu:"+ text.charAt(index));
        
        //  char character = text.charAt(index);
        //  if(character == 'a'){
        // System.out.println("ky tu a");
        // count = count + 1;
        //  }
        // // System.out.println("so ky tu a:" +count);
        // }
        // for (int index = text.length() -1; index>= 0; index--){
        //     char character = text.charAt(index);
        //     if(character == 'o'){
        //         System.out.println("o xuat hien o vi tri:" + index);
        //     }
            

        //     switch (character){
        //         case 'a':
        //         case 'u':
        //         case 'i':
        //         case 'o':
        //         case 'e':{
        //             System.out.println("nguyen am" + character +"o vi tri: " + index);
        //         }
        //     }
        
        // }

        // int index = 0;
        // while (index < text.length()) {
        //     System.out.println("ky tu tai vi tri" + index + "la: " + text.charAt(index));
        //     index++;
        // }

        // in ra trên màn hình câu hỏi
        // hãy nhập một số bất kì
        // nếu số nhập là số chẵn thì in ra là bạn đã nhập đúng
        // nếu số nhập là số lẻ thì yêu cầu user nhập lại

        Scanner scanner = new Scanner(System.in);

    //     boolean isEven = false;
    //     do{
    //     System.out.println("hay nhap 1 so bat ky: ");
    //     int inputNumber = scanner.nextInt();
    //     if (inputNumber % 2 == 0){
    //         System.out.println("ban da nhap dung");
    //         isEven = true;
    //     }
    //  }while(isEven == false);

    //  scanner.close();

    //  System.out.println("hay nhap 1 so bat ky: ");
    //  boolean isEven = false;
    //  while(isEven == false){
    //     int inputNumber = scanner.nextInt();
    //     if (inputNumber % 2 == 0) {
    //         System.out.println("ban da nhap dung");
    //         isEven = true;
    //     }else{
    //         System.out.println("hay nhap 1 so bat ky");
    //     }
    //      }

    for (int i = 0; i < text.length(); i++) {  
        char character = text.charAt(i);
        if (character == 'o') {
            System.out.println("ky tu o dau tien o: " + i);
            break;
        }
        System.out.println("ky tu " + character);
    }




    // int j = 0;
    // while(j < text.length()){
    //     char character = text.charAt(j);
    //     if (character == 'o'){
    //         j++;
    //         continue;
    //     }
    //     System.out.println("ky tu " + character);
    //     j++;
    //     }

    // while ( true) {
    //     System.out.println("nhap so chan");
    //     int number = scanner.nextInt();
    //     if(number % 2 == 0){
    //         System.out.println("ban nhap dung roi");
    //         break;
    //     }
    // }
     }
}
