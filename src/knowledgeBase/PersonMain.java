package knowledgeBase;

public class PersonMain
{
    public static void main(String[] args)
    {
        Person pa = new Person();
        pa.setFirstName("Lorem");
        pa.setLastName("Ipsum");
        pa.setAge(19);
        System.out.println(pa.getFirstName());
        System.out.println(pa.getLastName());
        System.out.println(pa.getfullName());
        System.out.println(pa.isTeen());
    }
}
