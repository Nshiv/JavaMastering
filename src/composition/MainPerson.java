package composition;

public class MainPerson
{
    public static void main(String[] args)
    {
       Person person = new Person("Shiv",33);
       Employee emp = new Employee("id_1","IT dept",5000,person);
       String[] courses = {"Java","python"};
       Faculty fs = new Faculty("High Rank","Regular",courses,emp);
       Staff sf = new Staff("SDET","Gurgaon",emp);

        System.out.println(sf.getPersonName());
        System.out.println(emp.getPerson().getAge());
        String[] courses1 = fs.getCorses();
        for (String course : courses1) {
            System.out.println(course);
        }





    }
}
