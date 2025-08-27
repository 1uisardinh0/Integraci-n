import java.util.Scanner;

public class Caracteristicas_Completas {

    //Metodo que permite inicializar el programa.
    public static void main(String[] args) {
        menu();
    }

    //Metodo que controla el flujo del código.
    public static void menu(){
        mostrar_menu();

        //Pide un dato por consola y lo guarda en una variable.
        Scanner entrada = new Scanner(System.in);
        String opcion = entrada.nextLine();

        //Permite eligir una opcion por consola en base a un dato.
        switch (opcion) {
            case "1" -> sumar();
            case "2" -> restar();
            case "3" -> multiplicar();
            case "4" -> dividir();
            case "5" -> cuadrado();
            case "6" -> cubo();
            default -> System.out.println("Opcion invalida. Intente nuevamente");
        }
    }

    //Muestra el menu del programa junto a sus opciones
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
                """);
    }

    //Metodo para operacion sumar.
    public static void sumar(){}

    //Metodo para operacion restar.
    public static void restar(){}

    //Metodo para operacion multiplicar.
    public static void multiplicar(){}

    //Metodo para operacion dividir.
    public static void dividir(){}

    //Metodo para elevar un numero al cuadrado.
    public static void cuadrado(){}

    //Metodo para elevar un numero al cubo.
    public static void cubo(){}
}