package nl.novi.javaprogrammeren.collecties;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Main {

        public static void main(String[] args) {

        int[] numeric = {1,2,3,4,5,6,7,8,9,0};
        String[] alphabetic = {"één", "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "nul"};

        Translator translator = new Translator(alphabetic, numeric);
        boolean play = true;
        String ongeldig = "ongeldige invoer";
        Scanner scanner = new Scanner(System.in);

        while (play) {
                System.out.println("Type 'v' om te vertalen");
                System.out.println("Type 'x' om te stoppen ");
                char option = scanner.next().charAt(0);
                if (option == 'x') {
                        play = false;
                } else if (option == 'v') {
                    // get proper input
                    int number;
                        do {
                            System.out.println("Type een cijfer in van 0 t/m 9");
                            while (!scanner.hasNextInt()) {
                                System.out.println("Dat is geen geldig cijfer!");
                                scanner.next(); // belangrijk!!
                            }
                            number = scanner.nextInt();
                        } while (number < 0 || number >= 10);
                        // do lookup
                        String result = translator.translate(number);
                        System.out.println("De vertaling van " + number + " is " + result);
                    System.out.println();
                } else {
                        System.out.println(ongeldig);
                }
        }
    }
}
