//Read keyboard inputs then output
package DataStructuresCourse;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SimpleIO {
    public static void main(String[] args) throws Exception {
        BufferedReader keybd = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(keybd.readLine());
    }
}
