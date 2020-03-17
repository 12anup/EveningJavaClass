import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {
    public static void main(String[] args) {
        try {
            FileOutputStream f = new FileOutputStream("F:\\xyz.txt");
            BufferedOutputStream bout=new BufferedOutputStream(f);
            String s="this is java class of file io buffered stream";
            byte[] b=s.getBytes();
//            f.write(b);
            bout.write(b);
            bout.flush();
            f.close();
            bout.close();
            System.out.println("task completed");
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e1){
            e1.printStackTrace();
        }
    }
}
