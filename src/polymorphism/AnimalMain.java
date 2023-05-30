package polymorphism;

public class AnimalMain
{
    public static void main(String[] args) {
        //when super keyword is not used and polymormic references used to implement polymorphism

    /*   Animal animal = new Dog();
       Animal animal1 = new Cat();
       animal.makeNoise();
       animal1.makeNoise();*/

        // super keyword used in class to achive polymorphism
        Dog dog = new Dog();
        dog.makeNoise();
        Cat cat = new Cat();
        cat.makeNoise();

    }
}
