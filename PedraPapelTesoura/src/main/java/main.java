import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int jogada,count1=0,count2=0;
        String nome,x;
        Scanner ler= new Scanner(System.in);
        System.out.println("Vamos Jogar ao Pedra Papel Tesoura a melhor de 3\n");
        System.out.println("Introduza o Seu nome");
        nome= ler.nextLine();
        System.out.println("Introduza a sua jogada \n");
        x=ler.nextLine();
        x=x.toUpperCase(Locale.ROOT);
        Jogada player=new Jogada(Jogada.PTT.valueOf(x));
        Jogada pc=new Jogada(Jogada.PTT.valueOf(Jogada.getRandomPTT().name()));
        while(count1<3&&count2<3){
            System.out.printf("\n%s:%s vs PC:%s\n",nome,player,pc);
            jogada=Jogada.Ronda(player,pc);
            if (jogada==1)
                count1++;
            else if (jogada==2)
                count2++;
            System.out.println("Introduza a sua jogada \n");
            x=ler.nextLine();
            x=x.toUpperCase(Locale.ROOT);
            player.setPtt(Jogada.PTT.valueOf(x));
            pc.setPtt(Jogada.PTT.valueOf(Jogada.getRandomPTT().name()));
            System.out.printf("\nJogador %d vs Pc %d\n",count1,count2);
        }
        if (count1==3)
            System.out.printf("\nParabéns !! %s Ganhou\n",nome);
        else if (count2==3)
            System.out.printf("\nInfelizmente Perdeu :c Tente Novamente!\n");



    }
}
