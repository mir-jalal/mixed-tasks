package com.crucosoft.mixed.java;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> queries = new ArrayList<>();
        Random random = new Random();

        int[] course = {1,6,2,1,4,5,3,2,1,4,6,5,3,2,4,5,1,6,3,5};

        while(scanner.hasNext()){
            int courseId = random.nextInt(20);
            queries.add(scanner.nextLine().replaceAll("([0-9], [0-9], \\d{1,2})", (course[courseId]) + ", " + course[courseId] + ", " + (courseId+1) ));
        }

        for(String str: queries) System.out.println(str);
    }
}
