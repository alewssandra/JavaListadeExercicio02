package exercicio3;

public class Poupança extends Conta {

    //Construtor
    public Poupança(String titular, int numero, double saldo) {
        super(titular, numero, saldo);
    }
    
    //Métodos
    @Override
    public void calculaRendimento(){
        this.rendimento = this.saldo * 0.05;
    }
}
