package e1exG10Paquete;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class e1exG10Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        

        System.out.println("Nuevo alquiler de barco\n");
        System.out.print("Nombre: ");
        String nombre = entrada.next();
        System.out.print("Nro. documento: ");
        String nroDocumento = entrada.next();
        Cliente nuevoCliente = new Cliente(nombre, nroDocumento);
        System.out.println("Fecha de devolución: ");
        System.out.print("Día: ");
        int dia = entrada.nextInt();
        System.out.print("Mes: ");
        int mes = entrada.nextInt();
        System.out.print("Año: ");
        int anio = entrada.nextInt();
        LocalDate fechaDevolucion = LocalDate.of(anio, mes, dia);

        System.out.println("Seleccione tipo de embarcación: ");
        System.out.println("1. Velero");
        System.out.println("2. Barco a motor");
        System.out.println("3. Yate de lujo");
        System.out.print("Opción: ");
        byte opcion = entrada.nextByte();
        switch (opcion) {
            case 1:
                System.out.print("Nro. de mástiles: ");
                int nroMastiles=entrada.nextInt();
                Alquiler <Velero> nuevoAlquilerVelero = new Alquiler<>();
                break;
            case 2:
                Alquiler <BarcoAMotor> nuevoAlquilerBarcoAMotor = new Alquiler<>();
                break;
            case 3:
                Alquiler <YateDeLujo> nuevoAlquilerYateDeLujo = new Alquiler<>();
                break;
            default:
                System.out.println("Ingreso incorrecto");

        }
        System.out.println("Precio final: ");

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
Utilizando la herencia de forma apropiada, 

deberemos programar en Java, las
clases y los métodos necesarios que permitan al usuario elegir el barco que
quiera alquilar y mostrarle el precio final de su alquiler.

*/
