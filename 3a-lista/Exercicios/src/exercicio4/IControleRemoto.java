package exercicio4;

public interface IControleRemoto {
    
    public void aumentarVolume(Televisao televisao);
    public void diminuirVolume(Televisao televisao);
    public void aumentarCanal(Televisao televisao);
    public void diminuirCanal(Televisao televisao);
    public void trocarCanal(Televisao televisao, int canal);
    public void consultarVolume(Televisao televisao);
    public void consultarCanal(Televisao televisao);
    
}
