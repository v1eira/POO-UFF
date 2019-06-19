package exercicio1;

public class Exercicio1 {

    public static void main(String[] args) {
        Quadrado qd = new Quadrado();
        qd.setTamanhoLado(4);
        System.out.println("Área do quadrado: " + qd.area() + "\n");
        
        Retangulo rt = new Retangulo();
        rt.setAltura(5);
        rt.setComprimento(10);
        System.out.println("Área do retângulo: " + rt.area() + "\n");
        
        Triangulo tr = new Triangulo();
        tr.setLadoA(3);
        tr.setLadoB(4);
        tr.setLadoC(5);
        System.out.println("Área do triângulo: " + tr.area() + "\n");
        
        Circulo ci = new Circulo();
        ci.setRaio(10);
        System.out.println("Área do círculo: " + ci.area() + "\n");
        
    }
    
}
