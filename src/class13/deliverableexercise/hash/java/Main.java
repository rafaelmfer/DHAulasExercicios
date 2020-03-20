package class13.deliverableexercise.hash.java;

public class Main {
    public static void main(String[] args) {
        DigitalHouseManager digitalHouseManager = new DigitalHouseManager();

        digitalHouseManager.registerTitularTeacher("Yuri", "Kayel", 1001, "Android");
        digitalHouseManager.registerTitularTeacher("Jessica", "Corrêa", 1002,"Android");
        System.out.println();
        digitalHouseManager.registerAssistantTeacher("Ivan", "Alineri", 2001, 150);
        digitalHouseManager.registerAssistantTeacher("João", "Felipe", 2002, 100);
        System.out.println();
        digitalHouseManager.registerCourse("Full Stack", 20001, 3);
        digitalHouseManager.registerCourse("Android", 20002, 2);
        System.out.println();
        digitalHouseManager.allocateTeachers(20001, 1002, 2002);
        digitalHouseManager.allocateTeachers(20002, 1001, 2001);
        System.out.println();
        digitalHouseManager.enrollingStudent("Robson", "Hamilton", 105);
        digitalHouseManager.enrollingStudent(105,20001);
        digitalHouseManager.enrollingStudent("Alex", "Graciano", 102);
        digitalHouseManager.enrollingStudent(102,20001);
        System.out.println();
        digitalHouseManager.enrollingStudent("Rafael", "Ferreira", 101);
        digitalHouseManager.enrollingStudent(101,20002);
        digitalHouseManager.enrollingStudent("Raquel", "Campos", 103);
        digitalHouseManager.enrollingStudent(103,20002);
        System.out.println();
        digitalHouseManager.enrollingStudent("Danny", "Phantom", 104);
        digitalHouseManager.enrollingStudent(104,20002);
    }
}
