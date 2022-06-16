import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Calculator {
    FileWriter writer = new FileWriter("broOutput.txt", false);
    private String temp = "";

    public Calculator() throws IOException {
    }

    String read(File file) throws FileNotFoundException{     // Метод считывает текст из файла в переменную temp и
                                                            // и возращает стсроковое значение
        Scanner sc = new Scanner(file);
        temp = sc.nextLine();
        return temp;
    }

    void writer(String str) throws IOException {         // метод записывает в файл ответ

            writer.write(str);
            writer.flush();
        }



    String calculate(String str){
        String[] s = str.split("\\s+");
        try{
            try {
                double a = Double.parseDouble(s[0]);
            }catch (Exception ex) {
                return "Error! Not number";
            }
            try {
                double b = Double.parseDouble(s[2]);
            }catch (Exception ex) {
                return "Error! Not number";
            }
            double a = Double.parseDouble(s[0]);
            String st = s[1];
            double b = Double.parseDouble(s[2]);
            switch (st) {
                case "+":
                    return String.valueOf(a + b);
                case "-":
                    return String.valueOf(a - b);
                case "*":
                    return String.valueOf(a * b);
                case "/":
                    if (b == 0) {
                        throw new Exception("Error! Division by zero");
                    }
                    return String.valueOf(a / b);

                default:
                    throw new Exception("Operation Error!");

            }
        }catch( NumberFormatException nfe){
            return String.valueOf(nfe.getMessage());

        } catch (Exception ex) {
            return String.valueOf(ex.getMessage());
        }


    }
}
