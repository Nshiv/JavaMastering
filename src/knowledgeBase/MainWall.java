package knowledgeBase;

public class MainWall
{
    public static void main(String [] args) {
        Wall wall = new Wall(5, 4);
        System.out.println(wall.getArea());
        //wall.setHeight(-1.5);
        wall.setWidth(-1);
        System.out.println(wall.getHeight());
        System.out.println(wall.getWidth());
        System.out.println(wall.getArea());


    }
}
