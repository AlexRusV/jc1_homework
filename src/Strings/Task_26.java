package Strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        Pattern pattern = Pattern.compile("[.,!:;@#$%^&*()?-]");
        Matcher matcher = pattern.matcher(scanner.nextLine());
        int n = 0;
        while (matcher.find()) {
            n++;
        }
        System.out.println("Amount symbol: " + n);
    }
}
