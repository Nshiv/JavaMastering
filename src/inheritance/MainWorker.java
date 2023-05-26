package inheritance;

public class MainWorker
{
    public static void main(String[] args)
    {
        Employee tim = new Employee("sk","11/05/1990","01/01/2023");
        System.out.println(tim);
        System.out.println("age is "+tim.getAge());
        System.out.println("pay is "+ tim.collectPay());
        System.out.println("----------------------------");
//salaried emoployee
        SalariedEmployee data = new SalariedEmployee("npk","11/05/2000","01/01/2023", 5000);
        System.out.println(data);
        System.out.println("age is "+data.getAge());
        System.out.println("paycheck  is "+ data.collectPay());
        data.retire();
        System.out.println("pension pay is "+data.collectPay());
// hourly employee
        HourlyEmployee mary = new HourlyEmployee("Mary","30/01/1994","23/10/2021",15);
        System.out.println(mary);
        System.out.println("age is "+mary.getAge());
        System.out.println("weekly paycheck is "+mary.collectPay());
        System.out.println("Holiday paycheck  is "+ mary.getDoublepay());
    }
}
