package exercicio09;

import java.util.ArrayList;
import java.util.Scanner;


public class Caixa {
    
    public void criarPedido(ArrayList<String> pedidos) {
        if (pedidos.size() < 20) {
            //Scanner scan = new Scanner(System.in);
            //String pedido = scan.nextLine();
            
            String lista[] = {"X-burger", "X-bacon", "X-frango", "X-egg", "X-file", "X-tudo"};
            int i = (int)Math.round(Math.random() * 5);
            String pedido = lista[i];
            
            System.out.println(pedido);
            
            pedidos.add(pedido);
            System.out.println("Cria pedido: " + pedido);
        }
        else {
            System.out.println("Lista de pedidos cheia!");
        }
    }
    
}
