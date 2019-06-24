package exercicio07;

import java.util.ArrayList;


public class Avaliacao {
    String nomeAluno;
    String disciplina;
    ArrayList<Double> notas;

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public ArrayList<Double> getNotas() {
        return notas;
    }
    
    public void registrarNota(double nota) {
        try {
            this.notas.add(nota);
        } catch (Exception e) {
            System.out.println("Não foi possível registrar a nota.");
        }
    }
    
    public double calcularMedia() {
        double media = 0;
        
        try {
            for (double i : this.notas)
                media += i;

            media = media/this.notas.size();
        } catch (Exception e) {
            media = -1;
            System.out.println("Não foi possível obter a média das notas.");
        }
        
        return media;
    }
}
