public class Alimento extends Produto {
    private final String categoria = "Alimento";


    public Alimento(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularDesconto() {
        double desconto = getPreco() * 0.02;
        return getPreco() - desconto;
    }

    public String getCategoria(){
        return categoria;
    }
}
