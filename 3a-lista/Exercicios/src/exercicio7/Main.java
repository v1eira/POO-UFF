package exercicio7;


public class Main {
    
    public static void main(String[] args) {
        Avaliacao ava = new Avaliacao();
        
        ava.setNomeAluno("Joao");
        ava.setDisciplina("Math");
        
        ava.registrarNota(8.0);
        ava.registrarNota(9.5);
        ava.registrarNota(10.0);
        ava.registrarNota(9.25);
        
        System.out.println(ava.calcularMedia());
        
    }
}
