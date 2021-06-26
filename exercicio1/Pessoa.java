package exercicio1;

public class Pessoa {
    
    //Atributos
    protected String nome;
    protected int cpf;
    
    //Construtor
    public Pessoa(String nome, int cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
    
    //Métodos
    public void fala(){}
    
    public void perfil(){}
    
    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    
}
