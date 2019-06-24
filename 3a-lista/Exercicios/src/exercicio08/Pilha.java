package exercicio08;

import java.util.Random;
import java.util.Stack;


public class Pilha {
    static Stack pilha = new Stack();
    static Random numAleatorio = new Random();
    static int num;
    
    public static void main(String[] args) {
        new Thread(produtor).start();
        new Thread(consumidor).start();
    }
    
    public static int getNum() {
        return num = numAleatorio.nextInt(1001);
    }
    
    private static final Runnable produtor = new Runnable() {
        @Override
        public void run() {
            for (int i=0; i<1000; i++) {
                if (pilha.size() < 1000) {
                    pilha.push(getNum());
                }
            }
        }
    };
    
    private static Runnable consumidor = new Runnable() {
        @Override
        public void run() {
            for (int i=0; i<1000; i++) {
                if (!pilha.empty())
                    System.out.println("Consumidor pop: " + pilha.pop());
            }
        }
    };
    
}
