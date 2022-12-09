package uaslp.objetos.figuras;

public class Cuadrado {
    private double lado;
    private double area;

    public Cuadrado(double lado){

    }

    public double getLado(){
        return lado;
    }

    public void setLado(double lado){
        this.lado = lado;
    }

    public double getArea(){
        return lado*lado;
    }


}
