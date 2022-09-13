import java.util.Scanner;

/*
Faça um Programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas.
Imprima as consoantes.
*/


public class Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String[] consoantes = new String[6];
        int qtdConsoantes = 0;

        int count = 0;
        do{
            System.out.println("Letra");
            String letra = scan.next();

            //se a letra informada não seja igual a a, e, i, o ou u , maiusculo ou minusculo.
            // o equalsIgnoreCase ele compara as strings com a outra se for igual vai ser  true 
            //a negacao acontece por conta do !
            if (!(letra.equalsIgnoreCase("a") ||
                    letra.equalsIgnoreCase("e") ||
                    letra.equalsIgnoreCase("i") ||
                    letra.equalsIgnoreCase("o") ||
                    letra.equalsIgnoreCase("u") )){
                        consoantes[count] = letra;
                        qtdConsoantes++;
                    }
                    count++;
        }while( count < consoantes.length );

        System.out.println("consoantes: ");
        for (String consoante : consoantes) {  //foreach para cada consoante dentro do array consoantes
            if (consoante != null) //se o valor da consoante for diferente de null
                System.out.print(consoante + " "); 
        }
        System.out.println("Quantidade de consoante: " + qtdConsoantes);
    }
}
