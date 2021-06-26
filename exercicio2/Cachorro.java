package exercicio2;

public class Cachorro extends Animal {

    //Construtor
    public Cachorro(String nome, float peso) {
        super(nome, peso);
    }

    //Métodos
    @Override
    public void emitirSom() {
        System.out.println("Au Au");
    }
}
