package n2;

public class Animal {
    
    //Atributos
    protected String nome;
    protected float peso;

    //Construtor
    public Animal(String nome, float peso) {
        this.nome = nome;
        this.peso = peso;
    }

    //Métodos
    public void fazerExercicio() {
        this.peso--;
    }

    public void emitirSom() {
        System.out.println("aaaarrrghhhhhh");
    }

    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
}
