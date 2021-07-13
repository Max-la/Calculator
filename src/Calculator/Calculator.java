
package Calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
   static Scanner userInput = new Scanner(System.in);
    static String name;
    static  String name1;
    static char operation;
    static int result;

    public static void main(String[] args) {
        String user = userInput.nextLine();
        char ch[] = new char[10];
        for (int i = 0;i < user.length();i++){
            ch[i] = user.charAt(i);
            if (ch[i] == '+'){
                operation = '+';

            }
            else if (ch[i] == '-'){
                operation = '-';
            }
            else if (ch[i] == '*'){
                operation = '*';
            }
            else if (ch[i] == '/'){
                operation = '/';
            }

        }
        String str = String.valueOf(ch);
        String roma[] = str.split("[+-/*]");
        String n1 = roma[0];
        name = n1.trim();
        String n2 = roma[1];
        name1 = n2.trim();
        int num = toRom(name);
        int num1 = toRom(name1);
        if (num > 0 & num1 > 0 & num <= 10 & num1 <= 10) {


            result = calcRom(num, num1, operation);

            String resultRrom = toRom(result);

            System.out.println(name + " " + operation + " " + name1 + " = " + resultRrom);}
        else {


            num = Integer.parseInt(name);
            num1 = Integer.parseInt(name1);
            result = calcRom(num,num1,operation);
            System.out.println(num + " " + operation + " " + num1 + " = " + result);}






    }


    public static int calcRom(int a,int b,char operation) {
        int result = 0;
        if (operation == '+'){
            result = a + b;
        }
        else if (operation == '-'){
            result = a - b;
        }
        else if (operation == '*'){
            result = a * b;
        }
        else if (operation == '/') {
            try {
                result = a / b;
            } catch (ArithmeticException | InputMismatchException e) {
                System.out.println("Exception" + e);
                System.out.println("error");
            }

        }
        return result;
    }

    private static String toRom (int numArab){

        String[] rom = {"0", "I", "II", "III", "IV", "V", "VI", "VII", "VIII","IX","X","XI","XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};
        return rom[numArab];
    }
    public static int toRom(String rom1){
        try {
            switch (rom1) {
                case "I":
                    return 1;
                case "II":
                    return 2;
                case "III":
                    return 3;
                case "IV":
                    return 4;
                case "V":
                    return 5;
                case "VI":
                    return 6;
                case "VII":
                    return 7;
                case "VIII":
                    return 8;
                case "IX":
                    return 9;
                case "X":
                    return 10;

            }


        }catch (InputMismatchException e) {
            throw new InputMismatchException("error");
        }
        return -1;


    }

}







