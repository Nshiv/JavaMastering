package knowledgeBase;

public class Person
{
    String firstName;
    String lastName;
    int age;

    public boolean isTeen()
    {
      if(age>=13 && age <=19)
      {
          return true;
      }
      else return false;
    }

    public String getfullName()
    {
        String fullname = firstName+" " +lastName;
        return fullname;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
