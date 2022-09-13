import java.util.Random;

/*
Faça um Programa que leia 20 números inteiros (entre 0 e 100) armazene-os num vetor.
Ao final mostre os números e seus sucessores.
*/

public class NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numerosAletorios = new int [20]; //array com 20 posições
        
        //para: variável i = numero, até i menor que o tamanho do array, acrescentamos 1 ao valor de i a cada loop.
        for(int i = 0; i < numerosAletorios.length; i++){
            int numero =  random.nextInt(100); //pegando um número aleatório entre 0 e 100.
            numerosAletorios[i] = numero;
        }

        System.out.print("Numeros Aleatorios: ");
        for (int numero : numerosAletorios) {  //esse é o foreach para cada numero dentro do array de números
            System.out.print(numero + " ");
        }

        System.out.print("\n Sucessores dos  Numeros Aleatorios: ");
        for (int numero : numerosAletorios) {
            System.out.print((numero + 1) + " ");
        }

        System.out.print("\n Antecessores dos  Numeros Aleatorios: ");
        for (int numero : numerosAletorios) {
            System.out.print((numero - 1) + " ");
        }
    }
}
