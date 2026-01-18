package Generics;

class Box<T> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

public class GenericClass {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();
        intBox.setItem(123);
        System.out.println("Integer Value: " + intBox.getItem());

        Box<String> strBox = new Box<>();
        strBox.setItem("Hello Generics");
        System.out.println("String Value: " + strBox.getItem());
    }
}
