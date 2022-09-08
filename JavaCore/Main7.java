import java.util.Scanner;
public class Main7 {
   
    static void printLuong(Employee[] list, int index) {
        System.out.println(list[index].wage);
    }
    static void mangGiamDan(Employee[] Employeelist){
        Employee trungGian;
        for( int i= 0; i < Employeelist.length -1; i++){
            for(int j= i + 1; j < Employeelist.length; j++){
                if(Employeelist[i].wage< Employeelist[j].wage){
                    trungGian = Employeelist[i];
                    Employeelist[i] = Employeelist[j];
                    Employeelist[j] = trungGian;
                }
            }
        }
    }
    public static void main(String[] args) {

        Employee[] Employeelist = new Employee[5];
        Employeelist[0] = new Employee("NV01", "Nguyen Kim Cong", "20/04/1998", GenDer.NAM,30.589);
        Employeelist[1] = new Employee("NV02", "Nguyen Tuan Anh", "12/04/2002", GenDer.NAM,10.808);
        Employeelist[2] = new Employee("NV03", "Tran Duc Hieu", "30/05/1995", GenDer.NAM,16.312);
        Employeelist[3] = new Employee("NV04", "Nguyen Thanh Tung", "10/04/1997", GenDer.NU,20.903);
        Employeelist[4] = new Employee("NV05", "Nguyen Van Anh", "15/03/1989", GenDer.NU,10.507);
    
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tim ID: ");
        String checkID = scanner.nextLine();
        for (Employee employee : Employeelist) {
            if (employee.checkID(checkID)) {
                employee.inThongTinNhanVien();
            }
        }
        System.out.print("Tim theo ten: ");
        String checkNAME = scanner.nextLine();
        for (Employee employee : Employeelist) {
            if (employee.checkName(checkNAME)) {
                employee.inThongTinNhanVien();
            }
        }
        int Nam = 0, Nu = 0;
        for (Employee employee : Employeelist) {
            if (employee.gender == GenDer.NAM) {
                Nam++;
            } else {
                Nu++;
            }
        }
        System.out.println("nam: " + Nam + ", nu: " + Nu);

        System.out.println("nhan vien tren 30t");
        for(Employee employee: Employeelist){
            if (employee.isGreater30YearOld()){
                employee.inThongTinNhanVien();
            }
        }
        System.out.print("nhap thang can kiem tra nhan vien co sinh nhat: ");
        int month= scanner.nextInt();
        for(Employee employee: Employeelist){
            if (employee.checkBirthMonth(month)){
                employee.inThongTinNhanVien();
            }
        }
        mangGiamDan(Employeelist);
        System.out.println("top 3 nguoi luong cao la:");
        Employeelist[0].inThongTinNhanVien();
        Employeelist[1].inThongTinNhanVien();
        Employeelist[2].inThongTinNhanVien();
        scanner.close();
        







        // Employee employee = new Employee("NV01","Nguyen Van A","20/04/1998",GenDer.NAM,30.500);
        // System.out.println("Ket qua ban dau: ");
        // System.out.println(employee.getid() + " - " + employee.getname() + " - " + employee.getdate() + " - " + employee.getgioitinh() + " - " + employee.getwage());

        // //Cập nhật lại thông tin
        // employee.setid("NV02");
        // employee.setname("Nguyen Van B");
        // employee.setgender(GenDer.NAM);
        // employee.setwage(20.800);
        // System.out.println("Sau khi cập nhật: ");
        // System.out.println(employee.getid() + " - " + employee.getname() + " - " + employee.getgioitinh() + " - " + employee.getwage());
    }
}


