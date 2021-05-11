package com.crucosoft.mixed;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Scanner;

public class FifthTask {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            System.out.print("Enter operator: ");
            String operator = scanner.next();
            
            System.out.print("Enter first number: ");
            BigDecimal firstNumber = new BigDecimal(scanner.next());
            BigDecimal secondNumber = null;
            
            if(!operator.equals("sqrt")) {
                System.out.print("Enter second number: ");
                secondNumber = new BigDecimal(scanner.next());
            }
            
            BigDecimal answer = null;
            
            switch (operator){
                case "+":
                    answer = firstNumber.add(secondNumber);
                    break;
                case "-":
                    answer = firstNumber.subtract(secondNumber);
                    break;
                case "*":
                    answer = firstNumber.multiply(secondNumber);
                    break;
                case "/":
                    answer = firstNumber.divide(secondNumber, 3, RoundingMode.HALF_UP);
                    break;
                case "sqrt":
                    answer = firstNumber.sqrt(MathContext.UNLIMITED);
            }

            assert answer != null;
            System.out.println("Answer: " + answer.stripTrailingZeros().toPlainString());
        }catch (NullPointerException ignored){
            System.out.println("Error occurred");
        }catch (NumberFormatException | ArithmeticException ex){
            System.out.println(ex.getMessage());
        }
    }
}
