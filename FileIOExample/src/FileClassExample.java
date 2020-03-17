import java.io.File;
import java.io.IOException;

public class FileClassExample {
    public static void main(String[] args) throws IOException {
       /* File file = new File("F:\\student");
        boolean isDirectoryExist = file.isDirectory();*/
      /*  File newFile=new File("F:\\student\\safa\\asfdsdf\\asefsf\\ram\\sdaf\\asdf\\asdfbfdgd");
//        System.out.println(isDirectoryExist);
        boolean isFileExists=newFile.exists();
        if (!newFile.isDirectory()){
            newFile.mkdirs();
        }*/
        File newFile1=new File("F:\\student\\safa\\asfdsdf\\asefsf\\ram\\sdaf\\asdf\\asdfbfdgd\\ram.txt");
        if (!newFile1.exists()){
            System.out.println("file created");
            newFile1.createNewFile();
        }
    }
}
