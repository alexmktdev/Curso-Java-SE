// operadores en java

import java.util.Scanner;

public class ejemplo_03_operadores {
    public static void main(String[] args) {

        // declaramos las variables a utilizar
        double num1, num2, suma,resta,multiplicacion,division;

        System.out.println("*** Sistema Calculadora Simple ***");
        // usaremos scanner para traer valores por teclado  y lo activamos
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresa el primer numero: ");
        num1 = teclado.nextDouble(); // para entrada double
        System.out.println("Ingresa el segundo numero: ");
        num2 = teclado.nextDouble(); // para entrada doble

        // hacemos las operaciones
        suma = num1 + num2;
        resta = num1 - num2;
        division = num1 / num2;
        multiplicacion = num1 * num2;

        // mostramos los resultados
        System.out.println("La suma de " + num1 + " + "+ num2 + " = " + suma );
        System.out.println("La resta de " + num1 + " - "+ num2 + " = " + resta );
        System.out.println("La multiplicacion de " + num1 + " * "+ num2 + " = " + multiplicacion);
        System.out.println("la division de " + num1 + " / "+ num2 + " = " + division);

        teclado.close(); // cerramos la entrada por seguridad

        // detalle
        // al ingresar los datos por teclado en teclado en español los numeros se ponen con coma

    }
}
