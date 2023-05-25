package inheritance;

public class SalariedEmployee extends Employee
{
    private long annualSalary;
    boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String hireDate, long annualSalary) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;

    }

    public double collectPay()
    {
        double paycheck = annualSalary/26;
        double  adjustedpay = (isRetired)?0.9*paycheck:paycheck;
        return (int) adjustedpay;
    }

    public void retire()
    {
  terminate("12/12/2023");
  isRetired=true;
    }
}
