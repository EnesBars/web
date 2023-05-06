package bean;

import entity.Student;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;

import java.io.Serializable;

@Named
@ViewScoped
public class StudentBean implements Serializable {
    private Student student;

    private String test;

    public void createStudent() {
        System.out.println("-------------------------");
        System.out.println("Ogrenci olusturuldu " + this.student.getName() + " " + this.student.getUsername() + " " + this.student.getNumber());
        System.out.println("-------------------------");
    }

    public String getTest() {
        this.test = "Merhaba!";
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public Student getStudent() {
        if (this.student == null) {
            this.student = new Student();
        }

        return student;

    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
