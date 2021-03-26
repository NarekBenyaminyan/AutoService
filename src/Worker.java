import java.util.Date;

public class Worker {
    private String classification;
   private String firstName;
    private String lastName;
   private Date birthday;
    private String phone;
    private double salary;

    void setClassification(String value)
    {
        this.classification=value;
    }
    void setFirstName(String value)
    {
        this.firstName=value;
    }
    void setLastName(String value)
    {
        this.lastName=value;
    }
    void setBirthday(Date value)
    {
        this.birthday=value;
    }
    void setPhone(String value)
    {
        this.phone=value;
    }
    void setSalary(double value)
    {
        this.salary=value;
    }

    private String getClassification(){
        return classification;
    }
    private String getFirstName(){
        return firstName;
    }
    private String getLastName(){
        return lastName;
    }
    private Date getBirthday(){
        return birthday;
    }
    private String getPhone(){
        return phone;
    }
    private double getSalary(){
        return salary;
    }


}
