import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileInputStreamExample {
    public static void main(String[] args) {
        try {
            FileInputStream f=new FileInputStream("F:\\java.txt.txt");
            int i=0;
            StringBuilder str=new StringBuilder();
            while((i=f.read())!=-1){
//                str.append(i);
                System.out.print((char)i);  //ASCII
            }
//            System.out.println(str.replace(0,4,"python"));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
