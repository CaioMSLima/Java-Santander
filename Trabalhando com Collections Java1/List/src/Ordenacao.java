
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*Dadas as seguintes informações sobre meus gatos, crie uma lista
e ordene esta lista exibindo:
(nome - idade - cor);
Cachorro 1 = nome: Jon, idade: 18, cor: preto
Cachorro 2 = nome: Simba, idade: 6, cor: tigrado
Cachorro 3 = nome: Jon, idade: 12, cor: amarelo
*/

public class Ordenacao {
    public static void main(String[] args) {
        
        List<Cachorro> meusCachorros = new ArrayList<>(){{
            add(new Cachorro("Jon", 18, "preto"));
            add(new Cachorro("Simba", 6, "tigrado"));
            add(new Cachorro("Jon", 12, "amarelo"));
     }};
     
     System.out.println("--\tOrdem de Inserção\t---");
     System.out.println(meusCachorros);

     System.out.println("--\tOrdem aleatória\t---");
     Collections.shuffle(meusCachorros);
     System.out.println(meusCachorros);

     System.out.println("--\tOrdem Natural (Nome)\t---");
     Collections.sort(meusCachorros);
     System.out.println(meusCachorros);

     System.out.println("--\tOrdem Idade\t---");
    //  Collections.sort(meusCachorros,new  ComparatorIdade() ); tem a mesma funçao que o de baixo que foi feito de outro jeito
     meusCachorros.sort(new  ComparatorIdade());
     System.out.println(meusCachorros);

     System.out.println("--\tOrdem cor\t---");
     // Collections.sort(meusCachorros,new  ComparatorCor() );
     meusCachorros.sort(new ComparatorCor());
     System.out.println(meusCachorros);

     System.out.println("--\tOrdem Nome/Cor/Idade\t---");
     meusCachorros.sort(new ComparatorNomeCorIdade());
    }
}
class Cachorro implements Comparable<Cachorro> {
    private String nome;
    private Integer  idade;
    private String cor;

    

    
    public Cachorro(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return Integer return the idade
     */
    public Integer getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    /**
     * @return String return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return " [nome=" + nome + ", idade=" + idade + ", cor=" + cor + "]";
    }

    @Override
    public int compareTo(Cachorro cachorro){
        return this.getNome().compareToIgnoreCase(cachorro.getNome());
    }
    

}

class ComparatorIdade implements Comparator<Cachorro>{
    @Override
    public int compare(Cachorro c1, Cachorro c2){
        return Integer.compare(c1.getIdade(), c2.getIdade());
    }
}

class ComparatorCor implements Comparator<Cachorro>{
    @Override
    public int compare(Cachorro c1, Cachorro c2){
        return c1.getCor().compareToIgnoreCase(c2.getCor());
    }
}
class ComparatorNomeCorIdade implements Comparator<Cachorro>{
    @Override
    public int compare(Cachorro c1, Cachorro c2){
        int nome = c1.getNome().compareToIgnoreCase(c2.getNome());
        if (nome != 0) return nome;
        
        int cor = c1.getCor().compareToIgnoreCase(c2.getCor());
        if (cor!= 0) return cor;

        return Integer.compare(c1.getIdade(), c2.getIdade());
    }
}