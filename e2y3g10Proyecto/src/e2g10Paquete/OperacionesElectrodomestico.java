
package e2g10Paquete;


public interface OperacionesElectrodomestico {
    char comprobarConsumoEnergetico(Character letra);
    String comprobarColor(String color);
    void crearElectrodomestico(double precio,String color,char consumoEnergetico,double peso);
    void precioFinal();
}
