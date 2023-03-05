import java.util.Scanner;

public class ejercicio_12  {
    public static void main (String[] args){
        int horas_semana;
        float valor_hora, salario_bruto, salario, reten_fuente;
        double retencion;
        horas_semana=48;
        valor_hora=5000;
        retencion=0.125;
        salario_bruto= horas_semana*valor_hora;
        reten_fuente=(float) ((float)salario_bruto*retencion);
        salario=salario_bruto-reten_fuente;
        
        System.out.println("El salario bruto es "+ + salario_bruto);
        System.out.println("La retencion en la fuente es de "+ + reten_fuente);
        System.out.println("El salario neto es "+ + salario);
        
    }
}