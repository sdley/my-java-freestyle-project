package basics.files;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FileWritingDemo {

    // How to write to a file in Java (4 popular options):
    // 1. Using FileWriter class: good for small or medium-sized text files
    // 2. Using BufferedWriter class: better performance for larger files
    // 3. Using Files class (Java NIO): simplest way with modern Java
    // 4. Using PrintWriter class: best for structured data or formatted output
    // Bonus: Using FileOutputStream for binary files

    void main() {

        String filePath = "src/basics/files/mySecondFile.txt";
        String fileContent = """
                This is an example of writing to a file using Java.
                You can use different classes and methods to achieve this.
                Make sure to handle exceptions properly to avoid runtime errors.
                Happy coding!
                """;

        try (FileWriter writer = new FileWriter("src/basics/files/myFirstFile.txt")){
            writer.write("Hello, World!\n");
            writer.write("This is a sample file writing in Java.\n");
            writer.write("File writing completed successfully.");
            System.out.println("myFirstFile has been successfully written.");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
        catch (IOException e) {
            System.out.println("IO Error occurred: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }

        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(fileContent);
            System.out.println("mySecondFile has been successfully written to " + filePath);
        } catch (IOException e) {
            System.out.println("IO Error occurred: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
