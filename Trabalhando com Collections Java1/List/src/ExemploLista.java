import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploLista {
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        // Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:

//   Formas de criar uma lista:  
//      List notas = new ArrayList(); //antes do java 5
//      ArrayList<Double> notas = new ArrayList<>();
//      List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        /*List<Double> notas = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        notas.add(10d);
        System.out.println(notas);*/
        /*List<Double> notas = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        notas.add(1d);
        notas.remove(5d);
        System.out.println(notas);*/

        System.out.println("Crie uma lista e adicione as sete notas");
        List<Double> notas = new ArrayList<Double>();
        notas.add(7d);
        notas.add(10d);
        notas.add(1d);
        notas.add(9d);
        notas.add(5d);
        notas.add(6d);
        notas.add(8d);
        System.out.println(notas.toString());
        System.out.println(notas);

        System.out.println("Exiba a posição da nota 5.0");
        System.out.println(notas.indexOf(5d));

        System.out.println("Adicione na lista a nota 4.0 na posição 4: ");
        notas.add(4, 4d);  // primerio numro será a posição e o segundo o numero ou caractere que queira adicionar
        System.out.println(notas);

        System.out.println("Substitua a nota 10 pela nota 2.5");
        notas.set(notas.indexOf(10d), 2.5d);
        System.out.println(notas);

        System.out.println("confira se a nota 10 está na lista: ");
        System.out.println(notas.contains(10d));

        System.out.println("Exiba todas as notas na ordem em que foram informados: ");
        for (Double nota : notas) {
            System.out.println(nota);
        }
        System.out.println("a terceira nota adicionada é : " + notas.get(2));//ele me da o indice e quer saber qual é a nota
        System.out.println(notas);

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        System.out.println("Exiba a soma de valores: ");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
          Double next =  iterator.next();
          soma +=next;
        }
        System.out.println(soma);

        System.out.println("Exiba a média das notas: " + (soma/notas.size()));
        
        System.out.println("Remova  a nota 1: ");//vai remover a nota com valor 1
        notas.remove(1d);
        System.out.println(notas);

        System.out.println("Remova a nota na posição 1: ");
        notas.remove(1);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()) {
            Double next = iterator1.next();
            if(next < 7) iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("Apagar toda a Lista");
        notas.clear();
        System.out.println(notas);

        
    }
}
