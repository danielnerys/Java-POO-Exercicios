import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pessoa> cadastros = new ArrayList<>();

        Aluno daniel = new Aluno("Daniel", 29, 2023);


        Professor guilherme = new Professor("Guilherme", 23, "Backend");


        Diretor longato = new Diretor("Longato", 50, 23);


        cadastros.add(longato);

        cadastros.add(guilherme);

        cadastros.add(daniel);

        System.out.println("==========Pessoas cadastradas==========");
        for(Pessoa p : cadastros){
            System.out.println();
            p.apresentar();
        }
    }
}
