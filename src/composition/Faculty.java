package composition;

public class Faculty
{
    private String rank;
    private String office_Hours;
    private String[] corses;
    private composition.Employee employee;

    public Faculty(String rank, String office_Hours, String[] corses, composition.Employee employee) {
        rank = rank;
        this.office_Hours = office_Hours;
        this.corses = corses;
        this.employee = employee;
    }

    public String[] getCorses() {
        return corses;
    }
    public String getRank()
    {
        return rank;
    }
    public String getOffice_Hours()
    {
        return office_Hours;
    }

}
