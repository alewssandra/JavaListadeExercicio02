package exercicio4;

public class Triangulo extends FiguraGeometrica {

    //Construtor
    public Triangulo(double base, double altura) {
        super(base, altura);
    }

    //Métodos
    @Override
    public double calculaArea() {
        double area = (this.base * this.altura) / 2;
        return area;
    }

    @Override
    public double calculaPerimetro() {
        double perimetro = 3 * base;
        return perimetro;
    }
}
