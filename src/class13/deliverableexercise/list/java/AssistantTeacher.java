package class13.deliverableexercise.list.java;

public class AssistantTeacher extends Teacher {
    private Integer quantityMonitoringHours;

    public AssistantTeacher(String name, String lastName, Integer houseTime, Integer teacherCode, Integer quantityMonitoringHours) {
        super(name, lastName, houseTime, teacherCode);
        this.quantityMonitoringHours = quantityMonitoringHours;
    }

    public Integer getQuantityMonitoringHours() {
        return quantityMonitoringHours;
    }

    public void setQuantityMonitoringHours(Integer quantityMonitoringHours) {
        this.quantityMonitoringHours = quantityMonitoringHours;
    }
}
