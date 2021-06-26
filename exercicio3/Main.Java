package exercicio3;

public class Main {

    public static void main(String[] args) {
       //Criação dos objetos.
        Corrente c = new Corrente("Mariazinha", 123456, 2000);
        Poupança p = new Poupança("Joãozinho", 54321, 1000);
        
        //Utilização dos métodos.
        c.calculaRendimento();
        c.depositar(1000);
        c.sacar(500);
        c.imprimeRecibo();
        
        p.calculaRendimento();
        p.sacar(5000);
        p.depositar(5000);
        p.imprimeRecibo();
    }
}
