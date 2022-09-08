import java.util.Scanner;

public class Lab5 {
    public static void main(String[] args) {
        Book[] Booklist = new Book[5];
        Booklist[0] = new Book("Book1",
                               "Toan hoc",
                               "Nguyen van a",
                               "SGK",
                               "Giao Duc",
                               1998);
        Booklist[1] = new Book("BOOK2",
                               "Van hoc",
                               "Nguyen Van B",
                               "SGK",
                               "Giao Duc",
                               2000);
        Booklist[2] = new Book("BOOK3",
                               "Toan Nang Cao",
                               "Nguyen Van C",
                               "Tham khao",
                               "Tre",
                               2021);
        Booklist[3] = new Book("BOOK4",
                               "Naruto",
                               "Kishimoto Masashi",
                               "Hành động, Võ thuật, Nhẫn giả, Phiêu lưu, Hài hước",
                               "Shueisha",
                                1999);
        Booklist[4] = new Book("BOOK5",
                               "One piece",
                               "Oda Eiichiro",
                               "Hành động, Võ thuật, Phiêu lưu, Hài hước",
                               "Shueisha",
                               1997);
        
        for(Book book : Booklist){
            System.out.println(book.tensach);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap tu khoa ten sach");
        String keyword = scanner.nextLine();
        scanner.close();

        for(int index = 0; index < Booklist.length; index++){
            Book book = Booklist[index];
            if(book.hasKeyword(keyword)){
                System.out.println("ten sach: " + book.tensach); 
            }
        }

        // int checkYear = 2022;
        // for (Book book : Booklist) {
        //     if (book.checkPushlistYear(checkYear)) {
        //         System.out.println("Sach xuat ban nam " + checkYear + ": " + book.tensach);
        //     }
        // }
    }
}
