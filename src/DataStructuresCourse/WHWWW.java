package DataStructuresCourse;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class WHWWW {
    public static void main(String[] args) throws Exception {
        URL u = new URL("http://www.whitehouse.gov/");
        InputStream ins = u.openStream();
        InputStreamReader isr = new InputStreamReader(ins);
        BufferedReader whiteHouse = new BufferedReader(isr);
        System.out.println(whiteHouse.readLine());
    }
}
