import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TRY {

    public static void main(String[] args) throws IOException {

        BufferedReader reader1 = new BufferedReader(new FileReader("Ahea.txt"));
        BufferedReader reader2 = new BufferedReader(new FileReader("Ahea.txt"));
        try (BufferedReader reader11 = reader1; BufferedReader reader22 = reader2;) {
            // do something
        }

        BufferedReader reader11 = new BufferedReader(new FileReader("Ahea.txt"));
        BufferedReader reader22 = new BufferedReader(new FileReader("Ahea.txt"));
        try (reader11; reader22) {
            // do something
        }

    }
}
