package exercicio1;

public class Triangulo implements CalculoArea {
    
    private int ladoA;
    private int ladoB;
    private int ladoC;

    public int getLadoA() {
        return ladoA;
    }

    public void setLadoA(int ladoA) {
        this.ladoA = ladoA;
    }

    public int getLadoB() {
        return ladoB;
    }

    public void setLadoB(int ladoB) {
        this.ladoB = ladoB;
    }

    public int getLadoC() {
        return ladoC;
    }

    public void setLadoC(int ladoC) {
        this.ladoC = ladoC;
    }

    @Override
    public double area() {
        int semiperimetro = (ladoA + ladoB + ladoC)/2;
        double area;
        
        area = Math.sqrt((semiperimetro*(semiperimetro - ladoA)*(semiperimetro - ladoB)*(semiperimetro - ladoC)));
        
        return area;
    }
    
}
