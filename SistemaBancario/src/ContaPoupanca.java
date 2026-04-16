class ContaPoupanca extends Conta {


    @Override
    public double calcularRendimento(){
        double rendimento = 1.05;
        double v = getSaldo() * rendimento;
        return getSaldo() - v;

    }



}
