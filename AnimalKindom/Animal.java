package AnimalKindom;

abstract class Animal {
    private final int weight;

    public Animal(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public abstract void breathe();
}