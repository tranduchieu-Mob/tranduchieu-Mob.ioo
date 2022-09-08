public class Person {
    private String name;
    private String birthday;
    private String job;
    
    public Person(String name, String birthday, String job) {
        this.name = name;
        this.birthday = birthday;
        this.job = job;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person [birthday=" + birthday + ", job=" + job + ", name=" + name + "]";
    }
    
}
