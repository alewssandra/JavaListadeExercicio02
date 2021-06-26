package n1;

public class Professor extends Pessoa {

    //Atributos
    private int siape;
    private double salario;

    //Construtor
    public Professor(String nome, int cpf, int siape, double salario) {
        super(nome, cpf);
        this.siape = siape;
        this.salario = salario;
    }

    //Métodos
    @Override
    public void fala() {
        System.out.println("Alguma dúvida?");
    }

    @Override
    public void perfil() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Cpf: " + this.cpf);
        System.out.println("Siape: " + this.siape);
        System.out.println("Salario: " + this.salario + "\n");
    }

    //Getters e Setters
    public int getSiape() {
        return siape;
    }

    public void setSiape(int siape) {
        this.siape = siape;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
