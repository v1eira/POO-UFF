package exercicio04;


public class Main {
    
    public static void main(String[] args) {
        Televisao televisao = new Televisao();
        ControleRemoto controle = new ControleRemoto();
        
        televisao.setCanal(501);
        televisao.setVolume(15);
        
        controle.aumentarCanal(televisao);
        controle.aumentarCanal(televisao);
        controle.aumentarCanal(televisao);
        controle.aumentarCanal(televisao);
        controle.aumentarCanal(televisao);
        
        controle.aumentarVolume(televisao);
        controle.aumentarVolume(televisao);
        controle.aumentarVolume(televisao);
        controle.aumentarVolume(televisao);
        controle.aumentarVolume(televisao);
        controle.aumentarVolume(televisao);
        controle.aumentarVolume(televisao);
        controle.aumentarVolume(televisao);
        controle.aumentarVolume(televisao);
        controle.aumentarVolume(televisao);
        
        controle.diminuirVolume(televisao);
        controle.diminuirVolume(televisao);
        controle.diminuirVolume(televisao);
        controle.diminuirVolume(televisao);
        controle.diminuirVolume(televisao);
        
        controle.consultarVolume(televisao);
        controle.consultarCanal(televisao);
        
        controle.diminuirCanal(televisao);
        controle.diminuirCanal(televisao);
        controle.diminuirCanal(televisao);
        
        controle.consultarCanal(televisao);
        
        controle.trocarCanal(televisao, 560);
        controle.consultarCanal(televisao);
    }

}
