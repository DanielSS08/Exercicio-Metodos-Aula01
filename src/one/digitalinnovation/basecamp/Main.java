package one.digitalinnovation.basecamp;

public class Main {

    public static void main(String[] args) {

        System.out.println("Exercício Calculadora:");

        Calculadora.soma(5,8);
        Calculadora.subtracao(10,1.3);
        Calculadora.multiplicacao(9,7);
        Calculadora.divisao(5,2);

        System.out.println("Exercício Mensagem:");

        Mensagem.obterMensagem(8);
        Mensagem.obterMensagem(13);
        Mensagem.obterMensagem(19);

        System.out.println("Exercício empréstimo:");

        Emprestimo.calcular(3000,2);
        Emprestimo.calcular(15000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1500, 6);

    }
}
