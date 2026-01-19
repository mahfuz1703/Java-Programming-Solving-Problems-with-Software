package ConsoleTodoList;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TodoList {
    public static void main(String[] args) {
        System.out.println("Welcome to the Console Todo List Application!");
        
        Scanner scanner = new Scanner(System.in);
        TaskManager taskManager = new TaskManager();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Task");
            System.out.println("2. View Task by ID");
            System.out.println("3. View Tasks by Date");
            System.out.println("4. Delete Task by ID");
            System.out.println("5. Show All Tasks");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter task message: ");
                    String message = scanner.nextLine();
                    System.out.print("Enter task date (DD/MM/YYYY): ");
                    String date = scanner.nextLine();
                    String normalizedDate = normalizeDate(date);
                    taskManager.addTask(message, normalizedDate);
                    break;
                case 2:
                    System.out.print("Enter task ID: ");
                    long idToView = scanner.nextLong();
                    taskManager.viewTaskById(idToView);
                    break;
                case 3:
                    System.out.print("Enter date (DD/MM/YYYY): ");
                    String dateToView = scanner.nextLine();
                    String normalizedDateToView = normalizeDate(dateToView);
                    taskManager.viewTasksByDate(normalizedDateToView);
                    break;
                case 4:
                    System.out.print("Enter task ID to delete: ");
                    long idToDelete = scanner.nextLong();
                    taskManager.deleteTaskById(idToDelete);
                    break;
                case 5:
                    taskManager.showAllTasks();
                    break;
                case 6:
                    System.out.println("Exiting the application. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static String normalizeDate(String date) {
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("d/M/yyyy");
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate parsedDate = LocalDate.parse(date, inputFormatter);
        return parsedDate.format(outputFormatter);
    }
}
