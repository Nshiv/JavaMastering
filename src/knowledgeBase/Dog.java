package knowledgeBase;

public class Dog
{
  public static String bread;

  public  Dog(String bread)
  {
      this.bread = bread;
  }

  public  void getDogBread()
  {
      System.out.println("Dog bread is " +bread);
  }
}
//created a class with static member variable