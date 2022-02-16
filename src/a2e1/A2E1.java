import java.util.Random;
import java.util.Scanner;

public class A2E1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //definir variables
        int N;
        int Valor;
        int Impares = 0;
        int Pares = 0;

        //generar numero al azar        
        Random Aleatoreo = new Random();

        //dedir dato
        System.out.print("Introduce un número: ");
        N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            Valor = Aleatoreo.nextInt(100) + 1;
            if (Valor % 2 == 0) {
                Pares = Pares + 1;
                System.out.println(Valor + " El numero es par");

            } else {
                Impares = Impares + 1;
                System.out.println(Valor + " El numero es impar");
            }
        }
        System.out.println("\n\nLos numeros pares son: " + Pares);
        System.out.println("Los numeros impares son: " + Impares);
    }

}
