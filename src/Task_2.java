import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Task_2 {
    public static void main(String[] args) throws IOException {
        File file = new File("TEST.txt");
        if (file.createNewFile()){
            System.out.println("File is created!");
        }
        else{
            System.out.println("File is overwritten");
        }
        FileWriter writer = new FileWriter (file);
        for (int i = 0; i < 100; i++) {
            writer.write("TEST\n");
        }
        writer.close();
    }
}
