import java.util.Scanner;


public class Main3 {

    static void bai1 (){
        int sum = 0 ;
        int a;
        do {
            System.out.println("so nguyen duong a = ");  
            Scanner scanner = new Scanner(System.in);
            a = scanner.nextInt();
           
        }while(a <= 0);
        for(int i = 1; i <= a; i++) {
            sum += i;
        }
        System.out.println("tong = " + sum);
        
    }
    static void bai2 (){
        int primeCount = 0;
        int primeTotal = 0;
        int num = 2;
        System.out.println("100 so nguyen to dau tien: ");
           while(primeCount <= 100) {
           if (num == 2) {
           }
            
            boolean isPrime = true;
           for(int i = 2; i <= num / 2; i++) {
            int temp =  num % i;
            if(temp == 0){
            isPrime = false;
            break;
            }
           }
             
            if (isPrime == true) { 
              System.out.println(num);
              primeCount ++;
              primeTotal += num;
            }
            num++;
          }
          System.out.println("tong cac so nguyen to bang : " + primeTotal);
    }
    static void bai3 (){
        int tong = 0;
        int positiveNumber = 0;
        int digitSum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("hay nhap so nguyen duong: ");
        positiveNumber = scanner.nextInt();
           while (positiveNumber>0){
           digitSum = positiveNumber % 10;
           positiveNumber = positiveNumber / 10;
            tong += digitSum;
           }
           System.out.println("tong ca chu so: " + tong);
        }

    public static void main(String args[]){

        bai1();
        bai2();
        bai3();
        // Bài 1
    //     int sum = 0 ;
    //     int a;
    //     do {
    //         System.out.println("so nguyen duong a = ");  
    //         Scanner scanner = new Scanner(System.in);
    //         a = scanner.nextInt();
    //         scanner.close();
    //     }while(a <= 0);
    //     for(int i = 1; i <= a; i++) {
    //         sum += i;
    //     }
    //     System.out.println("tong = " + sum);
        
    }

      //Bài 2 
        // int primeCount = 0;
        // int primeTotal = 0;
        // int num = 2;
        // System.out.println("100 so nguyen to dau tien: ");
        //    while(primeCount <= 100) {
        //    if (num == 2) {
        //    }
            
        //     boolean isPrime = true;
        //    for(int i = 2; i <= num / 2; i++) {
        //     int temp =  num % i;
        //     if(temp == 0){
        //      isPrime = false;
        //       break;
        //       }
        //    }
             
        //     if (isPrime == true) { 
        //       System.out.println(num);
        //       primeCount ++;
        //       primeTotal += num;
        //     }
        //     num++;
        //   }
        //   System.out.println("tong cac so nguyen to bang : " + primeTotal);

    // public static void main(String args[]){
    //     // Bài 3
    //     Scanner scanner = new Scanner(System.in);
    //     System.out.println("hay nhap so nguyen duong: ");
    //     int tong = 0;
    //     int positiveNumber = 0;
    //     int digitSum = 0;
    //     positiveNumber = scanner.nextInt();
    //        while (positiveNumber>0){
    //        digitSum = positiveNumber % 10;
    //        positiveNumber = positiveNumber / 10;
    //         tong += digitSum;
    //        }
    //        System.out.println("tong ca chu so: " + tong);
    //        scanner.close();
    //     }

    // public static void main(String args[]){
    // // Bài 4
    // Scanner scanner = new Scanner(System.in);
    // int i = 1;
    // int a;
    // int tich;
    // System.out.println();
    // a = scanner.nextInt();
    // while(i < 10){
    //     i++;
    //     tich = a * i ;
    //     System.out.println(tich);
    // }
    // scanner.close();
    // }

    // public static void main(String[] args) {
    //     // Bài 5
    //     String s = "techmaster hoc la co viec";
    //     System.out.println("Input a string: " + s);
        
    //     System.out.print("Reversed string: ");
    //     int i = s.length();
    //     while(i>0) {
    //       System.out.print(s.charAt(i-1));
    //       i--;
    //     }
    //   }


    // Bài 6
    // public static void main(String[] args) {
    //     Scanner scanner = new Scanner(System.in);
    //     String message;
    //     System.out.println("Nhap chu can in hoa ky tu dau: ");
    //     message = scanner.nextLine();
    //     char[] charArray = message.toCharArray();
    //     boolean foundSpace = true;
    //     for(int i = 0; i < charArray.length; i++) {
    //       if(Character.isLetter(charArray[i])) {
    //         if(foundSpace) {
    //           charArray[i] = Character.toUpperCase(charArray[i]);
    //           foundSpace = false;
    //         }
    //       }
    //       else {
    //         foundSpace = true;
    //       }
    //     }
    //     message = String.valueOf(charArray);
    //     System.out.println("Chu sau khi doi: " + message);
    //     scanner.close();
    // }

//     public static void main(String[] args) {
//         // Bài 7
//         Scanner scanner = new Scanner(System.in);
//         int h, p, s;
//         System.out.println("nhap so giay : ");
//         int giay = scanner.nextInt();
//         h =  (giay/3600);
//         p =  ((giay - (h*3600))/60);
//         s =  giay - (h*3600 + p*60 );
//         System.out.println(giay + " giay = " + h + " gio " +  p + " phut "+  s + " giay " ) ;
//         scanner.close();
// }


//      // Bài 8
//      public static void main(String[] args) {
//      Scanner scanner = new Scanner (System.in); 
//      String Original = "";
//      System.out.println("nhap chu :");
//      Original = scanner.nextLine();
//      scanner.close();
//      uniqueCharacters(Original);
//      }
//     public static void uniqueCharacters(String test){
//       String temp = "";
//          for (int i = 0; i < test.length(); i++){
//             if (temp.indexOf(test.charAt(i)) == - 1){
//                temp = temp + test.charAt(i);
//          }
//       }
//     System.out.println(temp + " ");
//  }

 // // sử dụng class Scanner để nhận dữ liệu từ bàn phím
        // Scanner scanner = new Scanner(System.in);
        // String message;
        // System.out.println("Nhap chu can in hoa ky tu dau: ");
        // message = scanner.nextLine();
        // //khai báo một mảng, sau đó sử dụng phương thức toCharArray() 
        // //để chuyển đổi message thành một mảng kiểu char
        // char[] charArray = message.toCharArray();
        // boolean foundSpace = true;
        // //sử dụng vòng lặp for để duyệt các phần tử trong charArray
        // for(int i = 0; i < charArray.length; i++) {
        //   // nếu phần tử trong mảng là một chữ cái
        //   if(Character.isLetter(charArray[i])) {
        //     // kiểm tra khoảng trắng có trước chữ cái
        //     if(foundSpace) {
        //       //đổi chữ cái thành chữ in hoa bằng phương thức toUpperCase()
        //       charArray[i] = Character.toUpperCase(charArray[i]);
        //       foundSpace = false;
        //     }
        //   }
        //   else {
        //     foundSpace = true;
        //   }
        // }
        // // chuyển đổi mảng char thành string
        // message = String.valueOf(charArray);
        // System.out.println("Chu sau khi doi: " + message);
        // scanner.close();
}
