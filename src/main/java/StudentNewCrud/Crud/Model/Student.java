package StudentNewCrud.Crud.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "New_Student_Data")
public class Student {

    @Id
    @GeneratedValue
    Long id;
    @Column(name = "F_name")
   private String Fname;
    @Column(name = "L_name")
   private String Lname;
    @Column(name = "Email")
   private String Email;

    @Column(name = "Age")
   private int Age;

    public Student() {
    }

    public Student(String fname, String lname, String email, int age) {
        Fname = fname;
        Lname = lname;
        Email = email;
        Age = age;
    }


    public String getFname() {
        return Fname;
    }

    public void setFname(String fname) {
        Fname = fname;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String lname) {
        Lname = lname;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }
}
