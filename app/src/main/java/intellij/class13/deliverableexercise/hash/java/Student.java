package intellij.class13.deliverableexercise.hash.java;

import java.util.Objects;

public class Student {
    private String name;
    private String lastName;
    private Integer studentCode;

    public Student(String name, String lastName, Integer studentCode) {
        this.name = name;
        this.lastName = lastName;
        this.studentCode = studentCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(Integer studentCode) {
        this.studentCode = studentCode;
    }

    //Equals padrão que compara o objeto inteiro
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Student student = (Student) o;
//        return Objects.equals(nome, aluno.nome) &&
//                Objects.equals(numeroDoAluno, aluno.numeroDoAluno);
//    }

    //Equals que compara apenas o Código do Aluno do objeto
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(studentCode, student.studentCode);
    }

    @Override
    public String toString() {
        return "'" + name + " " + lastName + '\'';
    }
}