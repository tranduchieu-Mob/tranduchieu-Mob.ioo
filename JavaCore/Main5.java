import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.Random;

public class Main5 {
        // Bài 1
        // public static void main(String[] args) {
        //   Scanner scanner = new Scanner(System.in);
        //   int hight;
        //   System.out.printf("\n\nchieu cao cua tam giac: ");
        //   hight = scanner.nextInt();
        //   for (int i = 1; i <= hight; ++i) {
        //     for (int j = 1; j <= i; ++j) {
        //       System.out.print(" *");
        //     }
        //     System.out.println();
        //   }
        // }

        // public static void main(String[] args) {
        //     int height;
        //     int width;
        //     int i;
        //     Scanner scanner = new Scanner(System.in);
        //     System.out.print("height = ");
        //     height = scanner.nextInt();
        //     System.out.print("width = ");
        //     width = scanner.nextInt();
        //     for(i = 1; i <= height; i++){
        //         for(int j = 1; j <= width; j++) {
        //         System.out.print(" *");
        //         }
        //         System.out.println("");
        //         scanner.close();
        //     }
        // }

        //Bài 3
        // public static boolean isPrimeNumber(int n) {
        //     if (n < 2) {
        //         return false;
        //         }
        //         int squareRoot = (int) Math.sqrt(n);
        //         for (int i = 2; i <= squareRoot; i++) {
        //         if (n % i == 0) {
        //         return false;
        //         }
        //         }
        //         return true;
        // }
        // public static void main(String[] args) {
        //     usingRandomClass();
        // }
        // static void usingRandomClass() {
        //     Scanner scanner=new Scanner(System.in);
        //     int n;
        //     for (int i=0; i<5; i++) {
        //         Random random = new Random();
        //         n = random.nextInt(100)+1;
        //         if(isPrimeNumber(n)){
        //             System.out.println("Random number is " + n +" la so nguyen to");
        //         } else {
        //             System.out.println("Random number is " + n +" khong la so nguyen to");
        //         }
        //     }
        //     scanner.close();
        // }

    //Bài 4
    //     public static void main(String[] args) {
    //         Scanner scanner = new Scanner(System.in);
    //         System.out.print("Nhap n = ");
    //         int n = scanner.nextInt();
    //         System.out.printf("%d so nguyen to dau tien la: \n", n);
    //         int DEM = 0; // đếm số số nguyên tố
    //         int i = 2;   // tìm số nguyên tố bắt dầu từ số 2
    //         while (DEM < n) {
    //             if (isPrimeNumber(i)) {
    //                 System.out.print(i + " ");
    //                 DEM++;
    //             }
    //             i++;
    //         }
    //         scanner.close();
    //     }
    //     public static boolean isPrimeNumber(int n) {
    //         if (n < 2) {
    //             return false;
    //         }
    //         int squareRoot = (int) Math.sqrt(n);
    //         for (int i = 2; i <= squareRoot; i++) {
    //             if (n % i == 0) {
    //                 return false;
    //             }
    //         }
    //         return true;
    // }

    // public static void main(String[] args) {
    //     Scanner scanner = new Scanner(System.in);
    //     System.out.print("Nhap n = ");
    //     int n = scanner.nextInt();
    //     System.out.printf("Tat ca cac so nguyen to nho hon %d la: \n", n);
    //     if (n >= 2) {
    //         System.out.print(2);
    //     }
    //     for (int i = 3; i < n; i+=2) {
    //         if (isPrimeNumber(i)) {
    //             System.out.print(" " + i);
    //         }
    //     }
    //     scanner.close();
    // }
    // public static boolean isPrimeNumber(int n) {
    //     // so nguyen n < 2 khong phai la so nguyen to
    //     if (n < 2) {
    //         return false;
    //     }
    //     // check so nguyen to khi n >= 2
    //     int squareRoot = (int) Math.sqrt(n);
    //     for (int i = 2; i <= squareRoot; i++) {
    //         if (n % i == 0) {
    //             return false;
    //         }
    //     }
    //     return true;
    // }

    //Bài 6
    public static void main(String args[]) {
        String phone;
        String email;
        String EMAIL_PATTERN =
            "^[a-zA-Z][\\w-.]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$";
    
        String PHONE_PATTERN =
            "[0-9]{9,11}";
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Nhap email: ");
        email = scanner.nextLine();
        System.out.println("Nhap phone: ");
        phone = scanner.nextLine();

        if (Pattern.matches(EMAIL_PATTERN, email)) {
          System.out.println("Email chinh xac");
        } else {
          System.out.println("Email khong dung dinh dang");
        }
    
        if (Pattern.matches(PHONE_PATTERN, phone)) {
          System.out.println("Phone chinh xac");
        } else {
          System.out.println("Phone khong dung dinh dang");
        }
        scanner.close();
      }

