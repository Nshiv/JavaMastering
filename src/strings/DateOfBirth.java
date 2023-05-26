package strings;

public class DateOfBirth
{
    public static void main(String[] args) {
        String dob = "12/01/1989";
        //Getting index of Day of DOB
        int indexOfDate = dob.indexOf("/");
        //System.out.println("Index of day in date of birth "+indexOfDate);
        System.out.println("Day in date of birth is "+dob.substring(0,indexOfDate));
        // getting index of month in date of birth
        int indexofMonth = dob.indexOf("/",indexOfDate+1);
        //System.out.println(indexofMonth);
        System.out.println("Month in DOB is "+dob.substring(indexOfDate+1,indexofMonth));
        // getting index of Year in date of birth
        int yearIndex = dob.lastIndexOf("/");
        System.out.println("Year is "+ dob.substring(yearIndex+1));

    }
}
