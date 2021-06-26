package n4;

public class Quadrado extends FiguraGeometrica {

     //Construtor
    public Quadrado(double base, double altura) {
        super(base, altura);
    }
    
    //Métodos
    @Override
    public double calculaArea(){
        double area = this.base * this.altura;
        return area;
    }
    
    @Override
    public double calculaPerimetro(){
        double perimetro = 4 * base;
        return perimetro;
    }
}
