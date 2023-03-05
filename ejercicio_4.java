import java.util.Scanner;

public class ejercicio_4 {
    public static void main (String[] args){
        int a, b, c, d;
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese la edad de Juan:");
        a= entrada.nextInt();
        b= a*2/3;
        c=a*4/3;
        d=a+b+c;
        System.out.println("La edad de Alberto es "+ + b);
        System.out.println("La edad de Juan es "+ + a);
        System.out.println("La edad de Ana es "+ + c);
        System.out.println("La edad de la mam� es "+ + d);
        
    }
}