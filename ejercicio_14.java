import java.util.Scanner;

public class ejercicio_14 {
    public static void main (String[] args){
        float a;
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese un numero:");
        a= entrada.nextInt();
        System.out.println("El cuadrado del número ingresado es "+ + a*a);
        System.out.println("El cubo del número ingresado es "+ + a*a*a);

    }
}