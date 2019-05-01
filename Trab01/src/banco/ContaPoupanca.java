package banco;

/**
 * ContaPoupanca
 */
public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente titular, int numero, String agencia, String dataAbertura) {
        super(titular, numero, agencia, dataAbertura);
    }   
    
    @Override
    public String getTipo() {
        return "Conta Poupanca";
    }

    @Override
    public double calcularRendimento(int periodo) {
        return (Math.pow(1.07, periodo) - 1);
    }

    @Override
    public double calcularTributacao(int periodo) {
        return 0;
    }

}