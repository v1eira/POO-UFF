package exercicio02;

public class Exercicio2 {
    
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        
        agenda.armazenaPessoa("Gabriel", 26, (float) 1.82);
        agenda.armazenaPessoa("Joao", 18, (float) 1.75);
        agenda.imprimeAgenda();
        System.out.println(agenda.buscaPessoa("Joao"));
        agenda.removePessoa("Joao");
        agenda.imprimePessoa(0);
        
    }
}
