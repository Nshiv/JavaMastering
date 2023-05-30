package polymorphism;
//Run-time polymorphism
//late binding polymorphism
//dynamic polymorphism

public class Animal
{
    public  void makeNoise()
    {
        System.out.println("Animal is making noise");
    }
}

class Dog extends Animal
{
    public void makeNoise()
    {
        super.makeNoise();
        System.out.println("additional code along with the super class method");
    }
}

class Cat extends Animal
{
    public void makeNoise()
    {
        super.makeNoise();
        System.out.println("Cat's additional code");
    }
}
