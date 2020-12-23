package ru.prostowebs;

import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Ipelcher\'s Minecraft ModPack System!");

        System.out.print("Please enter full path to ModPack directory: ");
        File mpfdir1 = new File(scanner.nextLine());
        if (!mpfdir1.exists()) {
            mpfdir1.mkdir();
        }
        System.out.println("Options: ");
        System.out.println("1 - Create ModPack");
        System.out.println("2 - Choose ModPack");
        System.out.println("");
        System.out.print("Choose what you want to do: ");
        int option = scanner.nextInt();
        if (option == 1) {
            //code1
        } else if (option == 2) {
            //code2
        } else {
            System.out.println("ERROR: This option isn't exists!");
        }
    }
}
