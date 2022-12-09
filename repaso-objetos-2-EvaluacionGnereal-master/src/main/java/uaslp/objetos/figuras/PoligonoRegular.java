package uaslp.objetos.figuras;

public class PoligonoRegular {
    private double lado;
    private int numLados;


    public PoligonoRegular(int numLados){

    }

    public double getLado(){
        return lado;
    }

    public void setLado(double lado){
        this.lado = lado;
    }

    public double getArea(){
        return (lado*numLados)/2;
    }
}
