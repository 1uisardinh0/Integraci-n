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


        if (opcion.equals("1")){
            sumar();
        }
        else if (opcion.equals("2")){
            restar();
        }
        else if (opcion.equals("3")){
            multiplicar();
        }
        else if (opcion.equals("4")){
            dividir();
        }
        else if (opcion.equals("5")){
            cuadrado();
        }
        else if (opcion.equals("6")){
            cubo();
        }
        else {
            System.out.println("Opcion invalida. Intente nuevamente");
        }
    }

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

    public static void sumar(){

    }

    public static void restar(){}

    public static void multiplicar(){}

    public static void dividir(){}

    public static void cuadrado(){}

    public static void cubo(){}
}