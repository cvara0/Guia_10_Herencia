package e2g10Paquete;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class E2y3g10Main {

    public static void main(String[] args) {
        Lavadora lavadora1 = new Lavadora();
        Televisor televisor1 = new Televisor();
        Lavadora lavadora2 = new Lavadora();
        Televisor televisor2 = new Televisor();

        lavadora1.crearLavadora(1200, "negro", 'd', 23, 5);
        televisor1.crearTelevisor(5000, "negro", 'a', 5, 46, true);
        lavadora2.crearLavadora(900, "azul", 'f', 15, 3);
        televisor2.crearTelevisor(3000, "negro", 'b', 3, 23, false);

        System.out.println("Precio de lavadora 1: " + lavadora1.getPrecio());
        System.out.println("Precio de televisor 1: " + televisor1.getPrecio());
        System.out.println("Precio de lavadora 2: " + lavadora2.getPrecio());
        System.out.println("Precio de televisor 2: " + televisor2.getPrecio());
        System.out.println("");

        List<Electrodomestico> arrayListElectrodomestico = new ArrayList<>(Arrays.asList(lavadora1, televisor1, lavadora2, televisor2));
        double precioTotal=0;
        for (Electrodomestico i : arrayListElectrodomestico) {
            i.precioFinal();
            System.out.println("Precio final de un/a "+i.getClass().getSimpleName()+": "+i.getPrecio());
            precioTotal+=i.getPrecio();
        }
            System.out.println("\nPrecio total de todos los electrodomésticos: "+precioTotal);

    }

}
/*
Finalmente, en el main debemos realizar lo siguiente:
Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios
para mostrar el precio final de los dos electrodomésticos.

ej3//////////
Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de
Electrodomésticos para guardar 4 electrodomésticos, ya sean lavadoras o
televisores, con valores ya asignados.
Luego, recorrer este array y ejecutar el método precioFinal() en cada
electrodoméstico. Se deberá también mostrar el precio de cada tipo de objeto,
es decir, el precio de todos los televisores y el de las lavadoras. Una vez hecho
eso, también deberemos mostrar, la suma del precio de todos los
Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de 2000
y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
electrodomésticos, 2000 para lavadora y 5000 para televisor.

 */
