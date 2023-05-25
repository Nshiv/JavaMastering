package inheritance;

public class Fish extends Animal
{
    private int fins;
    private int gills;

    public Fish(String type, double weight, int fins, int gills) {
        super(type, "small", weight);
        this.fins = fins;
        this.gills = gills;
    }

    private void moveMuscle()
    {
        System.out.println("Muscle moving");
    }


    private void movefins()
    {
        System.out.println("fins  moving");
    }

    @Override
    public void move(String speed)
    {
        super.move(speed);
        moveMuscle();
        if(speed=="fast")
        {
            movefins();
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Fish{" +
                "fins=" + fins +
                ", gills=" + gills +
                "} " + super.toString();
    }
}
