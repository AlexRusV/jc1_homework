package Strings;

import java.util.Scanner;

public class Task_27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the text: ");
        String str = scanner.nextLine();
        int word = 0;
        if (str.length() != 0) {
            word++;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ' ') {
                    word++;
                }
            }
        }
        else {
            System.out.println("end");
        }
        System.out.println("Amount words: " + word);
    }
}
