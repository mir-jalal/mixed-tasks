package com.crucosoft.mixed;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ForthTask {
    /*
    4. Iki verilmish array siralamaq. Ve sonra siralanmish iki array 1 arrayda yene sirali bir shekilde birleshdirmek.
    meselen. 1) [1,6,2,9] -> [1,2,6,9]
             2) [2,8,7,4] -> [2,4,7,8]
             3) [1,2,2,4,6,7,8,9]
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> firstArrayList = new ArrayList<>();
        ArrayList<Integer> secondArrayList = new ArrayList<>();

        for(String str : scanner.nextLine().split("\\s+")){
            firstArrayList.add(Integer.parseInt(str));
        }

        for(String str : scanner.nextLine().split("\\s+")){
            secondArrayList.add(Integer.parseInt(str));
        }

        Collections.sort(firstArrayList);
        Collections.sort(secondArrayList);

        System.out.println(firstArrayList);
        System.out.println(secondArrayList);

        firstArrayList.addAll(secondArrayList);
        Collections.sort(firstArrayList);

        System.out.println(firstArrayList);
    }
}
