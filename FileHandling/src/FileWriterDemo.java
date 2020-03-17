import java.io.FileWriter;

public class FileWriterDemo {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("E:\\abc.txt");
            fw.write("File Writer Example");
            fw.close();

        } catch (Exception e) {
        }
    }
}
