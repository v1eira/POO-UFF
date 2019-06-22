package exercicio4;


public class ControleRemoto implements IControleRemoto {

    @Override
    public void aumentarVolume(Televisao televisao) {
        televisao.volume++;
    }

    @Override
    public void diminuirVolume(Televisao televisao) {
        televisao.volume--;
    }

    @Override
    public void aumentarCanal(Televisao televisao) {
        televisao.canal++;
    }

    @Override
    public void diminuirCanal(Televisao televisao) {
        televisao.canal--;
    }

    @Override
    public void trocarCanal(Televisao televisao, int canal) {
        televisao.canal = canal;
    }

    @Override
    public void consultarVolume(Televisao televisao) {
        System.out.println(televisao.volume);
    }

    @Override
    public void consultarCanal(Televisao televisao) {
        System.out.println(televisao.canal);
    }

}
