package inheritance;

public class MainClassforAnimal
{
    public static void main(String [] args)
    {
       // Animal animal = new Animal("Generic Animal", "Big",500);
        //doAnimalStuff(animal,"slow");
        //Dog dog = new Dog("JImmy",  15);
        //doAnimalStuff(dog,"slow");

        Dog golden_r = new Dog("bull dog", 45);
        doAnimalStuff(golden_r,"slow");

        Dog retriever = new Dog("golder retriver", 36,"normal","round");
        doAnimalStuff(retriever,"fast");

        Fish fs = new Fish("goldfish",10,4,8);
        doAnimalStuff(fs,"fast");
    }

    public static void doAnimalStuff(Animal animal, String speed)
    {
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("--------------");

    }

}
