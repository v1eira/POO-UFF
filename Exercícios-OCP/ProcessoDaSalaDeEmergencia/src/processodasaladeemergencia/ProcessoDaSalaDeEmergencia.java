package processodasaladeemergencia;

public class ProcessoDaSalaDeEmergencia {

    public static void main(String[] args) {
        Enfermeira enfermeira = new Enfermeira(1, "Maria", "Departamento 01", true);
        Medico medico = new Medico(1, "Joao", "Departamento 03", true);
        Atividades atividade = new Atividades();
        
        atividade.chamar(enfermeira);
        atividade.checarSinaisVitais();
        atividade.coletarSangue();
        atividade.higenizarPaciente();
        
        atividade.chamar(medico);
        atividade.fornecerDiagnostico();
        atividade.prescreverMedicamento();
        
    }
    
}
