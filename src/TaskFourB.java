import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class TaskFourB {

    // The first word is the name of a task, the second is the length of time is takes to complete, the third/thereafter are dependencies

    // run through the entire file and for the first and second item on each line, store it in a map of items mapping name to cooking time
    //HashMap<String, int> cookingTimes = new HashMap<>();
    // for each line, break the string into an array at " ". If item is not already contained in map, add it

    //

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
