import java.io.FileReader;
import java.io.IOException;
public class FileReaderExample {

    public static void main(String[] args) {
        try(FileReader fr = new FileReader("input.txt")) {
            
            int charData;
            while((charData = fr.read()) != -1){
                System.out.print((char) charData);
            }
            System.out.println();
        } catch (IOException e) {
            System.err.println("An IOException occurred: " + e.getMessage());
        }
    }
}