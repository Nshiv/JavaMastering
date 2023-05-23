package inheritance;

public class Car
{
    private String maker;
    private String model ="Harrier";
    private String color="Black";
    private int doors =4;
    private boolean convertible=true;

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void describecar()
    {
        System.out.println("maker " +getMaker()+ maker);
        System.out.println("Model "+ getModel() + model);
        System.out.println("color "+getColor() + color);
        System.out.println("doors "+getDoors()+ doors);
        System.out.println(isConvertible());
    }
}
