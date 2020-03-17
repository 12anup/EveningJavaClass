import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderExample {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter your message");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String readValue = bufferedReader.readLine();
        System.out.println("you wrote :" + readValue);
    }
}
