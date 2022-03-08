
package e1exG10Paquete;

import java.time.LocalDate;
import java.time.Period;


public class Alquiler{
    
    private Cliente datosCliente;
    private Barco datosBarco;
    private LocalDate fechaAlquiler;
    private LocalDate fechaDevolucion;

    public Alquiler() {
    }

    public Alquiler(Cliente datosCliente, Barco datosBarco, LocalDate fechaAlquiler, LocalDate fechaDevolucion) {
        this.datosCliente = datosCliente;
        this.datosBarco = datosBarco;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
    }

    public Cliente getDatosCliente() {
        return datosCliente;
    }

    public void setDatosCliente(Cliente datosCliente) {
        this.datosCliente = datosCliente;
    }

    public Barco getDatosBarco() {
        return datosBarco;
    }

    public void setDatosBarco(Barco datosBarco) {
        this.datosBarco = datosBarco;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    
    public double calcularAlquiler() {
        return Period.between(this.fechaAlquiler, this.fechaDevolucion).getDays()*datosBarco.calcularModulo();    
    }
   
   
    
}
/*

En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler
se guarda: el nombre, documento del cliente, la fecha de alquiler, fecha de
devolución, la posición del amarre y el barco que lo ocupará.

Un Barco se caracteriza por: su matrícula, su eslora en metros y año de
fabricación.
Sin embargo, se pretende diferenciar la información de algunos tipos de barcos
especiales:
• Número de mástiles para veleros.
• Potencia en CV para barcos a motor.
• Potencia en CV y número de camarotes para yates de lujo.

Un alquiler se calcula multiplicando el número de días de ocupación (calculado
con la fecha de alquiler y devolución), por un valor módulo de cada barco
(obtenido simplemente multiplicando por 10 los metros de eslora).

En los barcos de tipo especial el módulo de cada barco, se calcula sacando el
modulo normal y sumándole el atributo particular de cada barco. En los veleros
se suma el número de mástiles, en los barcos a motor se le suma la potencia en
CV y en los yates se suma la potencia en CV y el número de camarotes.
Utilizando la herencia de forma apropiada, deberemos programar en Java, las
clases y los métodos necesarios que permitan al usuario elegir el barco que
quiera alquilar y mostrarle el precio final de su alquiler.

*/