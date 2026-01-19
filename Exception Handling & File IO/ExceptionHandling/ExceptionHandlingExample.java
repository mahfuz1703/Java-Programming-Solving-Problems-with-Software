public class ExceptionHandlingExample {
    public static void main(String[] args) {
        // Exception ?
        // An event that occurs during the execution of a program that disrupts the normal flow of the program instruction.
        // Problem occurs -> Create Exception -> Throw Exception -> Catch Exception -> Handle Exception
        int[] numbers = {1, 2, 3};
        try {
            System.out.println(numbers[5]); // This will throw ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds: " + e.getMessage());
        }

        // Error ?
        // A serious issue that a reasonable application should not try to catch.


        // checked Exception vs Unchecked Exception ?
        // Checked Exception: Exceptions that are checked at compile-time (e.g., IOException, SQLException) by the compiler.
        // Unchecked Exception: Exceptions that are not checked at compile-time. (e.g., NullPointerException, ArithmeticException). Checked at runtime.

        // Why handle the exceptions ?
        // To maintain normal application flow, provide meaningful error messages, and ensure resource cleanup.
        // It helps in debugging and improves user experience.
        // Keep the application running smoothly even when unexpected situations occur.
        // Notify the user about the error in a user-friendly manner.

        // Finally block ?
        // A block that is always executed after the try and catch blocks, regardless of whether an exception was thrown or caught.

    }
}
