public class Employee {

    

    public Employee() {
    }
    public Employee(int empId, String department, int salary) {
        this.empId = empId;
        this.department = department;
        this.salary = salary;
    }
    private int empId;
    private String department;
    private int salary;
    public int getEmpId() {
        return empId;
    }
    public void setEmpId(int empId) {
        this.empId = empId;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Employee [department=" + department + ", empId=" + empId + ", salary=" + salary + "]";
    }
    
    
}
