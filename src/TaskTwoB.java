import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TaskTwoB {

    public static void main(String[] args) {
        try {
            File file = new File("src/02-rainfall.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            StringBuffer stringBuffer = new StringBuffer();
            String line;
            double records = 0;
            double total = 0;
            double mean = 0;

            while ((line = bufferedReader.readLine()) != null) {
                double i = Double.parseDouble(line);
                if(i < 9999) {
                    records++;
                    total = total + i;
                }
                else if(i == 9999) {
                    break;
                }

            }
            mean = total/records;
            System.out.print(mean);
            fileReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}