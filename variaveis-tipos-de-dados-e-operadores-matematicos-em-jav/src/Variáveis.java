

// Classe de exemplo para o exercicio da Aula q de Variáveis, tipos, Tipos de Dados e operadores aritméticos.

public class Variáveis {
    public static void main(String[] args) {

        int i;
        // int i; 'Não pode ter variaveis com mesmo nome'
        int I;
        // int 1a; 'Variaveis não podem começar com numero'
        int _1a;
        int $aq;

        i = 5;
        I = 10;
        _1a = 20;
        $aq = 7;

        final int j = 10;
        // j = 15; 'quando tem um final o valor da variavel nao pode ser mudado'
        int asrn24678md;
        // int asrn246 78md; 'Nao pode ter espaço '
        int asrn2$4678_md = 10;
        // int asrn2$46%78_md =10 'Caracteres especias nao funcionam'
        int asrn25678md = 100;

        int quantidadeProduto = 50;
        // int QuantidadeProduto; 'Nao comçar com letra maiuscula'
        final int NUMEROS_TENTATIVAS = 5;
        // final int numeroTentativas = 5; 'Para final sempre tudo em letra maiscula'
        // int QUANTIDADE_OPCOES = 25; 'So final fica com letra maiuscula'
        int qtdProd;

        System.out.println(i);
        System.out.println(I);
        System.out.println(_1a);
        System.out.println($aq);

        System.out.println(j);
        System.out.println(asrn2$4678_md);
        System.out.println(asrn25678md);

        System.out.println(quantidadeProduto);
        System.out.println(NUMEROS_TENTATIVAS);

    }

}
