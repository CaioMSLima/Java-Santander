import java.util.Scanner;

/* 
Faça um programa que leia conjuntos de dois valores,
o primeiro representa o nome do aluno e o segundo represnta sua idade
(Para o programa inserindo o valor 0 no campo nome)   

*/


public class Nome_Idade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome; //armazena o nome
        int idade;   //armazena a idade

        while(true) {//Enquando o loop for verdadeiro

            System.out.println("Nome: ");  //Peça o nome
            nome = scan.next(); //armazene esse nome na variável
            

            if (nome.equals("0")) //caso o nome igual a "0"
            break;//interrompa o programa
            
            System.out.println("Idade: ");  //Peça a idade
            idade = scan.nextInt();//armazene essa idade na variável
           
            
        }



    }
}
