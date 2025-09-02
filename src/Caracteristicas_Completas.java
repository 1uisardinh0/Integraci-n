import java.util.Scanner;

public class Caracteristicas_Completas {

    //Metodo que permite inicializar el programa.
    public static void main(String[] args) {
        menu();
    }

    //Metodo que controla el flujo del código.
    public static void menu(){
        Scanner entrada = new Scanner(System.in);
        boolean salir = false;

        do {
            mostrar_menu();

            //Pide un dato por consola y lo guarda en una variable.
            String opcion = entrada.nextLine();

            //Permite eligir una opcion por consola en base a un dato.
            switch (opcion) {
                case "1" -> sumar();
                case "2" -> restar();
                case "3" -> multiplicar();
                case "4" -> dividir();
                case "5" -> cuadrado();
                case "6" -> cubo();
                case "7" -> tablaMultiplicar();
                case "8" -> salir = true;
                default -> System.out.println("Opcion invalida. Intente nuevamente");
            }
        }

        while (!salir);
        System.out.println("Gracias por usar la calculadora...");
    }

    //Muestra el menu del programa junto a sus opciones.
    public static void mostrar_menu(){
        System.out.println("""
                ---Bienvenido a la Calculadora---
                
                Seleccione una opcion:
                1. Sumar
                2. Restar
                3. Multiplicar
                4. Dividir
                5. Cuadrado
                6. Cubo
                7. Tabla de Multiplicar.
                8. Salir
                """);
    }

    //Metodo para operación sumar.

    public static void sumar(){
        int num1, num2;
        Scanner  entrada = new Scanner(System.in);

        System.out.println("Ingrese el primer número...");
        num1 = entrada.nextInt();
        System.out.println("Ingrese el segundo número...");
        num2 = entrada.nextInt();

        int resultado  = num1 + num2;

        System.out.println("El resultado es: " + resultado);
    }

    //Metodo para operación restar.
    public static void restar(){
        int num1, num2;
        Scanner  entrada = new Scanner(System.in);

        System.out.println("Ingrese el primer número...");
        num1 = entrada.nextInt();
        System.out.println("Ingrese el segundo número...");
        num2 = entrada.nextInt();

        int resultado  = num1 - num2;

        System.out.println("El resultado es: " + resultado);
    }

    //Metodo para operación multiplicar.
    public static void multiplicar(){
        int num1, num2;
        Scanner  entrada = new Scanner(System.in);

        System.out.println("Ingrese el primer número...");
        num1 = entrada.nextInt();
        System.out.println("Ingrese el segundo número...");
        num2 = entrada.nextInt();

        int resultado  = num1 * num2;

        System.out.println("El resultado es: " + resultado);
    }

    //Metodo para operación dividir.
    public static void dividir(){
        int num1, num2;
        Scanner  entrada = new Scanner(System.in);

        System.out.println("Ingrese el primer número...");
        num1 = entrada.nextInt();
        System.out.println("Ingrese el segundo número...");
        num2 = entrada.nextInt();

        int resultado  = num1 / num2;

        System.out.println("El resultado es: " + resultado);
    }

    //Metodo para elevar un numero al cuadrado.
    public static void cuadrado(){
        int num;
        Scanner  entrada = new Scanner(System.in);

        System.out.println("Ingrese el número...");
        num = entrada.nextInt();

        int resultado  = num * num;

        System.out.println("El resultado es: " + resultado);
    }

    //Metodo para elevar un numero al cubo.
    public static void cubo(){
        int num;
        Scanner  entrada = new Scanner(System.in);

        System.out.println("Ingrese el número...");
        num = entrada.nextInt();

        int resultado = (num * num) * num;

        System.out.println("El resultado es: " + resultado);
    }

    //Metodo que permite ver la tabla de multiplicar de un número.
    public static void tablaMultiplicar(){
        Scanner  entrada = new Scanner(System.in);
        int multiplicador = 1;
        int numero;

        System.out.println("Escriba el número...");
        numero = entrada.nextInt();

        while (multiplicador <= 10) {
            System.out.println(numero + " x " + multiplicador + " = " + numero * multiplicador);
            multiplicador++;
        }
    }
}