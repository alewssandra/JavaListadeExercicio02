package exercicio3;

public class Conta {
 //Atributos
    protected String titular;
    protected int numero;
    protected double saldo, rendimento;

    //Construtor
    public Conta(String titular, int numero, double saldo) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;
    }

    //Métodos
    public void sacar(float valor){
        if(valor <= this.saldo){
            this.saldo = this.saldo - valor;
        }
        else{
            System.out.println("Você não possui saldo suficiente!");
        }
    }
    
    public void depositar(float valor){
        this.saldo = this.saldo + valor;
    }
    
    public void imprimeRecibo(){
        System.out.println("Número da Conta: " + this.numero);
        System.out.println("Titular: " + this.titular);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Rendimento: " + this.rendimento + "\n");
    }
    
    public void calculaRendimento(){}
    
    //Getters e Setters
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getRendimento() {
        return rendimento;
    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }
}
