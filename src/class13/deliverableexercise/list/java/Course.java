package class13.deliverableexercise.list.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Course {
    private String name;
    private Integer courseCode;
    private TitularTeacher titularTeacher;
    private AssistantTeacher assistantTeacher;
    private Integer maxQuantityStudents;
    private List<Student> studentList = new ArrayList<>();

    public Course(String name, Integer courseCode, Integer maxQuantityStudents) {
        this.name = name;
        this.courseCode = courseCode;
        this.maxQuantityStudents = maxQuantityStudents;
    }

    public Boolean addStudent(Student student) {
        if (studentList.size() < maxQuantityStudents) {
            studentList.add(student);
            return true;
        } else {
            return false;
        }
    }

    public void removeStudent(Student student) {
        studentList.remove(student);
        System.out.println("Aluno Removido do Curso " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(Integer courseCode) {
        this.courseCode = courseCode;
    }

    public TitularTeacher getTitularTeacher() {
        return titularTeacher;
    }

    public void setTitularTeacher(TitularTeacher titularTeacher) {
        this.titularTeacher = titularTeacher;
    }

    public AssistantTeacher getAssistantTeacher() {
        return assistantTeacher;
    }

    public void setAssistantTeacher(AssistantTeacher assistantTeacher) {
        this.assistantTeacher = assistantTeacher;
    }

    public Integer getMaxQuantityStudents() {
        return maxQuantityStudents;
    }

    public void setMaxQuantityStudents(Integer maxQuantityStudents) {
        this.maxQuantityStudents = maxQuantityStudents;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    //Equals padrão que compara o objeto inteiro
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Course course = (Course) o;
//        return Objects.equals(name, course.name) &&
//                Objects.equals(courseCode, course.courseCode);
//    }

    //Equals que compara apenas o Código do Curso do objeto
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return Objects.equals(courseCode, course.courseCode);
    }
}