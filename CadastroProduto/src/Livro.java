public class Livro extends Produto{
    private final String categoria = "Livro";

    public Livro(String nome, double preco){
        super(nome, preco);

    }
    @Override
    public double calcularDesconto() {
        double desconto = getPreco() *0.10;
        return getPreco() - desconto;

    }

    public String getCategoria(){
        return categoria;
    }


}
