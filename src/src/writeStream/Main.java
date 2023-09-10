package writeStream;

import java.io.*;

public class Main {

    static String a = "The Rostovs knew everybody in Moscow. The old count had money enought that year, " +
            "as all his estates had been remortgaged, and so Nicholas, acquiring a troller of his own, " +
            "very stylish riding breeches of the latest cut, such as no one else yet had in Moscow, and boots " +
            "of the latest fashion, with extremely pointed toes and small silver spues, passed his very gaily.";

    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();

    }

    static void task1() {
        File file = new File("textFolder/newFile.txt");
        try (FileOutputStream fileOutputStream = new FileOutputStream(file)) {
            String text = a;
            fileOutputStream.write(text.getBytes());
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }

    static void task2() {
        File file2 = new File("/Users/denislameko/Desktop/Test", "text.txt");
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file2);
            fileWriter.write(a);
        } catch (IOException e) {
            throw new RuntimeException();
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException();
            }
        }
    }

    static void task3() {
        File file3 = new File("/Users/denislameko/Desktop/Test/text.txt");  //можно записать в одну строку try(BufferedReader bufferReadered = new BufferedReader(new FileReader(new File("путь"))))
        try (FileReader fileReader = new FileReader(file3)) {
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String text = bufferedReader.readLine();
            System.out.println(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void task4() {
        File file4 = new File("textFolder/newFile.txt");
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("textFolder/newFile.txt")))) {
            String text = bufferedReader.readLine();
            System.out.println(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}