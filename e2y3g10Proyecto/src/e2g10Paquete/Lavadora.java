
package e2g10Paquete;

public final class Lavadora extends Electrodomestico{
   
    private double carga;

    public Lavadora() {
    }

    public Lavadora(Double precio, String color, Character consumoEnmergetico, Double peso,Double carga) {
        super(precio, color, consumoEnmergetico, peso);
        this.carga=carga;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }
 
    /*
    Método crearLavadora (): este método llama a crearElectrodomestico() de la
    clase padre, lo utilizamos para llenar los atributos heredados del padre y
    después llenamos el atributo propio de la lavadora.
    */

    public void crearLavadora(double precio,String color,char consumoEnergetico,double peso,double carga) {
        
        super.crearElectrodomestico(precio,color,consumoEnergetico,peso);
        this.carga=carga; 
    }
 
    /*
    Método precioFinal(): este método será heredado y se le sumará la siguiente
    funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500,
    si la carga es menor o igual, no se incrementará el precio. Este método debe
    llamar al método padre y añadir el código necesario. Recuerda que las
    condiciones que hemos visto en la clase Electrodoméstico también deben
    afectar al precio.
    */

    @Override
    public void precioFinal() {
        super.precioFinal();
        super.precio=(this.carga>30)?super.precio+500:super.precio;
    }  
}
/*
A continuación se debe crear una subclase llamada Lavadora, con el atributo
carga, además de los atributos heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la carga y el resto de atributos heredados. Recuerda que
debes llamar al constructor de la clase padre.
Los métodos que se implementara serán:
• Método get y set del atributo carga.
• Método crearLavadora (): este método llama a crearElectrodomestico() de la
clase padre, lo utilizamos para llenar los atributos heredados del padre y
después llenamos el atributo propio de la lavadora.
• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500,
si la carga es menor o igual, no se incrementará el precio. Este método debe
llamar al método padre y añadir el código necesario. Recuerda que las
condiciones que hemos visto en la clase Electrodoméstico también deben
afectar al precio.

*/