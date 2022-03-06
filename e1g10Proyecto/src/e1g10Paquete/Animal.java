
package e1g10Paquete;

import java.util.Locale;
import java.util.Scanner;


public class Animal {
  private String nombre;
  private String alimento;
  private String raza;
  private byte edad;

    public Animal() {
    }

    public Animal(String nombre, String alimento, String raza, byte edad) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.raza = raza;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }
     
    public void alimentarse(){
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("balanceado");
    }
  
  
                    
}
