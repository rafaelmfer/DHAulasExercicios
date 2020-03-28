package intellij.class13.deliverableexercise.list.java;

import java.util.Objects;

public abstract class Teacher {
    private String name;
    private String lastName;
    private Integer houseTime;
    private Integer teacherCode;

    public Teacher(String name, String lastName, Integer houseTime, Integer teacherCode) {
        this.name = name;
        this.lastName = lastName;
        this.houseTime = houseTime;
        this.teacherCode = teacherCode;
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

    public Integer getHouseTime() {
        return houseTime;
    }

    public void setHouseTime(Integer houseTime) {
        this.houseTime = houseTime;
    }

    public Integer getTeacherCode() {
        return teacherCode;
    }

    public void setTeacherCode(Integer teacherCode) {
        this.teacherCode = teacherCode;
    }

    //Equals padrão que compara o objeto inteiro
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Teacher teacher = (Teacher) o;
//        return Objects.equals(name, teacher.name) &&
//                Objects.equals(teacherCode, teacher.teacherCode);
//    }

    //Equals que compara apenas o Código do Professor do objeto
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return Objects.equals(teacherCode, teacher.teacherCode);
    }

    @Override
    public String toString() {
        return "'" + name + " " + lastName + '\'';
    }
}