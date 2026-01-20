import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageCopyExample {
    public static void main(String[] args) {
        String sourcePath = "input.png";
        String destPath = "output.png";

        try(FileInputStream fis = new FileInputStream(sourcePath);
            FileOutputStream fos = new FileOutputStream(destPath)
        ){
            byte[] buffer = new byte[1024];
            int bytesRead;
            while((bytesRead = fis.read(buffer)) != -1){
                fos.write(buffer, 0, bytesRead);
            }
            System.out.println("Image copied successfully from " + sourcePath + " to " + destPath);
        } catch (IOException e) {
            System.err.println("An IOException occurred: " + e.getMessage());
        }
    }
}
