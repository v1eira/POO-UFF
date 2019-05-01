package banco;

import java.util.ArrayList;

/**
 * Cliente
 */
public class Cliente implements Ativos{

    private final String primeiroNome;
    private final String ultimoNome;
    private final String cpf;

    public Cliente(String primeiroNome, String ultimoNome, String cpf) {
        this.primeiroNome = primeiroNome;
        this.ultimoNome = ultimoNome;
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Nome:" + this.primeiroNome + " " + this.ultimoNome + " | CPF:" + this.cpf;
    }

    @Override
    public void ativos(ContaCorrente contaC, ContaPoupanca contaP, SeguroDeVida seguroV) {
        ArrayList ativos = new ArrayList();
        ativos.add(0, contaC);
        ativos.add(1, contaP);
        ativos.add(2, seguroV);
        
        ativos.forEach((Object ativo) -> {
            if(ativo instanceof Tributavel){
                System.out.println(((Tributavel) ativo).getTipo() + ": Imposto devido: " + ((Tributavel) ativo).getValorImposto());
            } else {
                System.out.println(((Conta) ativo).getTipo() + ": Ativo não tributável.");
            }
        });
    }
}