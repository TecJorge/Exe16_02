
import java.util.Random;


public class Jogada {
    private PTT ptt;
    private static final PTT ptt_Default = PTT.PAPEL;
    public enum PTT {PEDRA,PAPEL,TESOURA}
    Jogada(PTT ptt){
        this.ptt=ptt;
    }
    Jogada(){
        this.ptt=ptt_Default;
    }
    public PTT getPtt() {
        return ptt;
    }

    public void setPtt(PTT ptt) {
        this.ptt = ptt;
    }

    @Override
    public String toString() {
       return String.format("\nescolheu %s\n",ptt.name());
    }
    public static int Ronda (Jogada x1 , Jogada x2){
        int valor1,valor2;
        //valor1 = Jogador
        valor1=x1.ptt.ordinal();
        valor2=x2.ptt.ordinal();
        //Pedra jogador 1
        if (valor1==valor2)
            return 0;
        else if (valor1==0&&valor2==2)
            return  1;
        else if(valor1==0&&valor2==1)
            return 2;
        else if(valor1==1&&valor2==0)
            return 1;
        else if(valor1==1&&valor2==2)
            return 2;
        else if (valor1==2&&valor1==1)
            return 1;
        else
            return 2;
    }
    public static PTT getRandomPTT() {
        Random random = new Random();
        return PTT.values()[random.nextInt(PTT.values().length-1)];
    }
}
