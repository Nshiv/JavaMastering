package knowledgeBase;

public class Floor
{
    private double width;
    private double height;

    public  Floor(double width, double height)
    {
        if(height<0 || width<0)
        {
            this.height=0;
            this.width=0;
        }
        else {
            this.height = height;
            this.width = width;
        }
    }

    public double getArea()
    {
        double area = height*width;
        return area;
    }




}
