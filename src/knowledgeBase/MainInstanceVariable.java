package knowledgeBase;

public class MainInstanceVariable
{
    public static void main(String[] args)
    {
        InstanceVarible iv = new InstanceVarible("german shephered");
        InstanceVarible dp = new InstanceVarible("bull dog");
        // changes in instance variable are associated with correcposing class objects

        iv.getDogBread();
        dp.getDogBread();
    }
}
