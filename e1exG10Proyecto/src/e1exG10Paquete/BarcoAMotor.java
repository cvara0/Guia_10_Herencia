
package e1exG10Paquete;

import java.time.LocalDate;


public class BarcoAMotor extends Barco {
    private double potencia;

    public BarcoAMotor() {
    }

    public BarcoAMotor(double potencia, String matricula, double eslora, LocalDate anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.potencia = potencia;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }
    @Override
    public double calcularModulo() {
        return super.calcularModulo()+this.potencia;
    }
}
