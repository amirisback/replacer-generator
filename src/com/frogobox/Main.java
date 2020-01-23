package com.frogobox;

import java.util.Scanner;

public class Main implements MainView {

    public static void main(String[] args) {
        // write your code here
        new Main().view();
        new Main().logic();
    }

    @Override
    public void view() {
        System.out.println("Vokal Replace Generator");
        System.out.println("Create By Muhammad Faisal Amir");
        System.out.println("Github account @amirisback");
        System.out.println("Android Programmer");
        System.out.println("-----------------------------------");
        System.out.println();
    }

    @Override
    public void logic() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input Text \t\t\t: ");
        String inputText = scanner.nextLine();

        System.out.print("Input Character \t: ");
        String inputChar = scanner.nextLine();

        System.out.println("-----------------------------------");

        System.out.println("\nResult : ");
        System.out.println(new Helper().replacerVocal(inputText, inputChar));

    }

}
