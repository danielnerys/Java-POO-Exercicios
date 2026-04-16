public class Aluno extends Pessoa {
    private int matricula;



    public Aluno(String nome, int idade, int matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

    public void setMatricula(int matricula){
        this.matricula = matricula;
    }

    public int getMatricula(){
        return this.matricula;
    }

    @Override
    public void apresentar() {
        System.out.printf("Sou o aluno %s | Tenho: %s anos | Matricula: %s", getNome(), getIdade(), getMatricula());

    }
}
