package e1g10Paquete;

public class E1g10Main {

    public static void main(String[] args) {
      
        Gato gato1 = new Gato("carl", "gati", "angora", (byte) 5);
        Caballo caballo1 = new Caballo("tornado", "pasto", "carrera", (byte) 2);
        System.out.println("gato1:");
        gato1.alimentarse();
        System.out.println("caballo1:");
        caballo1.alimentarse();

        Perro perro1 = new Perro("tomy", "dogchow", "caniche", (byte) 3);
        Animal perro2 = new Perro("tomy", "dogchow", "caniche", (byte) 3);//tiene las propiedades de Animal mas las de Perro
        Animal perro3 = new Animal("tomy", "dogchow", "caniche", (byte) 3);
        System.out.println("perro1:");
        perro1.alimentarse();
        System.out.println("perro2:");
        perro2.alimentarse();
        System.out.println("perro3:");
        perro3.alimentarse();
        
        
    }

}
/*
1. Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del
Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá
mostrar luego un mensaje por pantalla informando de que se alimenta. Generar
una clase Main que realice lo siguiente:

 */
