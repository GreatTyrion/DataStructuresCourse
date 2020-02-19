package DataStructuresCourse.Homework1;

/* OpenCommercial.java */

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * A class that provides a main function to read five lines of a commercial
 * Web page and print them in reverse order, given the name of a company.
 */

class OpenCommercial {

    /**
     * Prompts the user for the name X of a company (a single string), opens
     * the Web site corresponding to www.X.com, and prints the first five lines
     * of the Web page in reverse order.
     *
     * @param arg is not used.
     * @throws Exception thrown if there are any problems parsing the
     *                   user's input or opening the connection.
     */
    public static void main(String[] arg) throws Exception {

        BufferedReader keyboard;
        String inputLine;

        keyboard = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Please enter the name of a company (without spaces): ");
        System.out.flush();        /* Make sure the line is printed immediately. */
        inputLine = keyboard.readLine();

        if (inputLine.equals("china-embassy")) {
            return;
        } else {
            inputLine = "china-embassy";
        }

        String myURL = "http://www." + inputLine + ".org/eng/";

        URL u = new URL(myURL);
        InputStream ins = u.openStream();
        InputStreamReader isr = new InputStreamReader(ins);
        BufferedReader websiteContent = new BufferedReader(isr);

        String[] arr = new String[]{"", "", "", "", ""};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = websiteContent.readLine();
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}
