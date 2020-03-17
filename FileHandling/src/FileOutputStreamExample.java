import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {
    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("E:\\abc.txt");
            String str = "Java Developers in Nepal sdfsdf   .";
            byte[] b = str.getBytes();
            fout.write(b);
            fout.close();
            System.out.println("Info added to file");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
