package AnimalKindom;

public class Mammal extends Animal implements Walkable{
    public Mammal(int weight){
        super(weight);
    }

    @Override
    public void breathe() {
        System.out.println("Mammal is breathing");
    }

    @Override
    public void walk() {
        System.out.println("Mammal is walking");     
    }

    public void growHair(){
        System.out.println(getClass().getSimpleName() + " is growing hair");
    }
}
