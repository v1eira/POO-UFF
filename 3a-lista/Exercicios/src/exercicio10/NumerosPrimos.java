package exercicio10;

import java.util.Scanner;


public class NumerosPrimos {
    
    static Scanner scan = new Scanner(System.in);
    static int n;
    static int numPrimos;
    
    private static boolean ehPrimo(int numero) {
        for (int j = 2; j < numero; j++) {
            if (numero % j == 0)
                return false;   
        }
        return true;
    }
    
    public static void main(String[] args) {
        new Thread(entrada).start();
        new Thread(saida).start();
    }
    
    private static final Runnable entrada = new Runnable() {
        @Override
        public void run() {
            for (int i=0; i<10; i++)
                n = scan.nextInt();
        }
    };
    
    private static Runnable saida = new Runnable() {
        @Override
        public void run() {
            int quantidade = 0;
            
            for (int i = 2; i <= n; i++) {
                if( ehPrimo(i) )
                    quantidade++;
            }
            
            System.out.println("Número de primos que existem entre 0 e " + n + ": " + quantidade);
        }
    };

}
