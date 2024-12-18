import java.time.LocalDate;

public class User {
    protected String name;
    protected LocalDate dob ;

    public User(String name ,int year,int month ,int day){
        this.name = name;
        this.dob = LocalDate.of(year,month ,day);
    }

    public void displayInfo(){
        System.out.println("Username : " + this.name);
        System.out.println("Date of Birth : " + this.dob);

    }

}
