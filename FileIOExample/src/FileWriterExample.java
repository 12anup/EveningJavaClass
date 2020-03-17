import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter=new FileWriter("F:\\pbc.txt");
            fileWriter.write("this is class of file writer");
            fileWriter.write('a');
            fileWriter.close();
            System.out.println("completed");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
