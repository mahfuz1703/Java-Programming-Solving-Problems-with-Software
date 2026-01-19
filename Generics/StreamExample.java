package Generics;
import java.util.function.Predicate;
import java.util.Comparator;
import java.util.List;
import java.util.stream.*;

public class StreamExample {
    public static void main(String[] args) {
        // What is a Stream?
        // A Stream is a sequence of elements supporting sequential and parallel aggregate operations.
        // It is not a data structure that stores elements, but rather a view of a data source.
        // Streams can be created from Collections, Arrays, or I/O channels.
        // Example: Creating a Stream from a Collection
        List<String> stringList = List.of("A", "B", "C", "D", "e");
        Stream<String> stringStream = stringList.stream();
        stringStream.forEach(System.out::println);

        // Filter Example
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        List<Integer> evenNumbers = numbers.stream()
                                           .filter(n -> n % 2 == 0)
                                           .toList();
        System.out.println("Even Numbers: " + evenNumbers);

        // Map Example
        List<String> upperCaseStrings = stringList.stream()
                                                  .map(String::toUpperCase)
                                                  .toList();
        System.out.println("Uppercase Strings: " + upperCaseStrings);

        // flatMap Example
        List<String> titles = List.of("Java Programming", "Generics in Java");
        List<String> words = titles.stream()
                                   .flatMap(title -> List.of(title.split(" ")).stream())
                                   .toList();
        System.out.println("Words: " + words);

        // anyMatch Example
        boolean hasShortWord = words.stream()
                                    .anyMatch(word -> word.length() < 3);
        System.out.println("Contains short word: " + hasShortWord);

        // allMatch Example
        boolean allLongWords = words.stream()
                                    .allMatch(word -> word.length() >= 2);
        System.out.println("All words are long: " + allLongWords);


        // Predicate?
        // A Predicate is a functional interface that represents a single argument function that returns a boolean value.
        // Predicate to check if a number is even
        Predicate<Integer> isEven = n -> n % 2 == 0;
        System.err.println(isEven.test(4)); // true
        System.err.println(isEven.test(5)); // false


        // Lamda Expression?
        // A lambda expression is a short block of code which takes in parameters and returns a value.
        // Lambda expressions are similar to methods, but they do not need a name and can be implemented right in the body of a method.
        // Example: Comparing two numbers using a lambda expression
        Comparator<Integer> comparator = (a, b) -> {
            if(a < b) return -1;
            else if(a > b) return 1;
            else return 0;
        };
        System.out.println(comparator.compare(10, 20)); // -1
        System.out.println(comparator.compare(20, 10)); // 1
        System.out.println(comparator.compare(10, 10)); // 0
    }
}