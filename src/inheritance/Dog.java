package inheritance;

public class Dog extends Animal
{
    private  String earShape;
    private String tailShape;

   /* public Dog()
    {
     super("Jimmy","Fast",300);
    }*/

    public  Dog(String type, double weight)
    {
        this(type,weight, "perrky","curly");
    }

    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type,weight<15?"small":(weight<35?"medioum":"large"), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

   @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    public void makeNoise() {
        //System.out.println("Dog Class");
        super.makeNoise();
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        System.out.println("Dogs walk and run in styles");
    }
}
