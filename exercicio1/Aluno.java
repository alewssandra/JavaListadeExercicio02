package exercicio1;

public class Aluno extends Pessoa {

    private int matricula;
    private double bolsa;

    //Construtor
    public Aluno(String nome, int cpf, int matricula, double bolsa) {
        super(nome, cpf);
        this.matricula = matricula;
        this.bolsa = bolsa;
    }

    //Métodos
    @Override
    public void fala() {
        System.out.println("Professor, não entendi");
    }

    @Override
    public void perfil() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Cpf: " + this.cpf);
        System.out.println("Matricula: " + this.matricula);
        System.out.println("Bolsa: " + this.bolsa + "\n");
    }

    //Getters e Setters
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getBolsa() {
        return bolsa;
    }

    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }
}
