package inheritance;

public class PEmployee extends Person
{
    private String empid;
    private String departMent;
    private double salary;


    public PEmployee(String name, int age, String empid, String departMent, double salary)
    {
        super(name,age);
        this.empid=empid;
        this.departMent= departMent;
        this.salary=salary;
    }

    public String getEmpid() {
        return empid;
    }
    public String getDepartMent()
    {
        return departMent;
    }

    public double getSalary()
    {
        return salary;
    }

    public void setSalary()
    {
        System.out.println(salary);
    }


}
