
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        String path = "bro.txt";
        File file = new File(path);
        Calculator c = new Calculator();

        File file1 = new File("broOutput.txt");
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()){
            String temp = sc.nextLine();
            String result= c.calculate(temp);
            c.writer(temp + " = " + result + "\n");
        }

    }
}
