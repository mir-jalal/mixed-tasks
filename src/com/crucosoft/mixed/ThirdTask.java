package com.crucosoft.mixed;

import java.util.ArrayList;
import java.util.Scanner;

public class ThirdTask {
    /*
    3. Siralanmis integer listi icerisinde verilen elementi tapan method yazmaq. Method eger hemin elementi taparsa indexini geri qaytarmalidir
    tapmadiqda ise eger hemin element olsaydi siraya gore hansi indexde olmali idise onu.
    Meselen: [1,3,4,5] 5 verdikde 3 geri donmeli , 2 verdikde ise 1 geri qaytarmalidir.
     */

    public static void main(String[] args) {
        //Enter a few numbers separated by spaces. Enter the number you are looking for in the second line
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> arrayList = new ArrayList<>();

        for(String str : scanner.nextLine().split("\\s+")){
            arrayList.add(Integer.parseInt(str));
        }

        System.out.println(arrayList.indexOf(scanner.nextInt()));
    }
}
