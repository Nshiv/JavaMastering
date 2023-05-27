package composition;

public class Staff
{
    private String jobTitle;
    private String office_location;
    private composition.Employee employee;

    public Staff(String jobTitle, String office_location, composition.Employee employee) {
        this.jobTitle = jobTitle;
        this.office_location = office_location;
        this.employee = employee;
    }

    public String getJobTitle()
    {
        return jobTitle;
    }
    public String getOffice_location()
    {
        return getOffice_location();
    }
    public String getPersonName()
    {
        return employee.getPerson().getName();
    }


}
