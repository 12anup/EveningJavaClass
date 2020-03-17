import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("F:\\pbc.txt");
            int i=0;
            while((i=fileReader.read())!=-1){
                System.out.print((char)i);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
//        catch (IOException e){
//            e.printStackTrace();
//        }
    }
}
