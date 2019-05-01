package banco;

/**
 * ContaCorrente
 */
public class ContaCorrente extends Conta implements Tributavel{

    private Cliente titular;
    public ContaCorrente(Cliente titular, int numero, String agencia, String dataAbertura) {
        super(titular, numero, agencia, dataAbertura);
    }

    /* 1.3 */
    @Override
    public double getValorImposto() {
        return super.getSaldo() * 0.15;
    }
    
    @Override
    public String getTitular() {
        return this.titular.toString();
    }

    @Override
    public String getTipo() {
        return "Conta Corrente";
    }
    /* fim do 1.3 */

    @Override
    public double calcularRendimento(int periodo) {
        return (Math.pow(1.1, periodo) - 1);
    }

    @Override
    public double calcularTributacao(int periodo) {
        return calcularRendimento(periodo) * 0.15;
    }

}