package class13.deliverableexercise.hash.java;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DigitalHouseManager {
    private Map<Integer, Student> studentList = new HashMap<>();
    private Map<Integer, Teacher> teacherList = new HashMap<>();
    private Map<Integer, Course> courseList = new HashMap<>();
    private Set<Enrollment> enrollmentList = new HashSet<>();

    public void registerCourse(String name, Integer courseCode, Integer maxQuantityStudents) {
        courseList.put(courseCode, new Course(name, courseCode, maxQuantityStudents));
        System.out.println("Curso " + name + " registrado na Digital House.");
    }

    public void removeCourse(Integer courseCode) {
        if (courseList.containsKey(courseCode)) {
            System.out.println("Curso " + courseList.get(courseCode).getName() + " removido.");
            courseList.remove(courseList.get(courseCode));
        }
        System.out.println("Curso " + courseList.get(courseCode).getName() + " não encontrado na Digital House.");
    }

    public void registerAssistantTeacher(String name, String lastName, Integer teacherCode, Integer quantityMonitoringHours) {
        teacherList.put(teacherCode, new AssistantTeacher(name, lastName, 0, teacherCode, quantityMonitoringHours));
        System.out.println("Professor Adjunto '" + name + " " + lastName + "' registrado na Digital House.");
    }

    public void registerTitularTeacher(String name, String lastName, Integer teacherCode, String specialty) {
        teacherList.put(teacherCode, new TitularTeacher(name, lastName, 0, teacherCode, specialty));
        System.out.println("Professor Titular '" + name + " " + lastName + "' registrado na Digital House.");
    }

    public void removeTeacher(Integer teacherCode) {
        if (teacherList.containsKey(teacherCode)) {
            System.out.println("Curso " + teacherList.get(teacherCode).toString() + " removido.");
            courseList.remove(courseList.get(teacherCode));
        }
        System.out.println("Professor " + teacherList.get(teacherCode).toString() + " não encontrado na Digital House.");
    }

    public void enrollingStudent(String name, String lastName, Integer studentCode) {
        studentList.put(studentCode, new Student(name, lastName, studentCode));
    }

    public void enrollingStudent(Integer studentCode, Integer courseCode) {
        Course course = courseList.get(courseCode);
        Student student = studentList.get(studentCode);

        if (course.addStudent(student)) {
            enrollmentList.add(new Enrollment(student, course));
            System.out.println("Matrícula realizada. Aluno " + student.toString() +" adicionado no Curso " + course.getName());
        } else {
            System.out.println("Não foi possível realizar a matrícula. Curso " + course.getName() + " lotado.");
        }
    }

    public void allocateTeachers(Integer courseCode, Integer titularTeacherCode, Integer assistantTeacherCode) {
        Teacher titularTeacher = teacherList.get(titularTeacherCode);
        Teacher assistantTeacher = teacherList.get(assistantTeacherCode);
        Course course = courseList.get(courseCode);

        course.setTitularTeacher((TitularTeacher) titularTeacher);
        course.setAssistantTeacher((AssistantTeacher) assistantTeacher);
        System.out.println("Professor Titular " + titularTeacher.toString() + " e Professor Adjunto " + assistantTeacher.toString() + " alocado no Curso " + course.getName());
    }

    public Map<Integer, Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(Map<Integer, Student> studentList) {
        this.studentList = studentList;
    }

    public Map<Integer, Teacher> getTeacherList() {
        return teacherList;
    }

    public void setTeacherList(Map<Integer, Teacher> teacherList) {
        this.teacherList = teacherList;
    }

    public Map<Integer, Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(Map<Integer, Course> courseList) {
        this.courseList = courseList;
    }

    public Set<Enrollment> getEnrollmentList() {
        return enrollmentList;
    }

    public void setEnrollmentList(Set<Enrollment> enrollmentList) {
        this.enrollmentList = enrollmentList;
    }
}