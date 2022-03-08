
package e1exG10Paquete;

import java.time.LocalDate;


public class Velero extends Barco {
    private int nroDeMastiles;

    public Velero() {
    }

    public Velero(int nroDeMastiles, String matricula, double eslora, LocalDate anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.nroDeMastiles = nroDeMastiles;
    }

    public int getNroDeMastiles() {
        return nroDeMastiles;
    }

    public void setNroDeMastiles(int nroDeMastiles) {
        this.nroDeMastiles = nroDeMastiles;
    }

    @Override
    public double calcularModulo() {
        return super.calcularModulo()+this.nroDeMastiles;
    }
    
}
