package inheritance;

import java.util.Date;

public class Worker
{
    private  String name;
    private String birthDate;
    protected String endDate;

    public Worker(String name,String birthDate)
    {
        this.name = name;
        this.birthDate=birthDate;
    }


    public int getAge()
    {
     int currentyear = 2023;
     int birthYear = Integer.parseInt(birthDate.substring(6));
     return (currentyear-birthYear);
    }

    public double collectPay()
    {
     return 0.9;
    }

    public void terminate(String endDate)
    {
    this.endDate=endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
