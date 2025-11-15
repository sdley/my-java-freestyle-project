package basics.audio;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AudioPlaying {

    // How to play audio in Java (WAV format)
    // 1. Using Clip from javax.sound.sampled package
    // 2. Using AudioInputStream to read audio data
    // 3. Using SourceDataLine for more control over audio playback

    // Note: Java Sound API supports WAV, AIFF, AU formats natively.
    // For MP3 or other formats, external libraries like JLayer or JavaFX are needed.

    void main() {

        String filePath = "src/basics/audio/sample.wav";
        File audioFile = new File(filePath);

        try (Scanner scanner = new Scanner(System.in);
                AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(audioFile)) {
            var clip = AudioSystem.getClip();
            clip.open(audioInputStream);

            String response = "";

            while (!response.startsWith("Q")) {
                System.out.println("P: Play, S: Stop, R: Reset, Q: Quit");
                System.out.print("Enter your choice: ");
                response = scanner.nextLine().toUpperCase();

                switch (response.toUpperCase()) {
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setFramePosition(0);
                    case "Q" -> clip.close();
                    default -> System.out.println("Invalid choice. Please try again.");
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("Audio file not found.");
        } catch (UnsupportedAudioFileException e) {
            System.out.println("The specified audio file is not supported.");
        } catch (Exception e) {
            System.out.println("An error occurred while playing the audio.");
        }
        finally {
            System.out.println("Exited audio player.");
            System.out.println("Bye!");
        }

    }
}
