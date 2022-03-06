
package e2g10Paquete;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public abstract class Electrodomestico {
    protected Double precio; //publico para la familia, privado para los externos
    protected String color; 
    protected Character consumoEnergetico;
    protected Double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(Double precio, String color, Character consumoEnergetico, Double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Character getConsumoEnmergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnmergetico(Character consumoEnmergetico) {
        this.consumoEnergetico = consumoEnmergetico;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }
    
    /*
    Método comprobarConsumoEnergetico(char letra): comprueba que la letra
    es correcta, sino es correcta usara la letra F por defecto. Este método se debe
    invocar al crear el objeto y no será visible.
    */
    public char comprobarConsumoEnergetico(Character letra){
        letra=Character.toUpperCase(letra);
       // if(letra<'A' || letra>'F'){
         //   letra='F';
        //}
        letra=(letra<'A' || letra>'F')?'F':letra;
        return letra;
            
    }
    /*
    Método comprobarColor(String color): comprueba que el color es correcto, y
    si no lo es, usa el color blanco por defecto. Los colores disponibles para los
    electrodomésticos son blanco, negro, rojo, azul y gris. No importa si el nombre
    está en mayúsculas o en minúsculas. Este método se invocará al crear el
    objeto y no será visible.
    */
    public String comprobarColor(String color){
        List<String> coloresDisponibles=new ArrayList<>(Arrays.asList("BLANCO","NEGRO", "ROJO", "AZUL", "GRIS"));
        color=color.toUpperCase();
        //if (!coloresDisponibles.contains(color))
           // color="BLANCO"; 
        color=(!coloresDisponibles.contains(color))?"BLANCO":color;
        return color;
    }
    /*
    Metodo crearElectrodomestico(): le pide la información al usuario y llena el
    electrodoméstico, también llama los métodos para comprobar el color y el
    consumo. Al precio se le da un valor base de $1000.
    */
    public void crearElectrodomestico(){
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingresando a clase padre\n");
        System.out.print("Ingrese precio:");
        this.precio=entrada.nextDouble();
        this.precio=(this.precio<1000)?1000:this.precio;
        System.out.print("Ingrese color:");
        this.color=entrada.next();
        this.color=comprobarColor(this.color);
        System.out.print("Ingrese consumo energético:");
        this.consumoEnergetico=entrada.next().charAt(0);
        this.consumoEnergetico=comprobarConsumoEnergetico(this.consumoEnergetico);
        System.out.print("Ingrese peso:");
        this.peso=entrada.nextDouble();
        System.out.println("Saliendo de clase padre\n");
       
        
    }
    /*
    Método precioFinal(): según el consumo energético y su tamaño, aumentará
    el valor del precio. Esta es la lista de precios:
    */
    public void precioFinal(){
        this.precio=(this.consumoEnergetico=='A')?(this.precio+1000):this.precio;
        this.precio=(this.consumoEnergetico=='B')?(this.precio+800):this.precio;
        this.precio=(this.consumoEnergetico=='C')?(this.precio+600):this.precio;
        this.precio=(this.consumoEnergetico=='D')?(this.precio+500):this.precio;
        this.precio=(this.consumoEnergetico=='E')?(this.precio+300):this.precio;
        this.precio=(this.consumoEnergetico=='F')?(this.precio+100):this.precio;
        this.precio=(this.peso>=1 && this.peso<=19)?(this.precio+100):this.precio;
        this.precio=(this.peso>=20 && this.peso<=49)?(this.precio+500):this.precio;
        this.precio=(this.peso>=50 && this.peso<=79)?(this.precio+800):this.precio;
        this.precio=(this.peso>=80)?(this.precio+1000):this.precio;
        
    } 
    
    
}
