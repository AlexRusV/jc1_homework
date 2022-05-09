package Strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the text: ");
        String text = scanner.nextLine();

        StringBuilder result = new StringBuilder();

        Pattern pattern = Pattern.compile("([а-яА-Я]+)|([a-zA-Z]+)");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            result.append(text.charAt(matcher.end() - 1));
        }
        System.out.println(result);
    }
}
