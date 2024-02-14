package Controllers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ShowText {

    public void showText() {
        String rutaArchivo = "PERSON2.TXT";

        try (FileReader fr = new FileReader(rutaArchivo);
                BufferedReader br = new BufferedReader(fr)) {

            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split("\\\\");

                if (datos.length >= 6 && !datos[4].isEmpty() && !datos[5].isEmpty()) {
                    String codigo = datos[0];
                    String apellido = datos[2];
                    String nombre = datos[1];
                    String genero = datos[3];
                    char pesoR = datos[4].charAt(0);
                    char sueldoR = datos[5].charAt(0);

                    int valorNumericoPeso = (int) pesoR;
                    int valorNumericoSueldo = (int) sueldoR;

                    System.out.printf("%-12s\t%-20s\t%-20s\t%-12s\t%-12d\t%-12d\n", codigo, apellido, nombre, genero,
                            valorNumericoPeso, valorNumericoSueldo);
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
