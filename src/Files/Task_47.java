package Files;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Task_47 {
    public static void main(String[] args) {
        Path path = Paths.get("D:/NEW/text.txt");
        try {
            char[] c = {'.', ',', '-', ':', ';', '?', '!'};
            int count = 0;
            int words = 0;

            Scanner scanner = new Scanner(System.in);
            System.out.println("Ввести текст: ");
            String s = scanner.nextLine();

            if (s.length() != 0) {
                words++;
                for (int j = 0; j < s.length(); j++) {
                    if (s.charAt(j) == ' ') {
                        words++;
                    }
                }
            }

            for (int i = 0; i < s.length(); i++) {
                for (char value : c) {
                    if (s.charAt(i) == value) {
                        count++;
                        break;
                    }
                }
            }
            byte[] b = s.getBytes();
            Path writtenFilePath = Files.write(path, b);
            System.out.println(new String(Files.readAllBytes(writtenFilePath)));
            System.out.println("\n");
            System.out.println("Количество слов: " + words);
            System.out.println("Количество знаков препинания: " + count);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}