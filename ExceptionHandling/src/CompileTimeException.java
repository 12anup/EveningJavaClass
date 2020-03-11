import java.io.*;

public class CompileTimeException {
    public static void main(String[] args) {
//        try {
        File file = new File("D:\\student.txt");
        try {
            FileReader fileReader = new FileReader(file);
            try {
                System.out.println(fileReader.read());
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
//            FileInputStream f = new FileInputStream("D:\\student.txt");

//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        System.out.println("we are reading about exception handling");
        System.out.println("this is next statement");

    }
}
