package exercicio2;

public class Gato extends Animal {

    //Construtor
    public Gato(String nome, float peso) {
        super(nome, peso);
    }

    //Métodos
    @Override
    public void emitirSom() {
        System.out.println("Miaaaaaaaaaaau");
    }

}
