// package mypack.animal;
// import javax.lang.model.element.Element;

// // enum GENDER{
// // MAlE , FEMALE;
// // }

// public class Dog {
//     public String breed;
//     public String size;
//     public int age;
//     public String color;

//     public GENDER gender; //1 = male; 2 = female

//     public Dog() {
//         breed = "abx";
//         size = "Small";
//         age = 2;
//         color = "grey";
//     }
//     public Dog(String Breed, String Size, int Age, String Color){
//         this.breed = Breed;
//         this.size = Size;
//         this.age = Age;
//         this.color = Color;
//     }

//     public void printGender(){
//         if(this.gender == GENDER.MAlE){
//             System.out.println("gioi tinh duc");
//         }else if(this.gender == GENDER.FEMALE){
//             System.out.println("gioi tinh cai");
//         }else {
//             System.out.println("khong biet gioi tinh");
//         }
//     }

//     public void eat(){
//         System.out.println("mum mum mum");
//     }
//     public void bark(){
//         System.out.println("go go go ...");
//     }

//     // in ra các thuộc tính
//     public void print() {
//         System.out.println(this.breed);
//         System.out.println(this.size);
//         System.out.println(this.age);
//         System.out.println(this.color);
//         String textToPrint = this.toString();
//         System.out.println(textToPrint);
//     }

//     // convert objecht to text
//     public String toString(){
//         String text = this.breed + " " +this.size + " " + this.age + " " + this.color + " ";
//         return text;
//     }
// }
