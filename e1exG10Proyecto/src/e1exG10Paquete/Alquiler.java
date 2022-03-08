
package e1exG10Paquete;

import java.time.LocalDate;
import java.time.Period;


public class Alquiler<E>{
    
    private Cliente datosCliente;
    private E barcoAlquilado;
    private final LocalDate fechaAlquiler=LocalDate.now();
    private LocalDate fechaDevolucion;

    public Alquiler() {
    }

    public Alquiler(Cliente datosCliente, E barcoAlquilado, LocalDate fechaDevolucion) {
        this.datosCliente = datosCliente;
        this.barcoAlquilado = barcoAlquilado;
        this.fechaDevolucion = fechaDevolucion;
    }

    public Cliente getDatosCliente() {
        return datosCliente;
    }

    public void setDatosCliente(Cliente datosCliente) {
        this.datosCliente = datosCliente;
    }

    public E getBarcoAlquilado() {
        return barcoAlquilado;
    }

    public void setBarcoAlquilado(E barcoAlquilado) {
        this.barcoAlquilado = barcoAlquilado;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public int cantidadDeDias(){
        return Period.between(this.fechaAlquiler, this.fechaDevolucion).getDays();
    }
    
    /*public double calcularAlquiler() {
        return cantidadDeDias()*tipoDeBarco.calcularModulo();    
    }*/
   
   
    
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