


// Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:
//      Set notas = new HashSet(); //antes do java 5
//      HashSet<Double> notas = new HashSet<>();
//      Set<Double> notas = new HashSet<>(); //Generics(jdk 5) - Diamont Operator(jdk 7)
/*      Set<Double> notas = Set.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        notas.add(1d);
        notas.remove(5d);
        System.out.println(notas);
         Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0, 3.6));
        System.out.println(notas.toString());
*/


import java.util.*;


public class Metodos {
    public static void main(String[] args) {
        System.out.println("Crie um conjunto e adicione as notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas);

        System.out.println("Confira se a nota 7 está no conjunto: " + notas.contains(7d));

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a mairo nota: " + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Soma dos valores: " + soma);

        System.out.println("Exiba a média das notas: " + (soma / notas.size()));

        System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("Exiba todas as notas ne ordem em que foram informadadas: ");
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(5d);
        notas2.add(9.3);
        notas2.add(8.5d);
        notas2.add(0d);
        notas2.add(3.6);
        notas2.add(7d);
        System.out.println(notas2);

        System.out.println("Escreva todas as notas na ordem crecente: ");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

        System.out.println("Apague todo o conjunto");
        notas.clear();

        System.out.println("Confira se o conjunto esta vazio: " + notas.isEmpty());
        System.out.println("Confira se o conjunto 2 esta vazio: " + notas2.isEmpty());
        System.out.println("Confira se o conjunto 3 esta vazio: " + notas3.isEmpty());


    }
}
