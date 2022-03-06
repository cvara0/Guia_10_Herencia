package e2g10Paquete;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E2g10ProyectoMain {

    public static void main(String[] args) {
      Lavadora lavadora1=new Lavadora();
      Televisor televisor1=new Televisor();
      
      lavadora1.crearLavadora();
      televisor1.crearTelevisor();
      
      lavadora1.precioFinal();
      televisor1.precioFinal();
      
        System.out.println("Precio final de lavadora: "+lavadora1.getPrecio());
        System.out.println("Precio final de televisor: "+televisor1.getPrecio());
           
    }
    
}
/*
Finalmente, en el main debemos realizar lo siguiente:
Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios
para mostrar el precio final de los dos electrodomésticos.
*/