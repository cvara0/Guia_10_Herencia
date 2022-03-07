
package e4G10Paquete;
public class Circunferencia implements CalculosFormas{
    private double radio;

    public Circunferencia() {
    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return PI*radio*radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2*PI*radio;
    }
    
}
