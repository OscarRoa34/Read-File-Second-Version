package Controllers;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class ShowText {
    public void showText() {

        try {
            FileInputStream fis = new FileInputStream("PERSON2.TXT");
            ArrayList<String> cadenas = new ArrayList<>();
            int byteLeido;
            int contador = 0;
            String codigo = "";
            String apellido = "";
            String nombre = "";
            String genero = "";
            String estadoCivil = "";
            String sueldo = "";

            while ((byteLeido = fis.read()) != -1) {
                if (byteLeido != 92 && byteLeido != 10 && byteLeido != 13) {
                    switch (contador) {
                        case 0:
                            codigo += (char) byteLeido;
                            break;
                        case 1:
                            apellido += (char) byteLeido;
                            break;
                        case 2:
                            nombre += (char) byteLeido;
                            break;
                        case 3:
                            genero += (char) byteLeido;
                            break;
                        case 4:
                            String binario = Integer.toBinaryString(byteLeido);
                            char ultimoDigito = binario.charAt(binario.length() - 1);
                            estadoCivil = (ultimoDigito == '1') ? "casado" : "soltero";
                            break;
                        case 5:
                            String hexDecimal1 = Integer.toHexString(byteLeido);
                            String hexByte2 = Integer.toHexString(fis.read());
                            String hexByte3 = Integer.toHexString(fis.read());
                            sueldo = Long.parseLong(hexDecimal1 + hexByte2 + hexByte3, 16) + "";
                            break;
                    }

                } else {
                    System.out.printf("%-10s%-20s%-20s%-5s%-10s%-10s%n",
                            codigo.trim(), apellido.trim(), nombre.trim(), genero.trim(), estadoCivil.trim(),
                            sueldo.trim());

                    cadenas.add(String.format("%-10s%-20s%-20s%-5s%-10s%-10s",
                            codigo.trim(), apellido.trim(), nombre.trim(), genero.trim(), estadoCivil.trim(),
                            sueldo.trim()));

                    contador++;
                    codigo = "";
                    apellido = "";
                    nombre = "";
                    genero = "";
                    estadoCivil = "";
                    sueldo = "";

                    if (contador == 6) {
                        System.out.println();
                    }

                    if (byteLeido == 10) {
                        contador = 0;
                    }
                }
            }
            fis.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
