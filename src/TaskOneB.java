import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TaskOneB {

    public static void main(String[] args) {
        try {
            File file = new File("src/01-mowmaster.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            StringBuffer stringBuffer = new StringBuffer();
            String line;
            int distance = 0;

            while ((line = bufferedReader.readLine()) != null) {
                if(!line.startsWith("#")) {
                    String digits = line.replaceAll("\\D+","").trim();
                    if(!digits.equals("")) {
                        int i = Integer.parseInt(digits);
                        distance = distance + i;
                    }
                }
            }

            System.out.print(distance);
            fileReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
