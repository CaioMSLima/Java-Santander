import java.util.Vector;

/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/

public class OrdemInversa {
    public static void main(String[] args) {
        
        int[] vetor = {-39, -5, 25, 70, 8, 4};

        System.out.println("Vetor: ");
        int count = 0;
        while(count < (vetor.length)){
            System.out.print(vetor[count] + " ");
            count ++;
       }

       System.out.println("\nVetor: "); // \n serve para endicar que vai pular uma linha antes desse print
       for (int i = (vetor.length - 1); i >= 0; i --){
            System.out.print(vetor[i] + " ");
    }

    }

    
}
