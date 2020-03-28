package intellij.class13.deliverableexercise.list.java;

import android.os.Build;

import java.util.ArrayList;
import java.util.List;

public class DigitalHouseManager {
    private List<Student> studentList = new ArrayList<>();
    private List<Teacher> teacherList = new ArrayList<>();
    private List<Course> courseList = new ArrayList<>();
    private List<Enrollment> enrollmentList = new ArrayList<>();

    public void registerCourse(String name, Integer courseCode, Integer maxQuantityStudents) {
        courseList.add(new Course(name, courseCode, maxQuantityStudents));
        System.out.println("Curso " + name + " registrado na Digital House.");
    }

    public void removeCourse(Integer courseCode) {
        for (Course c : courseList) {
            if (c.getCourseCode().equals(courseCode)) {
                System.out.println("Curso " + c.getName() + " removido.");
                courseList.remove(c);
            }
        }
    }

    public void registerAssistantTeacher(String name, String lastName, Integer teacherCode, Integer quantityMonitoringHours) {
        teacherList.add(new AssistantTeacher(name, lastName, 0, teacherCode, quantityMonitoringHours));
        System.out.println("Professor Adjunto '" + name + " " + lastName + "' registrado na Digital House.");
    }

    public void registerTitularTeacher(String name, String lastName, Integer teacherCode, String specialty) {
        teacherList.add(new TitularTeacher(name, lastName, 0, teacherCode, specialty));
        System.out.println("Professor Titular '" + name + " " + lastName + "' registrado na Digital House.");
    }


    public void removeTeacher(Integer teacherCode) {
        //Eu pensei no FOR, mas a IDE me deu Essa função, Yuri ou João poderiam me explicar
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            teacherList.removeIf(teacher -> teacher.getTeacherCode().equals(teacherCode));
        }
//        for (Teacher teacher : teacherList) {
//            if (teacher.getTeacherCode().equals(teacherCode)) {
//                teacherList.remove(teacher);
//            }
//        }
    }

    public void enrollingStudent(String name, String lastName, Integer studentCode) {
        studentList.add(new Student(name, lastName, studentCode));
    }

    public void enrollingStudent(Integer studentCode, Integer courseCode) {
        Course course = getCourseInList(courseCode, courseList);
        Student student = getStudentInList(studentCode, studentList);

        if (course.addStudent(student)) {
            enrollmentList.add(new Enrollment(student, course));
            System.out.println("Matrícula realizada. Aluno " + student.toString() + " adicionado no Curso " + course.getName());
        } else {
            System.out.println("Não foi possível realizar a matrícula. Curso " + course.getName() + " lotado.");
        }
    }

    public void allocateTeachers(Integer courseCode, Integer titularTeacherCode, Integer assistantTeacherCode) {
        Teacher titularTeacher = getTeacherInList(titularTeacherCode, teacherList);
        Teacher assistantTeacher = getTeacherInList(assistantTeacherCode, teacherList);
        Course course = getCourseInList(courseCode, courseList);

        course.setTitularTeacher((TitularTeacher) titularTeacher);
        course.setAssistantTeacher((AssistantTeacher) assistantTeacher);
        System.out.println("Professor Titular " + titularTeacher.toString() + " e Professor Adjunto " + assistantTeacher.toString() + " alocado no Curso " + course.getName());

    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    public void setTeacherList(List<Teacher> teacherList) {
        this.teacherList = teacherList;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public List<Enrollment> getEnrollmentList() {
        return enrollmentList;
    }

    public void setEnrollmentList(List<Enrollment> enrollmentList) {
        this.enrollmentList = enrollmentList;
    }

    private Course getCourseInList(Integer courseCode, List<Course> courseList) {
        Course course = null;
        for (Course c : courseList) {
            if (c.getCourseCode().equals(courseCode)) {
                course = c;
                break;
            }
        }
        return course;
    }

    private Student getStudentInList(Integer studentCode, List<Student> studentList) {
        Student student = null;
        for (Student s : studentList) {
            if (s.getStudentCode().equals(studentCode)) {
                student = s;
                break;
            }
        }
        return student;
    }

    private Teacher getTeacherInList(Integer teacherCode, List<Teacher> teacherList) {
        Teacher teacher = null;
        for (Teacher t : teacherList) {
            if (t.getTeacherCode().equals(teacherCode)) {
                teacher = t;
                break;
            }
        }
        return teacher;
    }
}