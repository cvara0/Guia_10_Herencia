
package e2g10Paquete;

import java.util.Locale;
import java.util.Scanner;


public final class Televisor extends Electrodomestico{
    private double resolucion;
    private boolean sintonizadorTDT;

    public Televisor() {
    }

    public Televisor(Double precio, String color, Character consumoEnergetico, Double peso,double resolucion,boolean sintonizadorTDT) { 
        super(precio, color, consumoEnergetico, peso);
        this.resolucion=resolucion;
        this.sintonizadorTDT=sintonizadorTDT;
    }

    public double getResolucion() {
        return resolucion;
    }

    public void setResolucion(double resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }
    
    /*
    Método crearTelevisor(): este método llama a crearElectrodomestico() de la
    clase padre, lo utilizamos para llenar los atributos heredados del padre y
    después llenamos los atributos del televisor.
    */
    public void crearTelevisor(){
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Creando televisor\n");
        super.crearElectrodomestico();
        System.out.println("Ingrese resolucion(pulgadas): ");
        this.resolucion=entrada.nextDouble();
        System.out.println("Posee sintonizador TDT? s=si otra tecla=no: ");
        this.sintonizadorTDT=(entrada.next().charAt(0)=='s');
        System.out.println("Televisor creado\n");
    }

    /*
     Método precioFinal(): este método será heredado y se le sumará la siguiente
    funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
    incrementará el precio un 30% y si tiene un sintonizador TDT incorporado,
    aumentará $500. Recuerda que las condiciones que hemos visto en la clase
    Electrodomestico también deben afectar al precio.
    */
    @Override
    public void precioFinal() {
        super.precioFinal();
        super.precio=(this.resolucion>40)?(super.precio+0.4*super.precio):super.precio;
        super.precio=(this.sintonizadorTDT)?(super.precio+500):super.precio;      
    }   
}

/*
Se debe crear también una subclase llamada Televisor con los siguientes
atributos: resolución (en pulgadas) y sintonizador TDT (booleano), además de los
atributos heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la resolución, sintonizador TDT y el resto de atributos
heredados. Recuerda que debes llamar al constructor de la clase padre.
Los métodos que se implementara serán:
• Método get y set de los atributos resolución y sintonizador TDT.
• Método crearTelevisor(): este método llama a crearElectrodomestico() de la
clase padre, lo utilizamos para llenar los atributos heredados del padre y
después llenamos los atributos del televisor.
• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado,
aumentará $500. Recuerda que las condiciones que hemos visto en la clase
Electrodomestico también deben afectar al precio.
*/