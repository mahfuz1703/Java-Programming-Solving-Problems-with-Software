package AnimalKindom;

public class Reptile extends Animal implements Walkable, Swimmable {
    public Reptile(int weight){
        super(weight);
    }

    @Override
    public void breathe() {
        System.out.println("Reptile is breathing");
    }

    @Override
    public void walk() {
        System.out.println("Reptile is walking");     
    }

    @Override
    public void swim() {
        System.out.println("Reptile is swimming");
    }

    public void baskInSun(){
        System.out.println(getClass().getSimpleName() + " is basking in the sun");
    }
}
