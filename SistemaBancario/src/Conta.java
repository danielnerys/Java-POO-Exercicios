abstract class Conta{
    private int numero;
    private double saldo;

    public void depositar(double valorDeposito){
        if(valorDeposito > 0){
            saldo+=valorDeposito;
        }else{
            System.out.println("Valor não pode ser zero!");
        }
    }

    public void sacar(double valorSaque){
        saldo -= valorSaque;
    }

    public void setSaldo(double valor){
        saldo = valor;
    }

    public double getSaldo(){
        return saldo;
    }

    public abstract double calcularRendimento();
}
