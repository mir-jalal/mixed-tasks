package com.crucosoft.mixed.java;

import java.util.ArrayList;
import java.util.Scanner;

public class SixthTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> stringArrayList = new ArrayList<>();

        while(scanner.hasNext()){
            // You can stop application by sending EOF
            // Generally Ctrl + D
            stringArrayList.add(scanner.next());
        }

        for (int i=0; i<stringArrayList.size(); i++) {
            while(true){
                int index = find(stringArrayList, stringArrayList.get(i), i);
                if(index == -1)
                    break;
                stringArrayList.remove(index);
            }
        }

        System.out.println(stringArrayList);
    }

    public static int find(ArrayList<String> list, String target, int startIndex){
        for(int i = startIndex+1; i<list.size(); i++)
            if(list.get(i).equals(target))
                return i;
        return -1;
    }
}
