import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class TaskFour {

    public static void main (String[] args) {

        try {
            File file = new File("src/04-preparation.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            StringBuffer stringBuffer = new StringBuffer();
            String line;
            String[] words;
            int total = 0;

            while ((line = bufferedReader.readLine()) != null) {
                words = line.split(" ");
                int i = Integer.parseInt(words[1]);
                total += i;
            }

            System.out.println(total);


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
