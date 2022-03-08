
package e2g10Paquete;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public abstract class Electrodomestico implements OperacionesElectrodomestico{
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
    @Override
    public char comprobarConsumoEnergetico(Character letra){
        return(Character.toUpperCase(letra)<'A' || Character.toUpperCase(letra)>'F')?'F':Character.toUpperCase(letra);  
    }
    /*
    Método comprobarColor(String color): comprueba que el color es correcto, y
    si no lo es, usa el color blanco por defecto. Los colores disponibles para los
    electrodomésticos son blanco, negro, rojo, azul y gris. No importa si el nombre
    está en mayúsculas o en minúsculas. Este método se invocará al crear el
    objeto y no será visible.
    */
    @Override
    public String comprobarColor(String color){
        List<String> coloresDisponibles=new ArrayList<>(Arrays.asList("BLANCO","NEGRO", "ROJO", "AZUL", "GRIS"));
        return (!coloresDisponibles.contains(color.toUpperCase()))?"BLANCO":color.toUpperCase();
    }
    /*
    Metodo crearElectrodomestico(): le pide la información al usuario y llena el
    electrodoméstico, también llama los métodos para comprobar el color y el
    consumo. Al precio se le da un valor base de $1000.
    */
    @Override
    public void crearElectrodomestico(double precio,String color,char consumoEnergetico,double peso){
        this.precio=(precio<1000)?1000:precio;
        this.color=comprobarColor(color);
        this.consumoEnergetico=comprobarConsumoEnergetico(consumoEnergetico);
        this.peso=peso;
    }
    /*
    Método precioFinal(): según el consumo energético y su tamaño, aumentará
    el valor del precio. Esta es la lista de precios:
    */
    @Override
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
