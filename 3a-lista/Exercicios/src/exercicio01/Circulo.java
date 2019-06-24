package exercicio01;

public class Circulo implements CalculoArea {
    
    private int raio;

    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }

    @Override
    public double area() {
        double area;
        area = (Math.PI * Math.pow(raio, 2));
        
        return area;
    }
    
}
