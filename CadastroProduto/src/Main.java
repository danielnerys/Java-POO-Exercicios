import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();

        Livro hp = new Livro("Harry Potter", 209);
        Eletronico iphone = new Eletronico("Iphone", 700);
        Alimento arroz = new Alimento("Arroz", 288);


        produtos.add(hp);
        produtos.add(iphone);
        produtos.add(arroz);


        for(Produto p : produtos){
            System.out.println();
            System.out.printf("Nome: %s | preco: %.2f | com desconto: %.2f | Categoria: %s", p.getNome(), p.getPreco(), p.calcularDesconto(), p.getCategoria());
        }


    }
}
