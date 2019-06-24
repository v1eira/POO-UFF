package exercicio09;

import java.util.ArrayList;


public class Main {
    
    static ArrayList<String> pedidos;
    static Caixa cx = new Caixa();
    static Cozinha cz = new Cozinha();
    
    public static void main(String[] args) {
        new Thread(t1).start();
        new Thread(t2).start();
    }
    
    private static final Runnable t1 = new Runnable() {
        @Override
        public void run() {
            for (int i=0; i<100; i++)
                cx.criarPedido(pedidos);
        }
    };
    
    private static final Runnable t2 = new Runnable() {
        @Override
        public void run() {
            for (int i=0; i<100; i++)
                cz.retirarPedido(pedidos);
        }
    };
}
