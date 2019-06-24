package exercicio02;

public class Agenda {
    private Pessoa[] pessoas = new Pessoa[10];
    
    public void armazenaPessoa(String nome, int idade, float altura) {
        Pessoa novaPessoa = new Pessoa();
        novaPessoa.setNome(nome);
        novaPessoa.setIdade(idade);
        novaPessoa.setAltura(altura);
        
        int add = 0;
        
        for (int i=0; i<pessoas.length ; i++) {
            if (pessoas[i] == null) {
                pessoas[i] = novaPessoa;
                add = 1;
                break;
            }
        }
        
        if (add == 0) {
            System.out.println("Não foi possível armazenar a pessoa. Agenda cheia!");
        }
    }
    
    public void removePessoa(String nome) {
        int remove = 0;
        
        for (int i=0; i<pessoas.length; i++) {
            if (pessoas[i] != null && pessoas[i].nome.equals(nome)) {
                pessoas[i] = null;
                remove = 1;
            }
        }
        
        if (remove == 0) {
            System.out.println("Não existe pessoa com este nome na agenda.");
        }
    }
    
    public int buscaPessoa(String nome) {
        for (int i=0; i<pessoas.length; i++) {
            if (pessoas[i].nome.equals(nome))
                return i;
        }
        
        return -1;
    }
    
    public void imprimeAgenda() {
        for (int i=0; i<pessoas.length; i++) {
            if (pessoas[i] != null)
                System.out.println(pessoas[i].nome + ", " + pessoas[i].idade + ", " + pessoas[i].altura);
        }
    }
    
    public void imprimePessoa(int index) {
        if (index >=0 && index <= 9 && pessoas[index] != null) {
            System.out.println(pessoas[index].nome + ", " + pessoas[index].idade + ", " + pessoas[index].altura);
        } 
    }
}
