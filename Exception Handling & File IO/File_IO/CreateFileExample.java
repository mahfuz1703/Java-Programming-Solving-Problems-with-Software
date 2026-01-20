import java.io.File;
import java.io.IOException;
public class CreateFileExample {
    public static void main(String[] args) {
        // Path newFilePath = Paths.get("newfile.txt");

        // try{
        //     Path createdFilePath = Files.createFile(newFilePath);
        //     System.out.println("File created at: " + createdFilePath.toAbsolutePath());
        // } catch(FileAlreadyExistsException e){
        //     System.err.println("File already exists: " + e.getMessage());
        // } 
        // catch (IOException e) {
        //     System.err.println("An IOException occurred: " + e.getMessage());
        // }

        String pathString = "newfile.txt";
        File file = new File(pathString);

        try{
            boolean isFileCreated = file.createNewFile();

            if(isFileCreated){
                System.out.println("File created at: " + file.getAbsolutePath());
            } else {
                System.err.println("File already exists at: " + file.getAbsolutePath());
            }
        } catch (IOException e) {
            System.err.println("An IOException occurred: " + e.getMessage());
        }
    }
}
