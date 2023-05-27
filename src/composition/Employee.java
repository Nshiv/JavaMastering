package composition;

public class Employee
{
    private String employeeId;
    private String dept;
    private  double salary;
    private composition.Person person;

    public Employee(String employeeId, String dept, double salary, composition.Person person) {
        this.employeeId = employeeId;
        this.dept = dept;
        this.salary = salary;
        this.person = person;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getDept() {
        return dept;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public Person getPerson()
    {
        return person;
    }

}
