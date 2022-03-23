public class PPT {
    private Jogada jogada;
    public enum Jogada{PEDRA,PAPEL,TESOURA};
    public PTT(jogada ptt) {
        this.jogada = ptt;
    }

    public jogada getJogada() {
        return jogada;
    }

    public void setJogada(jogada jogada) {
        this.jogada = jogada;
    }

    @Override
    public String toString() {
        return String.format("\nO Jogador escolheu s%\n",this.jogada);
    }
    public int partida(PTT ptt1,PTT ptt2)
}
