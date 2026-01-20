import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + "}";
    }
}

public class SerializationDeserializationExample {
    public static void main(String[] args) {
        Student student = new Student("Alice", 20);
        System.out.println("Student Object: " + student);

        // Serialization and Deserialization logic would go here
        String fileName = "student.ser";

        // Serialization
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))){
            oos.writeObject(student);
            System.out.println("Student object serialized to " + fileName);
        } catch (Exception e) {
            System.err.println("An error occurred during serialization: " + e.getMessage());
        }

        // Deserialization
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))){
            Student deserializedStudent = (Student) ois.readObject();
            System.out.println("Deserialized Student Object: " + deserializedStudent);
        } catch (Exception e) {
            System.err.println("An error occurred during deserialization: " + e.getMessage());
        }
    }
}
