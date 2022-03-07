
package e4G10Paquete;


public class e4G10Main {

    
    public static void main(String[] args) {
      Rectangulo rect1=new Rectangulo(2,3);
      Circunferencia circ1=new Circunferencia(2);
        System.out.println("Perimetro rectangulo: "+rect1.calcularPerimetro());
        System.out.println("Perimetro circunferencia: "+circ1.calcularPerimetro());
        System.out.println("Area rectangulo: "+rect1.calcularArea());
        System.out.println("Area circunferencia: "+circ1.calcularArea());
    }
    
}
/*
Se plantea desarrollar un programa que nos permita calcular el área y el perímetro
de formas geométricas, en este caso un circulo y un rectángulo. Ya que este
calculo se va a repetir en las dos formas geométricas, vamos a crear una Interfaz,
llamada calculosFormas que tendrá, los dos métodos para calcular el área, el
perímetro y el valor de PI como constante.
Desarrollar el ejercicio para que las formas implementen los métodos de la
interfaz y se calcule el área y el perímetro de los dos. En el main se crearán las
formas y se mostrará el resultado final.
Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2

*/