import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TaskOne {

    public static void main(String[] args) {
        try {
            File file = new File("src/01-mowmaster.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            StringBuffer stringBuffer = new StringBuffer();
            String line;
            int comments = 0;
            int instructions = 0;

            while ((line = bufferedReader.readLine()) != null) {
                if(line.startsWith("#")) {
                    comments++;
                }
                else{
                    instructions++;
                }
            }

            System.out.print(instructions);
            fileReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
