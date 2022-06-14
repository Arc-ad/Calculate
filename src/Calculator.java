import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Calculator {
    private String temp = "";
    String read(File file) throws FileNotFoundException{     // Метод считывает текст из файла в переменную temp и
                                                            // и возращает стсроковое значение
        Scanner sc = new Scanner(file);
        temp = sc.nextLine();
        return temp;
    }

    void writer(File file, String str) throws IOException {         // метод записывает в файл ответ
        try (FileWriter writer = new FileWriter(file, false)) {
            writer.write(str);
            writer.flush();
        }

    }

    double calculate(String str){
        String[] s = str.split("\\s+");
        try{
            double a = Double.parseDouble(s[0]);
            String st = s[1];
            double b = Double.parseDouble(s[2]);
            switch (st) {
                case "+":
                    return a + b;
                case "-":
                    return a - b;
                case "*":
                    return a * b;
                case "/":
                    if (b == 0) {
                        throw new Exception("Error! Division by zero");
                    }
                    return a / b;

                default:
                    throw new Exception("Operation Error!");
            }
        }catch( NumberFormatException nfe){
            System.out.println("Error! Not number");

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return 0;
    }
}
