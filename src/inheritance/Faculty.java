package inheritance;

public class Faculty extends PEmployee
{
    private String rank;
    private String officeHours;
    private String coursesTaught;

    public Faculty(String name, int age, String empid,
                   String departMent, double salary,
                   String rank, String officeHours,
                   String coursesTaught) {
        super(name, age, empid, departMent, salary);
        this.rank = rank;
        this.officeHours = officeHours;
        this.coursesTaught = coursesTaught;
    }

    public String getRank() {
        return rank;
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public String getCoursesTaught() {
        return coursesTaught;
    }

}
