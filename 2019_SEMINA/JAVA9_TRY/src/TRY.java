import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TRY {

    public static void main(String[] args) throws IOException {

        BufferedReader reader1 = new BufferedReader(new FileReader("Ahea.txt"));
        try (BufferedReader reader2 = reader1) {
            // do something
        }

        BufferedReader reader = new BufferedReader(new FileReader("Ahea.txt"));
        try (reader) {
            // do something
        }

    }
}
