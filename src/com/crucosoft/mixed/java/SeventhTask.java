package com.crucosoft.mixed.java;

import java.util.Scanner;

public class SeventhTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        String upper = toUpper(text);
        String lower = toLower(text);

        System.out.println(upper);
        System.out.println(lower);
    }

    public static String toUpper(String text){
        StringBuilder newText = new StringBuilder();
        for(int i = 0; i<text.length(); i++)
        {
            if((text.charAt(i))>96 && text.charAt(i)<123){
                newText.append((char) (text.charAt(i) - 32));
            }
            else
                newText.append(text.charAt(i));
        }
        return newText.toString();
    }

    public static String toLower(String text){
        StringBuilder newText = new StringBuilder();
        for(int i = 0; i<text.length(); i++)
        {
            if((text.charAt(i))>64 && text.charAt(i)<91){
                newText.append((char) (text.charAt(i) + 32));
            }
            else
                newText.append(text.charAt(i));
        }
        return newText.toString();
    }
}
