package Controllers;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class ShowText {

    public void showText() {
        String rutaArchivo = "PERSON2.TXT";

        try {
            FileInputStream fis = new FileInputStream(rutaArchivo);

            int byteLeido;
            while ((byteLeido = fis.read()) != -1) {
                System.out.print(Integer.toString(byteLeido, 16));
            }

            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
