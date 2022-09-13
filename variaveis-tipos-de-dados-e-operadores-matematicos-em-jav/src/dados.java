public class dados {
    public static void main(String[] args) {
        
        // So tem dados primitivos exceto String
        // Quantidade caracterres ou qtd de numeros que um determonado tipo de dado pode aguentar
        //esta eem ordem de menor capaciade(byte) ate o de maior capacidade(doble)

        byte b1 = 10; //so aguneta 3 caracteres
        byte b2 = 20;

        short s1 = 20000;
        // short s2 = 400000; da erropq passou do limite do short

        // int i1 = -10000000000; passou do valor maximo que o int pode suportar
        int i2 = 28500;

        long l1 = 10000000000000000L;
        long l2 = 2004005000500050L;
        // precisa ter um L maiusculo no final caso nao teha, o java pensa que é uma int
        //e diz que o int nao suporta esse grande numero de caracteres ou qtd numeros

        // Todos os valores apresentados até qui são inteiros a diferencia esta na
        // capacidade de numeros
        // que cada tipo de dado pode suportar por exemplo o byte suporta 2 numeros ou 2
        // casa decimais

        // Variaveis reais com numeros fracionados ou com decimais

        // float f1 = 4.5; da erro pq ele pensa que e um doble mas na verdade e um
        // float, é obrigatorio ter um f no final
        float f2 = 10.68F;

        double d1 = 85.69;
        double d2 = 99.04D;

        // Dados textuais

        char c1 = 'W';
        // char c2= 'Tw'; o char so suporta um caractere
        char c3 = '\u0057';
        // Esse valor siginifica o W ou esses caracters representao um por isso ele nao
        // da erro

        // String suportao mais de um caractere
        String st1 = "Coringa";
        String st2 = "Venon";
        String st3 = "Doutor Animal";

        boolean bo1 = true;
        boolean bo2 = false;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(s1);
        System.out.println(i2);
        System.out.println(b1);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(f2);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(c1);
        System.out.println(c3);
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);
        System.out.println(bo1);
        System.out.println(bo2);

    }

}
