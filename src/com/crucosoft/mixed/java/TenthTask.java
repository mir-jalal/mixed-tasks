package com.crucosoft.mixed.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TenthTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // You should enter the number with underscore
        // Example: 1_000_000_123_101_009_990_001_234
        Number num = new Number(scanner.nextLine());

        System.out.println(num);
    }
}

class Number{

    ArrayList<String> places;

    Number(String number){
        places = new ArrayList<String>(Arrays.asList(number.split("_")));
    }

    @Override
    public String toString() {
        String text = "";

        if(places.size()==1 && places.get(0).equals("0"))
            return "sıfır";

        for(int i = 0; i<places.size(); i++){
            String place = places.get(i);
            if(!place.equals("000")) {
                String hundreds = hundredsToText(place);
                text += (hundreds != "bir" && places.size()-i!=2) ? hundreds + placeToText(places.size() - i - 1) + " " : "min ";
            }
        }
        return text;
    }

    private String hundredsToText(String number){
        String text = "";
        int len = number.length();

        if(len>2){
            char ch = number.charAt(len-3);
            text += (ch != '1') ? numberToText(ch) : "";
            text += (ch != '1' && ch != '0') ? " " : "";
            text += (ch != '0') ? "yüz " : "";
        }
        if(len>1){
            char ch = number.charAt(len-2);
            text += (ch != '0') ? decimalToText(ch) + " " : "";
        }
        if(len>0){
            char ch = number.charAt(len-1);
            text += (ch != '0') ? numberToText(ch) + " " : "";
        }

        return text;
    }

    private String decimalToText(char n){
        switch (n){
            case '1':
                return "on";
            case '2':
                return "iyirmi";
            case '3':
                return "otuz";
            case '4':
                return "qırx";
            case '5':
                return "əlli";
            case '6':
                return "altmış";
            case '7':
                return "yetmiş";
            case '8':
                return "səksən";
            case '9':
                return "doxsan";
            default:
                return "";
        }
    }

    private String placeToText(int n){
        switch (n){
            case 0:
                return "";
            case 1:
                return "min";
            case 2:
                return "milyon";
            case 3:
                return "milyard";
            case 4:
                return "trilyon";
            case 5:
                return "kvadrilyon";
            case 6:
                return "quintilyon";
            case 7:
                return "sekstilyon";
            case 8:
                return "septilyon";
            case 9:
                return "oktilyon";
            case 10:
                return "nonalon";
            case 11:
                return "dekalon";
            case 12:
                return "endekalon";
            case 13:
                return "dodekalon";
            case 14:
                return "tridekalon";
            default:
                return "error";
        }
    }

    private String numberToText(char n){
        switch (n){
            case '0':
                return "";
            case '1':
                return "bir";
            case '2':
                return "iki";
            case '3':
                return "üç";
            case '4':
                return "dörd";
            case '5':
                return "beş";
            case '6':
                return "altı";
            case '7':
                return "yeddi";
            case '8':
                return "səkkiz";
            case '9':
                return "doqquz";
            default:
                return "error";
        }
    }
}
