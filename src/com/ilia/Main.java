//Ilia Safarian
package com.ilia;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of the users you want to sign in:");

        int num = input.nextInt();

        String[] name = new String[10];
        String[] family = new String[10];
        int[] age = new int[10];

        String[] name2 = new String[10];
        String[] family2 = new String[10];
        int[] age2 = new int[10];

        //first user input//
        System.out.print("Enter the user's name: ");
        for (int i = 0; i < num; i++) {
            name[i] = input.nextLine();
        }
        System.out.print("Please enter your last name: ");
        for (int i = 0; i < num; i++) {
            family[i] = input.nextLine();
        }
        System.out.print("Please enter your age: ");
        for (int i = 0; i < num; i++) {
            age[i] = input.nextInt();
        }

        //second user input//
        System.out.print("Enter the user's name:");
        for (int j = 0; j < num; j++) {
            name2[j] = input.nextLine();
        }
        System.out.print("Enter the user's last name:");
        for (int j = 0; j < num; j++) {
            family2[j] = input.nextLine();
        }
        System.out.print("Enter the user's age:");
        for (int j = 0; j < num; j++) {
            age2[j] = input.nextInt();
        }


        if(name[0].equals(name2[0]) && family[0].equals(family2[0]) && age[0] == age2[0])
            throw new ArithmeticException("Error! - a user is repeated");
    }
}