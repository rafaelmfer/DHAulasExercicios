package class13.deliverableexercise.hash.java;

public class TitularTeacher extends Teacher {
    private String specialty;

    public TitularTeacher(String name, String lastName, Integer houseTime, Integer teacherCode, String specialty) {
        super(name, lastName, houseTime, teacherCode);
        this.specialty = specialty;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
}
