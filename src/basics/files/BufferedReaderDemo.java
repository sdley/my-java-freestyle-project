package basics.files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {

    // How to read a file using java (3 polular ways)

    // 1. Using BufferedReader + FileReader: best for reading large files line by line
    // 2. Using Files.readAllLines(): best for small files, reads all lines at once
    // 3. Using Files.lines(): best for large files, returns a Stream of lines
    // Bonus:
    //          - FileInputStream: best for reading binary files like images, audio or videos
    //          - RandomAccessFile: best for reading and writing at specific positions in a file
    //         - Scanner: best for parsing primitive types and strings using regular expressions

    String filePath = "src/basics/files/sample.txt";

    void main() {

        try (
                BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Something went wrong");
            }
    }
}
