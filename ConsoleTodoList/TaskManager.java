package ConsoleTodoList;
import java.util.*;

public class TaskManager {
    private Set<Task> tasks;
    private Map<Long, Task> taskById;
    private Map<String, List<Task>> tasksByDate;

    public TaskManager() {
        this.tasks = new HashSet<>();
        this.taskById = new HashMap<>();
        this.tasksByDate = new HashMap<>();
    }

    public void addTask(String messagem, String date) {
        Task newTask = new Task(messagem, date);
        tasks.add(newTask);
        taskById.put(newTask.getId(), newTask);
        tasksByDate.computeIfAbsent(date, k -> new ArrayList<>()).add(newTask);
        
        System.out.println("\nTask added successfully...!");
        showAllTasks();
    }

    public void viewTaskById(long id) {
        Task task = taskById.get(id);
        if(task != null) {
            System.out.println(task);
            System.out.println();
        }else {
            System.out.println("\nTask with ID " + id + " not found.");
        }
    }

    public void viewTasksByDate(String date) {
        List<Task> tasksOnDate = tasksByDate.get(date);
        if(tasksOnDate != null && !tasksOnDate.isEmpty()) {
            System.out.println("\nTasks on date: " + date);
            tasksOnDate.forEach(System.out::println);
            System.err.println();
        }else {
            System.out.println("\nNo tasks found on date: " + date);
        }
    }

    public void deleteTaskById(long id) {
        Task task = taskById.get(id);
        if(task != null) {
            tasks.remove(task);
            taskById.remove(id);
            tasksByDate.get(task.getDate()).remove(task);
            System.out.println("\nTask with ID " + id + " deleted successfully.");
        }else {
            System.out.println("\nTask with ID " + id + " not found.");
        }

        showAllTasks();
    }

    public void showAllTasks() {
        if(tasks.isEmpty()) {
            System.out.println("\nNo tasks available.");
        }else {
            tasks.forEach(System.out::println);
            System.err.println();
        }
    }
}
