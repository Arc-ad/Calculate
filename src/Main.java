
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        String path = "bro.txt";
        File file = new File(path);
        Calculator c = new Calculator();
       String result = String.valueOf(c.calculate(c.read(file)));
        File file1 = new File("broOutput.txt");
        c.writer(file1, result);
    }
}
