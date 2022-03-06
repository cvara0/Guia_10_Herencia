
package e1g10Paquete;

import java.util.Locale;
import java.util.Scanner;


public class Gato extends Animal{
    public Gato() {
    }

    public Gato(String nombre, String alimento, String raza, byte edad) {
        super(nombre, alimento, raza, edad);
    }

    @Override
    public void alimentarse() {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println(super.getNombre()+" se alimenta de "+super.getAlimento());
    }
}
