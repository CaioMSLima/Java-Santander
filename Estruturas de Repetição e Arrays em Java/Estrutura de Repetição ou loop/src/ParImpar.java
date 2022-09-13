import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/

public class ParImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int qtdNumeros;
        int count = 0;
        int numero;
        int qtdPares = 0, qtdImpares = 0;

        System.out.println("Quantidade de números: ");
        qtdNumeros = scan.nextInt();

        do {
            System.out.println("Número: ");
            numero = scan.nextInt();
            

            if(numero % 2 == 0) qtdPares++;
            else qtdImpares++ ;
            
            count += 1;
        } while(count < qtdNumeros);

       System.out.println("Quantidade par: " + qtdPares);
       System.out.println("Quantidade Imar: " + qtdImpares); 
    }
}
