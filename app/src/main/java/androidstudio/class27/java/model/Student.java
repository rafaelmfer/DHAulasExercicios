package androidstudio.class27.java.model;

public class Student {
    private String name;
    private String registerCode;

    public Student(String name, String registerCode) {
        this.name = name;
        this.registerCode = registerCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegisterCode() {
        return registerCode;
    }

    public void setRegisterCode(String registerCode) {
        this.registerCode = registerCode;
    }
}