package latinasincloud;
import java.util.Scanner;

/*CALCULADORA JAVA
Crear un progrmama que simule una calculadora con las siguientes funciones:
- Sumar
- Restar
- Multiplicar
- Dividir
- Salir

REQUISITOS
* Generar una función por cada operación básica: +, -, *, /.
* Manejo de errores: En operaciones se debe validar si el divisor es mayor a 0 para evitar error de cálculo.
* Menú Interactivo: Usar Scanner para pedir datos al Usuario.
* GitHub: Subir el proyecto con commits claros. */

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        

    do {
        System.out.println("**Menú Calculadora**");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        System.out.println("Elige una opción: ");
        opcion = scanner.nextInt();


    } while (opcion != 5);
    }
}