package processodasaladeemergenciarefatorado;

public class Main {

    public static void main(String[] args) {
        Enfermeira enfermeira = new Enfermeira(1, "Maria", "Departamento 01", true);
        Medico medico = new Medico(1, "Joao", "Departamento 03", true);
        
        ProcessoDaSalaDeEmergenciaRefatorado.chamarEmpregado(enfermeira);
        enfermeira.checarSinaisVitais();
        enfermeira.coletarSangue();
        enfermeira.higenizarPaciente();
        
        ProcessoDaSalaDeEmergenciaRefatorado.chamarEmpregado(medico);
        medico.fornecerDiagnostico();
        medico.prescreverMedicamento();
        
    }
    
}
