package Controllers;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class ShowText {
    public void showText() {

        try {
            FileInputStream fis = new FileInputStream("PERSON2.TXT");
            int byteLeido;
            ArrayList<String> cadenas = new ArrayList<String>();
            String cad = "";
            while ((byteLeido = fis.read()) != -1) {
                if (byteLeido != 92 && byteLeido != 10) {
                    String hexDecimal = Integer.toHexString(byteLeido);
                    cad += hexDecimal;
                } else {
                    cadenas.add(cad);
                    cad = "";
                }

            }
            Business business = new Business();
            fis.close();
            System.out.println(cadenas.get(5));
            System.out.println(Integer.parseInt(cadenas.get(5), 16));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
