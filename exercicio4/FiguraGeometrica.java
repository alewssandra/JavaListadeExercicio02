package exercicio4;

public class FiguraGeometrica {
    
    //Atributos
    protected double base, altura;

    //Construtor
    public FiguraGeometrica(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    //Métodos
    public double calculaArea(){
        return 0.0;
    }
    
    public double calculaPerimetro(){
        return 0.0;
    }
    
    //Getters e Setters
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
       
}
