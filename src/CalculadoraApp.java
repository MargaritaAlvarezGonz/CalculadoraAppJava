import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        while (true) {
            System.out.println("****Aplicación Calculadora****");
            //Mostrar menú
            mostrarMenu();
            try {
                var operacion = Integer.parseInt(consola.nextLine());
                //Revisar que esté dentro de las opciones
                if (operacion >= 1 && operacion <= 4) {
                    ejecutarOperacion(operacion, consola);
                } else if (operacion == 5) {
                    System.out.println("Hasta pronto...");
                    break;
                } else {
                    System.out.println("Opción erronea: " + operacion);
                }
                System.out.println();
            }
                catch(Exception e){
                    System.out.println("Ocurrió un error: " + e.getMessage());
                }

        }
    }

    private static void mostrarMenu(){
        System.out.println("1. Suma \n2. Resta \n3. Multiplicación \n4. División \n5. Salir \n");
        System.out.println("Operación a realizar es: ");
    }
    private static void ejecutarOperacion(int operacion, Scanner consola){
        System.out.println("Proporciona valor operando 1: ");
        var operando1 = Integer.parseInt(consola.nextLine());
        System.out.println("Proporciona valor operando 2: ");
        var operando2 = Integer.parseInt(consola.nextLine());
        int resultado;
        switch (operacion) {
            case 1 -> {
                resultado = operando1 + operando2;
                System.out.println("Resultado Suma: " + resultado);
            }
            case 2 -> {
                resultado = operando1 - operando2;
                System.out.println("Resultado Resta " + resultado);
            }
            case 3 -> {
                resultado = operando1 * operando2;
                System.out.println("Resultado Multiplicación " + resultado);
            }
            case 4 -> {
                resultado = operando1 / operando2;
                System.out.println("Resultado División");
            }
            default -> {
                System.out.println("Opción errónea: " + operacion);
            }
        }

    }

}
