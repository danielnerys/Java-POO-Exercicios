import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Conta conta = null;

        System.out.println("Numero conta: ");
        int numeroConta = sc.nextInt();
        System.out.println("1 - Conta corrente ");
        System.out.println("2 - Conta poupança");
        System.out.println("Tipo Conta: ");
        int tipoConta = sc.nextInt();
        switch (tipoConta) {
            case 1:
                conta =  new ContaCorrente();
                break;
            case 2:
                conta = new ContaPoupanca();
                break;
        }

        boolean continuarRodando = true;
        do{
            System.out.println("Menu");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Ver Saldo");
            System.out.println("4 - Ver rendimentos");
            System.out.println("5 - Sair");
            int opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Valor: ");
                    double valor = sc.nextDouble();
                    conta.depositar(valor);
                    break;
                case 2:
                    System.out.println("Valor de saque: ");
                    double valorSaque = sc.nextDouble();
                    conta.sacar(valorSaque);
                    System.out.println(conta.getSaldo());
                    break;
                case 3:
                    System.out.println("Saldo: " + conta.getSaldo());
                    break;
                case 4:
                    System.out.println("Rendimentos: " + conta.calcularRendimento());
                    break;
            }
        }while(continuarRodando);
    sc.close();
    }
}
