package exercicio03;

public class Exercicio3 {
    
    public static void main(String[] args) {
        Elevador el = new Elevador();
        
        el.inicializa(el, 10, 5);
        
        el.entra();
        el.entra();
        el.entra();
        el.entra();        
        el.entra();
        el.entra();
        
        el.sobe();
        el.sobe();
        el.sobe();
        el.sobe();
        el.sobe();
        el.sobe();
        el.sobe();
        
        el.sai();
        el.sai();
        
        el.desce();
        el.desce();
        el.desce();
        el.desce();
        el.desce();
        el.desce();
        el.desce();
        el.desce();
        
        System.out.println(el.qtdPessoas);
        System.out.println(el.andarAtual);
        
    }
}
