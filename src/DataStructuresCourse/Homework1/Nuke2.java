package DataStructuresCourse.Homework1;

/* OpenCommercial.java */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Nuke2 {
    public static void main(String[] args) throws Exception {
        BufferedReader keyboard;
        String inputLine;

        keyboard = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Please enter a string with more than one character from keyboard: ");
        System.out.flush();        /* Make sure the line is printed immediately. */
        inputLine = keyboard.readLine();

        if (inputLine.length() == 1) {
            System.out.println("The string should contain at least two characters!");
        } else {
            System.out.println(inputLine.substring(0, 1) + inputLine.substring(2));
        }

    }
}
