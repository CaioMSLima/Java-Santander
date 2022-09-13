public class Criação {
    public static void main(String[] args) {
        
        // Calculadora
        System.out.println("Exercicio calculadora");
        Calculadora.soma(3,6);
        Calculadora.subtracao(11,6.8);
        Calculadora.multiplicacao(31,2);
        Calculadora.divisao(500,2.5);

        // Mensagem
        System.out.println("Exercício mensagem");
        Mensagem.obterMensagm(6);
        Mensagem.obterMensagm(20);
        Mensagem.obterMensagm(16);

        //Emprestimo
        System.out.println("Exercício empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, 3);
        Emprestimo.calcular( 1000, 5);


    }
    
}
