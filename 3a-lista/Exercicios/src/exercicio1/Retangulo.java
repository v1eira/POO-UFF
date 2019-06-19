package exercicio1;

public class Retangulo implements CalculoArea {
    
    private int comprimento;
    private int altura;

    public int getComprimento() {
        return comprimento;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public float area() {
        float area;
        area = comprimento * altura;
        
        return area;
    }
    
}
