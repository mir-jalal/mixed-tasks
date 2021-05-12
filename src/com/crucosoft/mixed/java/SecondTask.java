package com.crucosoft.mixed.java;

import java.util.Scanner;

public class SecondTask {
    /*
    2. Verilmish string boshluqlara gore parcalamali.
    Eger sual ve s bashqa characterler olarsa onlarida nezere almamalidir.
    Meselen: He isn't a student, is he?
    He
    isn
    t
    a
    student
    is
    he
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // I know it is not good but I like it :)
        for(String str : scanner.nextLine().split("([.,?!@#$%^&*()';: \"])")) if(!str.equals("")) System.out.println(str);
    }
}
