package exercicio06;

import java.util.ArrayList;
import java.util.Random;


public class Main {
    
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        ArrayList<Integer> listaOrdenada = new ArrayList<>();
        
        Random num = new Random();
        
        for (int i = 0; i < 100; i++) {
            lista.add(num.nextInt(201));
            listaOrdenada.add(lista.get(i));
        }
        
        for (int i = 0; i < listaOrdenada.size(); i++) {
            int menor = listaOrdenada.get(i);
            int pos = i;
            
            for (int j = i; j < listaOrdenada.size(); j++) {
                if (listaOrdenada.get(j) < menor) {
                    menor = listaOrdenada.get(j);
                    pos = j;
                }
            }
            
            int cache = listaOrdenada.get(i);
            listaOrdenada.set(i, menor);
            listaOrdenada.set(pos, cache);
        }
        
        for (int i : listaOrdenada)
            System.out.println(i);
        
}

}
