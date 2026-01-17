import java.util.*;

public class StudentRecordSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();

        System.out.println("Enter number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for(int i = 0; i < n; i++){
            System.out.println("Enter ID: ");
            long id = scanner.nextLong();
            scanner.nextLine(); // Consume newline

            System.out.println("Enter Full Name: ");
            String fullName = scanner.nextLine();
            scanner.nextLine(); // Consume newline

            System.out.println("Enter Blood Group: ");
            String bloodGroup = scanner.nextLine();
            scanner.nextLine(); // Consume newline

            System.out.println("Enter CGPA: ");
            float cgpa = scanner.nextFloat();
            scanner.nextLine(); // Consume newline

            students.add(new Student(id, fullName, bloodGroup, cgpa));
        }
        System.out.println("Enter search query (last name or blood group): ");
        String query = scanner.nextLine();
        boolean found = false;

        for(Student student : students){
            if(student.findByQuery(query)){
                student.displayStudentInfo();
                found = true;
            }
        }

        if(!found){
            System.out.println("No matching student records found.");
        }
        scanner.close();
    }
}
