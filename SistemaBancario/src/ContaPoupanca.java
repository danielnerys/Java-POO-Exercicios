class ContaPoupanca extends Conta {


    @Override
    public double calcularRendimento(){
        return super.getSaldo() * 0.05;

    }

    @Override
    public  double getSaldo(){
        return super.getSaldo() + calcularRendimento();
    }



}
