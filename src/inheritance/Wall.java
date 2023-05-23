package inheritance;

public class Wall
{

    double height;
    double width;
    //no arg constructor
    public Wall()
    {

    }
    // arg constructor
    public Wall(double width, double height)
    {
        this.width = width;
        this.height=height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {

        if(height<0)
        {
            height=0;
        }
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {

        if(width<0)
        {
            width=0;
        }
        this.width = width;
    }

    public double getArea()
    {
        double area = width*height;
        return area;
    }




}
