//Read me
// this example is for Constructior chaining
package knowledgeBase;

public class Customer
{
    private String name;
    private String email;
    private int creditLimit;

    public Customer(String name, String email, int creditLimit)
    {
        this.name = name;
        this.email=email;
        this.creditLimit=creditLimit;
    }

    public Customer()
    {
        this("Shiv", "test@email.com",767);
        System.out.println("No arguments constructor called");
    }

    public Customer(String name, String email) {
        this(name,email,456);
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getCreditLimit() {
        return creditLimit;
    }


}
