import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Tools {
    public static void writeToFile(String task){
        String record = LocalDate.now() + " " + task;
        try (FileWriter writer = new FileWriter("book.txt", true)) {
            writer.write(record + "\n");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void readFromFile(){
        try(BufferedReader reader = new BufferedReader (new FileReader("book.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }




}