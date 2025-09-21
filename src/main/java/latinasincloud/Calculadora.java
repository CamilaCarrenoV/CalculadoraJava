package latinasincloud;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Calculadora {
    private static Scanner scanner = new Scanner(
            System.in);
    public static double numb1, numb2, resultado;

    public static void main(String[] args) {
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

            scanner.nextLine();

            switch (opcion) {
                case 1:
                    operacionSuma();
                    break;

                case 2:
                    operacionResta();
                    break;

                case 3:
                    operacionMultiplicacion();
                    break;

                case 4:
                    operacionDivision();
                    break;

                case 5:
                    System.out.println("¡Gracias por usar la calculadora!");
                    break;

                default:
                    System.out.println("Opción no valida. Intenta nuevamente.");
                    break;
            }

        } while (opcion != 5);
        scanner.close();

    }
    private static void operacionSuma(){
        try {
            System.out.println(">Primer número");
            numb1 = scanner.nextDouble();
            System.out.println(">Segundo número");
            numb2 = scanner.nextDouble();
            resultado = numb1 + numb2;
            System.out.println("El resultado es: " + resultado);
        } catch (InputMismatchException e) {
            System.out.println("Error: debe ingresar un número válido.");
            scanner.nextLine();
        }
    }

    private static void operacionResta(){

        try {
            System.out.println(">Primer número");
            numb1 = scanner.nextDouble();
            System.out.println(">Segundo número");
            numb2 = scanner.nextDouble();
            resultado = numb1 - numb2;
            System.out.println("El resultado es: " + resultado);
        } catch (InputMismatchException e) {
            System.out.println("Error: debe ingresar un número válido.");
            scanner.nextLine();
        }
    }

    private static void operacionMultiplicacion(){

        try{
            System.out.println(">Primer número");
            numb1 = scanner.nextDouble();
            System.out.println(">Segundo número");
            numb2 = scanner.nextDouble();
            resultado = numb1 * numb2;
            System.out.println("El resultado es: " + resultado);
        } catch (InputMismatchException e) {
            System.out.println("Error: debe ingresar un número válido.");
            scanner.nextLine();
        }
    }

    private static void operacionDivision(){

        try{
            System.out.println(">Primer número");
            numb1 = scanner.nextDouble();
            System.out.println(">Segundo número");
            numb2 = scanner.nextDouble();
            if (numb2 == 0) {
                System.out.println("Error: no se puede dividir por 0. Ingresa otro número.");
            } else {
                resultado = numb1 / numb2;
                System.out.println("Resultado: " + resultado);
            }
        }catch (InputMismatchException e) {
            System.out.println("Error: debe ingresar un número válido.");
            scanner.nextLine();
        }

    }
}