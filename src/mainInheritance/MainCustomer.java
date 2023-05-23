package mainInheritance;

import inheritance.Customer;

public class MainCustomer
{
    public static void main(String[] args)
    {
        Customer cs = new Customer("name","email",999);
        System.out.println(cs.getName());
        System.out.println(cs.getEmail());
        System.out.println(cs.getCreditLimit());

        Customer cs1 = new Customer("sk","sk@gmail.com");
        System.out.println(cs1.getName());
        System.out.println(cs1.getEmail());
        System.out.println(cs1.getCreditLimit());

        Customer cs2 = new Customer("pk", "name@gmail.com");
        System.out.println(cs2.getName());
        System.out.println(cs2.getEmail());
        System.out.println(cs2.getCreditLimit());

    }
}
