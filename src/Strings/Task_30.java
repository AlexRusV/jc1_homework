package Strings;

import java.util.Scanner;

public class Task_30 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the text: ");
        String text = scanner.nextLine();
        System.out.println(text.replaceAll("<p id=p1>", "<p>"));
        }
}