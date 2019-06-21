package exercicio1;

public class Quadrado implements CalculoArea {
    
    private int tamanhoLado;

    public int getTamanhoLado() {
        return tamanhoLado;
    }

    public void setTamanhoLado(int tamanhoLado) {
        this.tamanhoLado = tamanhoLado;
    }

    @Override
    public double area() {
        double area;
        area = tamanhoLado * tamanhoLado;
        
        return area;
    }
    
}
