package uaslp.objetos.figuras;

public class Triangulo {
    private double base;
    private double altura;

    public Triangulo(double base, double altura){

    }

    public double getBase(){
        return base;
    }

    public double getAltura(){
        return altura;
    }

    public void setBase(double base){
        this.base = base;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }


    public double getArea(){
        return base*altura;
    }
}
