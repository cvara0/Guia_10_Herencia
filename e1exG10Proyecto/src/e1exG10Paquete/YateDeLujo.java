
package e1exG10Paquete;

import java.time.LocalDate;


public class YateDeLujo extends BarcoAMotor{
    private int nroCamarotes;

    public YateDeLujo() {
    }

    public YateDeLujo(int nroCamarotes, double potencia, String matricula, double eslora, LocalDate anioFabricacion) {
        super(potencia, matricula, eslora, anioFabricacion);
        this.nroCamarotes = nroCamarotes;
    }

    public int getNroCamarotes() {
        return nroCamarotes;
    }

    public void setNroCamarotes(int nroCamarotes) {
        this.nroCamarotes = nroCamarotes;
    }
    @Override
    public double calcularModulo() {
        return super.calcularModulo()+this.nroCamarotes;
    }
}
