import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
enum GenDer{
    NAM,NU;
}
public class Employee {
    public String id;
    public String name;
    public GenDer gender;
    public LocalDate date;
    public double wage;
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public Employee(String id, String name, String date,GenDer gender, Double wage){
        this.id = id;
        this.name = name;
        this.wage = wage;
        this.date = LocalDate.parse(date,this.formatter);
        this.gender=gender;
    }
    public boolean checkID(String checkID){
        boolean result= this.id.equals(checkID);
        return result;
    }
    public boolean checkName(String checkNAME) {
        boolean result= this.name.contains(checkNAME);
        return result;
    }
    public void inThongTinNhanVien(){
        System.out.print(this.id+ "\t");
        System.out.print(this.name+ "\t");
        System.out.print(this.date+ "\t");
        System.out.print(this.gender+ "\t");
        System.out.print(this.wage+ "vnd\n");
    }
    public boolean isGreater30YearOld(){
        LocalDate now= LocalDate.now();
        int age = Period.between(this.date, now).getYears();
        boolean result= (age > 30)? true: false;
        return result;
    }
    public boolean checkBirthMonth(int month){
        boolean result= this.date.getMonthValue()==month;
        return result;
    }
    public boolean checkluongThang(Double wage){
        boolean result= this.wage == wage;
        return result;
    }
    public void setBirthday(String birthday) {
        this.date = LocalDate.parse(birthday, this.formatter);
    }
    public String getBirthday() {
        return this.date.format(this.formatter);
    }




    // public String getid() {
    //     return id;
    // }
 
    // public void setid(String id) {
    //     this.id = id;
    // }
    // public String getname() {
    //     return name;
    // }
 
    // public void setname(String name) {
    //     this.name = name;
    // }
    // public GenDer getgioitinh() {
    //     return gender;
    // }
    // public void setgender(GenDer gender) {
    //     this.gender = gender;
    // }
    // public LocalDate getdate() {
    //     return date;
    // }
    // public void setdate(LocalDate date) {
    //     this.date = date;
    // }
    // public double getwage() {
    //     return wage;
    // }
    // public void setwage(Double wage) {
    //     this.wage = wage;
    // }
}
