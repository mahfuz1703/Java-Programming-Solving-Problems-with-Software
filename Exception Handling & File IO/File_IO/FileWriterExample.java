import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    
    public static void main(String[] args) {
        String filePath = "output.txt";
        // String content = "Hello, World!\nWelcome to File I/O in Java.";
        
        
        // Read from a file (input.txt) and write to output.txt
        String content = "";
        try(FileReader fr = new FileReader("input.txt")) {
            StringBuilder sb = new StringBuilder();
            int charData;
            while((charData = fr.read()) != -1){
                sb.append((char) charData);
            }
            content = sb.toString();
        } catch (IOException e) {
            System.err.println("An IOException occurred while reading: " + e.getMessage());
        }

        try(FileWriter writer = new FileWriter(filePath)){
            writer.write(content);
            System.out.println("Content written to " + filePath);
        } catch (IOException e) {
            System.err.println("An IOException occurred: " + e.getMessage());
        }
    }
}
