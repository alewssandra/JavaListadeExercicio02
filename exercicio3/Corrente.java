package exercicio3;

public class Corrente extends Conta {
    
    //Construtor
    public Corrente(String titular, int numero, double saldo) {
        super(titular, numero, saldo);
    }
    
    //Métodos
    @Override
    public void calculaRendimento(){
        this.rendimento = this.saldo * 0.01;
    }
    
}
