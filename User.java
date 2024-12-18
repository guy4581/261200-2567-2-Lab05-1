import java.time.LocalDate;

public class User {
    private String name;
    private LocalDate dob ;

    public User(String name ,int year,int month ,int day){
        this.name = name;
        this.dob = LocalDate.of(year,month ,day);
    }

    public String getName(){return this.name;}
    public LocalDate getDob(){return this.dob;}
    public void displayInfo(){
        System.out.println("Username : " + getName());
        System.out.println("Date of Birth : " + getDob());

    }

}
