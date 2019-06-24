package exercicio03;


public class Elevador {
    int andarAtual;
    int totalAndaresPredio;
    int capacidade;
    int qtdPessoas;

    public Elevador inicializa(Elevador elevador, int totalAndaresPredio, int capacidade) {
        this.andarAtual = 0;
        this.totalAndaresPredio = totalAndaresPredio;
        this.capacidade = capacidade;
        this.qtdPessoas = 0;
        
        return elevador;
    }
    
    public void entra() {
        if (this.qtdPessoas < this.capacidade)
            this.qtdPessoas++;
        else
            System.out.println("Elevador cheio.");
    }
    
    public void sai() {
        if (this.qtdPessoas > 0)
            this.qtdPessoas--;
        else
            System.out.println("Elevador vazio.");
    }
    
    public void sobe() {
        if (this.andarAtual < this.totalAndaresPredio)
            this.andarAtual++;
        else
            System.out.println("Elevador já está no último andar.");
    }
    
    public void desce() {
        if (this.andarAtual > 0)
            this.andarAtual--;
        else
            System.out.println("Elevador já está no térreo.");
    }
    
    
    
    
}
