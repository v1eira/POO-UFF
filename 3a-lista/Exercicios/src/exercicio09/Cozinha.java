package exercicio09;

import java.util.ArrayList;


public class Cozinha {
    
    public void retirarPedido(ArrayList<String> pedidos) {
        if (pedidos.size() > 0) {
            String pedido = pedidos.get(0);
            int quantidade = 0;
            
            for (int i=0; i<pedidos.size(); i++) {
                if (pedidos.get(i).equals(pedido)) {
                    pedidos.remove(i);
                    quantidade++;
                }
            }
            
            fazPrato(pedido, quantidade);
        }
        else {
            System.out.println("Não é possível retirar nenhum pedido.");
        }
    }
    
    public void fazPrato(String nome, int quantidade) {
        System.out.println("Prato produzido: " + nome + " | " + "Quantidade: " + quantidade);
    }
}
