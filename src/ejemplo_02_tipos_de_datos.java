
// tipos de datos en java
public class ejemplo_02_tipos_de_datos {
    public static void main(String[] args) {

        // Declaracion de Variables - se utiliza cammelCase

        // enteros en java
        int anio;
        int edad;

        // doubles en java
        double porcentaje;
        double estatura;
        double temperatura;

        // boolean en java
        boolean esPositivo;
        boolean tieneCarnetConducir;

        // char en java
        char letra;
        char simbolo;

        // Strings en java (clase wrapper)
        String Direccion;
        String numeroTelefono;

        // long - numero largo en java
        long numeroLargo;


        // Asignacion de variables
        edad = 18;
        anio = 1985;

        porcentaje = 0.89;
        temperatura = 22.5;
        esPositivo = false;

        letra = 'a';
        simbolo = '#';

        Direccion = "Avenida Oriente 2135";
        numeroTelefono = "+9009009009";

        numeroLargo = 23456789L;

        // tambien se puede hacer declaracion y asignacion en una sola linea
        String miDireccion = "Avenida Sur 2122";
        String miNumeroTelefono = "+9009009009";

        // o tambien multiples declaraciones y asignaciones en una sola linea de un mismo tipo
        int miVariable=10, miVariable2 = 20;

        // mostremos alguna variable en pantalla
        System.out.println("Mi edad es: " + edad + " años");
        System.out.println("Mi porcentaje es: " + porcentaje);
        System.out.println("Mi temperatura es: " + temperatura + " grados");

    }
}
