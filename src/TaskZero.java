import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TaskZero {

    public static void main(String[] args) {
        try {
            File file = new File("src/00-invites.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            StringBuffer stringBuffer = new StringBuffer();
            String line;
            String[] longest = new String[1];

            while ((line = bufferedReader.readLine()) != null) {
                String[] temp = line.split(", ");
                if(temp.length > longest.length) {
                    longest = line.split(", ");
                }
            }

            System.out.print(longest.length);
            fileReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}