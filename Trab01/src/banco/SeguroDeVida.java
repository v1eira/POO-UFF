package banco;

/**
 * SegurodeVida
 */
public class SeguroDeVida implements Tributavel{
    private int apolice;
    private final double valor;
    private final Cliente titular;

    public SeguroDeVida(Cliente titular, int apolice, double valor) {
        this.titular = titular;
        this.setApolice(apolice);
        this.valor = valor;
    }

    /**
     * @return the apolice
     */
    public int getApolice() {
        return apolice;
    }

    /**
     * @param apolice the apolice to set
     */
    public final void setApolice(int apolice) {
        this.apolice = apolice;
    }

    @Override
    public String getTipo() {
        return "Seguro de Vida";
    }

    //faixa fixa de R$500 + 2% do valor do seguro
    @Override
    public double getValorImposto() {
        return 500 + this.valor * 0.02;
    }

    @Override
    public String getTitular() {
        return this.titular.toString();
    }
}