import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "bro.txt";
        File file = new File(path);
        Calculator c = new Calculator();
        c.read(file);


    }
}
