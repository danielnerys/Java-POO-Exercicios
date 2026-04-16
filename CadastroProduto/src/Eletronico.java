public class Eletronico extends Produto{
    private final String categoria = "Eletronico";

    public Eletronico(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularDesconto() {
        double desconto = getPreco() *0.05;
        return getPreco() - desconto;
    }

    public String getCategoria(){
        return categoria;
    }
}
