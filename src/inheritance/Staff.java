package inheritance;

public class Staff extends PEmployee
{
    private String jobTitle;
    private String officeLOcation;

    public Staff(String name, int age, String empid,
                 String departMent, double salary,
                 String jobTitle, String officeLOcation) {
        super(name, age, empid, departMent, salary);
        this.jobTitle = jobTitle;
        this.officeLOcation = officeLOcation;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getOfficeLOcation() {
        return officeLOcation;
    }
}
