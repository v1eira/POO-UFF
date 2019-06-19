package exercicio1;

public class Circulo implements CalculoArea {
    
    private int raio;

    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }

    @Override
    public float area() {
        float area;
        area = (float) (Math.PI * Math.pow(raio, 2));
        
        return area;
    }
    
}
