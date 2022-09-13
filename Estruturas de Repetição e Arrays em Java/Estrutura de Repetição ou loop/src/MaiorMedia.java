import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/

public class MaiorMedia {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //variáveis
        double numero; // numero digitado
        int count = 0; //controla o loop
        double maior = 0;//guarda o  maior
        double soma = 0; //guarda a soma
        double media; //guarda a média
      
     
        do {
            System.out.println("Numero: ");
            numero = scan.nextInt();

            soma += numero;

            if(numero > maior) maior = numero;
            

            count += 1;
            
        } while(count < 5);

        media = ( soma/5);
        System.out.println("Maior: " + maior);
        System.out.println("Media: " + media);
    }  
}


  
 

  