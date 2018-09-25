import java.io.*;
import java.util.*;

public class TaskZeroB {

    public static void main(String[] args) throws IOException {
            File file = new File("src/00-invites.txt");
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader bufferedReader = new BufferedReader(fileReader);
            StringBuffer stringBuffer = new StringBuffer();
            String line;
            Set<String> names = new HashSet<String>();
            Set<String> duplicates = new HashSet<String>();

            while ((line = bufferedReader.readLine()) != null) {
                String[] temp = line.split(", ");
                for (String s : temp) {
                    if (names.contains(s)) {
                        duplicates.add(s);
                    } else {
                        names.add(s);
                    }

                }
            }
            System.out.print(duplicates.size());
            fileReader.close();

    }
}