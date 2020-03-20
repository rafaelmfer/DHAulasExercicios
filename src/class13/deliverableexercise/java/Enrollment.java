package class13.deliverableexercise.java;

import java.util.Date;

public class Enrollment {
    private Student student;
    private Course course;
    private Date dateOfTheDay;

    public Enrollment(Student student, Course course) {
        this.student = student;
        this.course = course;
        this.dateOfTheDay = new Date();
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Date getDateOfTheDay() {
        return dateOfTheDay;
    }

    public void setDateOfTheDay(Date dateOfTheDay) {
        this.dateOfTheDay = dateOfTheDay;
    }
}
