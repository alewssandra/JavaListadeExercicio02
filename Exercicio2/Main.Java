package exercicio2;

public class Main {

    public static void main(String[] args) {
        //Criação dos objetos.
        Animal a = new Animal("Nevasca", 20f);
        Animal gato1 = new Gato("Nica", 15);
        Animal cachorro1 = new Cachorro("Jake", 80);

        //Utilização dos métodos.
        a.emitirSom();
        a.fazerExercicio();

        gato1.emitirSom();
        gato1.fazerExercicio();

        cachorro1.emitirSom();
        cachorro1.fazerExercicio();

    }
}
