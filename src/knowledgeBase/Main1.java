package knowledgeBase;

public class Main1
{
    public static void main(String[] args)
    {
      Dog dg = new Dog("german shephered");
      Dog dp = new Dog("bull dog");
      // changes in static variable affets for all shared resources

      dg.getDogBread();
      dp.getDogBread();
    }
}
