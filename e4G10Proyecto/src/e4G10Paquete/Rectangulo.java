
package e4G10Paquete;


public class Rectangulo implements CalculosFormas{
    private double ladoA;
    private double ladoB;

    public Rectangulo() {
    }

    public Rectangulo(double ladoA, double ladoB) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    @Override
    public double calcularArea() {
        return this.ladoA*this.ladoB;
    }

    @Override
    public double calcularPerimetro() {
        return 2*(this.ladoA+this.ladoB);
    }
    
}
