public class Department {

    private String departmentName;
    private Integer noOfEmployees;

    public Department(String departmentName, Integer noOfEmployees) {
        this.departmentName = departmentName;
        this.noOfEmployees = noOfEmployees;
    }

    // getters and setters

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Integer getNoOfEmployees() {
        return noOfEmployees;
    }

    public void setNoOfEmployees(Integer noOfEmployees) {
        this.noOfEmployees = noOfEmployees;
    }
}