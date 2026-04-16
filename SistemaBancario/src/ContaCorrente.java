class ContaCorrente extends Conta {

    private double taxa = 2.00;

    @Override
    public void sacar(double valorSaque) {
        double valorFinal = valorSaque + taxa;
        if (valorFinal > getSaldo()) {
            System.out.println("Saldo indísponivel!");
        } else {
            setSaldo(getSaldo() - valorFinal);
        }
    }
}

