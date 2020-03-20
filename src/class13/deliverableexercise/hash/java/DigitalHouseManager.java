package class13.deliverableexercise.hash.java;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DigitalHouseManager {
    private Map<Integer, Student> studentHashMap = new HashMap<>();
    private Map<Integer, Teacher> teacherHashMap = new HashMap<>();
    private Map<Integer, Course> courseHashMap = new HashMap<>();
    private Set<Enrollment> enrollmentHashSet = new HashSet<>();

    public void registerCourse(String name, Integer courseCode, Integer maxQuantityStudents) {
        courseHashMap.put(courseCode, new Course(name, courseCode, maxQuantityStudents));
        System.out.println("Curso " + name + " registrado na Digital House.");
    }

    public void removeCourse(Integer courseCode) {
        if (courseHashMap.containsKey(courseCode)) {
            System.out.println("Curso " + courseHashMap.get(courseCode).getName() + " removido.");
            courseHashMap.remove(courseHashMap.get(courseCode));
        }
        System.out.println("Curso " + courseHashMap.get(courseCode).getName() + " não encontrado na Digital House.");
    }

    public void registerAssistantTeacher(String name, String lastName, Integer teacherCode, Integer quantityMonitoringHours) {
        teacherHashMap.put(teacherCode, new AssistantTeacher(name, lastName, 0, teacherCode, quantityMonitoringHours));
        System.out.println("Professor Adjunto '" + name + " " + lastName + "' registrado na Digital House.");
    }

    public void registerTitularTeacher(String name, String lastName, Integer teacherCode, String specialty) {
        teacherHashMap.put(teacherCode, new TitularTeacher(name, lastName, 0, teacherCode, specialty));
        System.out.println("Professor Titular '" + name + " " + lastName + "' registrado na Digital House.");
    }

    public void removeTeacher(Integer teacherCode) {
        if (teacherHashMap.containsKey(teacherCode)) {
            System.out.println("Curso " + teacherHashMap.get(teacherCode).toString() + " removido.");
            courseHashMap.remove(courseHashMap.get(teacherCode));
        }
        System.out.println("Professor " + teacherHashMap.get(teacherCode).toString() + " não encontrado na Digital House.");
    }

    public void enrollingStudent(String name, String lastName, Integer studentCode) {
        studentHashMap.put(studentCode, new Student(name, lastName, studentCode));
    }

    public void enrollingStudent(Integer studentCode, Integer courseCode) {
        Course course = courseHashMap.get(courseCode);
        Student student = studentHashMap.get(studentCode);

        if (course.addStudent(student)) {
            enrollmentHashSet.add(new Enrollment(student, course));
            System.out.println("Matrícula realizada. Aluno " + student.toString() +" adicionado no Curso " + course.getName());
        } else {
            System.out.println("Não foi possível realizar a matrícula. Curso " + course.getName() + " lotado.");
        }
    }

    public void allocateTeachers(Integer courseCode, Integer titularTeacherCode, Integer assistantTeacherCode) {
        Teacher titularTeacher = teacherHashMap.get(titularTeacherCode);
        Teacher assistantTeacher = teacherHashMap.get(assistantTeacherCode);
        Course course = courseHashMap.get(courseCode);

        course.setTitularTeacher((TitularTeacher) titularTeacher);
        course.setAssistantTeacher((AssistantTeacher) assistantTeacher);
        System.out.println("Professor Titular " + titularTeacher.toString() + " e Professor Adjunto " + assistantTeacher.toString() + " alocado no Curso " + course.getName());
    }

    public Map<Integer, Student> getStudentHashMap() {
        return studentHashMap;
    }

    public void setStudentHashMap(Map<Integer, Student> studentHashMap) {
        this.studentHashMap = studentHashMap;
    }

    public Map<Integer, Teacher> getTeacherHashMap() {
        return teacherHashMap;
    }

    public void setTeacherHashMap(Map<Integer, Teacher> teacherHashMap) {
        this.teacherHashMap = teacherHashMap;
    }

    public Map<Integer, Course> getCourseHashMap() {
        return courseHashMap;
    }

    public void setCourseHashMap(Map<Integer, Course> courseHashMap) {
        this.courseHashMap = courseHashMap;
    }

    public Set<Enrollment> getEnrollmentHashSet() {
        return enrollmentHashSet;
    }

    public void setEnrollmentHashSet(Set<Enrollment> enrollmentHashSet) {
        this.enrollmentHashSet = enrollmentHashSet;
    }
}