    //Bài 2
    // public static int count(String s)
    // {
    //     int i = 0, count = 1;
    //     char[] s1 = s.toCharArray();
    //     while(s1[i] == ' ')
    //     {
    //         i++;
    //     }
    //     for (int j = i; j < s1.length - 1; j++)
    //     {
    //         if(s1[j] == ' ' && s1[j + 1] != ' ')
    //         {
    //             count++;
    //         }
    //     }
    //     return count;
    // }
    // public static void main(String[] args)
    // {
    //     System.out.println("so tu = " + count("You only live once, but if you do it right, once is enough"));
    //         int count = 0;
    //         String text = "You only live once, but if you do it right, once is enough";
    //         for (int index = 0; index < text.length(); index++) {
    //             char character = text.charAt(index);
    //             if (character == 'o') {
    //                 count++;
    //             }
    //         }
    //         System.out.println("So lan xuat hien cua ki tu o = "+ count);
    //         for (int index = text.length() - 1; index >= 0; index--) {
    //                 char character = text.charAt(index);
    //                 if (character == 'o') {
    //                 System.out.println("o xuat hien o vi tri: " + index);
    //                 }
    //             }
    //     }

    //Bài5
    // public static void main(String[] args) {
    //     int M, N;
    //     Scanner scanner = new Scanner(System.in);  
    //     System.out.println("Nhap vao so dong cua mang: ");
    //     M = scanner.nextInt();
    //     System.out.println("Nhap vao so cot cua mang: ");
    //     N = scanner.nextInt();
    //     // khai báo và cấp phát bộ nhớ cho mảng
    //     int[][] A = new int[M][N];
    //     for (int i = 0; i < M; i++) {
    //         for (int j = 0; j < N; j++) {
    //             System.out.print("Nhap phan tu thu [" + i + ", " + j + "]: ");
    //             A[i][j] = scanner.nextInt();
    //         }
    //     }
    //     // hiển thị các phần tử trong mảng vừa nhập
    //     System.out.println("Mang vua nhap: ");
    //     for (int i = 0; i < M; i++) {
    //         for (int j = 0; j < N; j++) {
    //             System.out.print(A[i][j] + "\t");
    //         }
    //         System.out.println("\n");
    //     }
    //     System.out.println("Phan tu tren duong cheo chinh : \n" + A[0][0]);
    //     System.out.println(A[1][1]);
    //     System.out.println(A[2][2]);
    // }


// public static void main(String[] args) {
//     int M;
//     int N;
//     Scanner scanner = new Scanner(System.in);   
//     do {
//         System.out.println("Nhap vao so dong cua ma tran:");
//         M = scanner.nextInt();
//         System.out.println("Nhap vao so cot cua ma tran:");
//         N = scanner.nextInt();
//     } while (M < 1 || N < 1);
//     int A[][] = new int[M][N];
//     int B[][] = new int[M][N];
//     int C[][] = new int[M][N];
         
//     System.out.println("Nhap cac phan tu cho ma tran A:");
//     for (int i = 0; i < M; i++) {
//         for (int j = 0; j < N; j++) {
//             System.out.print("A[" + i + "," + j + "] = ");
//             A[i][j] = scanner.nextInt();
//         }
//     }   
//     System.out.println("Nhap cac phan tu cho ma tran B:");
//     for (int i = 0; i < M; i++) {
//         for (int j = 0; j < N; j++) {
//             System.out.print("B[" + i + "," + j + "] = ");
//             B[i][j] = scanner.nextInt();
//         }
//     }
//     System.out.println("A:");
//     for (int i = 0; i < M; i++) {
//         for (int j = 0; j < N; j++) {
//             System.out.print(A[i][j] + "\t");
//         }
//         System.out.println("\n");
//     }
         
//     System.out.println("B:");
//     for (int i = 0; i < M; i++) {
//         for (int j = 0; j < N; j++) {
//             System.out.print(B[i][j] + "\t");
//         }
//         System.out.println("\n");
//     }
//     // Để tính tổng hai ma trận
//     for (int i = 0; i < M; i++) {
//         for (int j = 0; j < N; j++) {
//             C[i][j] = A[i][j] + B[i][j];
//         }
//     }
//     // hiển thị ma trận tổng C
//     System.out.println("tong C:");
//     for (int i = 0; i < M; i++) {
//         for (int j = 0; j < N; j++) {
//             System.out.print(C[i][j] + "\t");
//         }
//         System.out.println("\n");
//     }
// }
}

