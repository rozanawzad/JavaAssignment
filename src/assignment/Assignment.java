/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import java.util.Scanner;

public class Assignment {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 1. Ask about name length
        System.out.print("What is your name's lenght? ");
        // 2. Take user input for the name length
        int nameLength = input.nextInt();
        // 3. Create an array equal to the name lenght
        char[] nameChars = new char[nameLength];
        // 4. Take users input and put the letters in the array
        System.out.println("Enter your name letters:");
        for(int i = 0; i < nameLength; i++) {
          nameChars[i] = input.next().charAt(0);
        }
        // 5. Print out the name
        System.out.print("Name is: ");
        for (int i = 0; i < nameLength; i++) {
          System.out.print(nameChars[i]);
        }
    }
}
