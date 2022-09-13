/*Dadas as seguintes informações sobre meus livros favoritos e seus autores,
crie um dicionário e ordene este dicionário:
exibindo (Nome Autor - Nome Livro);
Autor = Soares, Jô  - Livro = nome: o Homen que Matou Getúlio Vargas. páginas: 342
Autor = Brown , Dan - Livro = nome:  O Código da Vinci, paginas: 367
Autor = McMahon, David  - Livro = Ameaça Cibernética, páginas: 236
*/


import java.util.*;

public class Ordenacao {
    public static void main(String[] args) {

        System.out.println("--\tOrdem aleatória\t--");
        Map<String,Livros> meusLivros = new HashMap<>(){{
            put(" Soares, Jô", new Livros("o Homen que Matou Getúlio Vargas", 342));
            put(" Brown, Dan ", new Livros("O Código da Vinci", 367));
            put(" McMahon, David", new Livros("Ameaça Cibernética", 236));
        }};
        for (Map.Entry<String, Livros> livros: meusLivros.entrySet())
            System.out.println(livros.getKey() + " - " + livros.getValue());

        System.out.println("--\tOrdem Inserção\t--");
        Map<String,Livros> meusLivros1 = new LinkedHashMap<>(){{
            put(" Soares, Jô", new Livros("o Homen que Matou Getúlio Vargas", 342));
            put(" Brown, Dan ", new Livros("O Código da Vinci", 367));
            put(" McMahon, David", new Livros("Ameaça Cibernética", 236));
        }};
        for (Map.Entry<String, Livros> livros: meusLivros1.entrySet())
            System.out.println(livros.getKey() + " - " + livros.getValue().getNome());

        System.out.println("--\tOrdem alfabética autores\t--");
        Map<String,Livros> meusLivros2 = new TreeMap<>(meusLivros1);
        for (Map.Entry<String, Livros> livros: meusLivros2.entrySet())
            System.out.println(livros.getKey() + " - " + livros.getValue().getNome());

        System.out.println("--\tOrdem alfabética nomes dos livros\t--");
        Set<Map.Entry<String, Livros>> meusLivros3 = new TreeSet<>(new ComparatorNome());
        meusLivros3.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livros> livros: meusLivros3)
            System.out.println(livros.getKey() + " - " + livros.getValue().getNome());



    }
}

class Livros{
    private String nome;
    private Integer paginas;

    public Livros(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public Integer getPaginas() {
        return paginas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Livros)) return false;
        Livros livros = (Livros) o;
        return getNome().equals(livros.getNome()) && getPaginas().equals(livros.getPaginas());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getPaginas());
    }

    @Override
    public String toString() {
        return "Livros{" +
                "nome='" + nome + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}

class ComparatorNome implements Comparator<Map.Entry<String, Livros>>{

    @Override
    public  int compare(Map.Entry<String, Livros>  l1, Map.Entry<String,Livros> l2){
        return l1.getValue().getNome().compareTo(l2.getValue().getNome());
    }

}
