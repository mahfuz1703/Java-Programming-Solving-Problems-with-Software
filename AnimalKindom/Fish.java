package AnimalKindom;

public class Fish extends Animal implements Swimmable {
    public Fish(int weight){
        super(weight);
    }

    @Override
    public void breathe() {
        System.out.println("Fish is breathing");
    }

    @Override
    public void swim() {
        System.out.println("Fish is swimming");
    }

    public void layEggs(){
        System.out.println(getClass().getSimpleName() + " is laying eggs");
    }
}