import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TaskTwo {

    public static void main(String[] args) {
        try {
            File file = new File("src/02-rainfall.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            StringBuffer stringBuffer = new StringBuffer();
            String line;
            int records = 0;

            while ((line = bufferedReader.readLine()) != null) {
                int i = Integer.parseInt(line);
                if(i < 9999) {
                    records++;
                }
                else if(i == 9999) {
                    break;
                }

            }

            System.out.print(records);
            fileReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}