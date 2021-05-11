package com.crucosoft.mixed;

import java.util.Arrays;
import java.util.Scanner;

public class FirstTask {
    /*
    1. Verilmis iki sozun anagram olub olmadigini tapmaq.
    Method eger verilmis sozler anagram olarsa true eks halda false qaytarmalidir.
    Case sensitive olmali deyil. Terkibinde eyni herfler eyni sayda olmalidir.
    Meselen: Samir , rsmAi -> true.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] firstArray = scanner.next().toLowerCase().toCharArray();
        char[] secondArray = scanner.next().toLowerCase().toCharArray();

        Arrays.sort(firstArray);
        Arrays.sort(secondArray);

        System.out.println(new String(firstArray).equals(new String(secondArray)));
    }
}
