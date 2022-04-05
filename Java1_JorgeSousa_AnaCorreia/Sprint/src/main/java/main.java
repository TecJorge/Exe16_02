import Lojas.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;


public class main {
    public static void main(String[] args) throws FileNotFoundException {
        CentroComercial centro1 = new CentroComercial("Dolce Vita", "Seila", new ArrayList<>());
        File path = new File("Resultados.txt");
        if (path.exists()) {

            centro1.LerFicheiro();
        }else{
        LojaAncora ap1 = new LojaAncora(1, "Bdidas", 90, 10000, 2000);
        LojaAncora ap2 = new LojaAncora(2, "Nike", 190, 160000, 5000);
        LojaAncora ap3 = new LojaAncora(3, "Rebook", 20, 3500, 450);
        LojaAncoraExterna ae1 = new LojaAncoraExterna(4, "Adudas", 15, 2000, 300, 3);
        LojaComumRestauracao r4 = new LojaComumRestauracao(5, "TacoBell", 70, 9000, 18, 10, 10);
        LojaComumRestauracao r2 = new LojaComumRestauracao(5, "MacLeopardo", 70, 8000, 10, 12, 8);
        LojaComumRestauracao r3 = new LojaComumRestauracao(5, "LadoB", 70, 15000, 7, 7, 20);
        LojaComumRestauracao r1 = new LojaComumRestauracao(5, "BBQ", 70, 3000, 3, 15, 3);
        LojaComumQuiosque q2 = new LojaComumQuiosque(9, "Virgil'sKiosk", 15, 9500, 1);
        LojaComumQuiosque q1 = new LojaComumQuiosque(9, "Jogo", 15, 3500, 1);
        LojaComumQuiosque q3 = new LojaComumQuiosque(11, "A bola", 10, 2500, 2);
        centro1.AdicionarLoja(ap1);
        centro1.AdicionarLoja(ap2);
        centro1.AdicionarLoja(ae1);
        centro1.AdicionarLoja(r1);
        centro1.AdicionarLoja(r2);
        centro1.AdicionarLoja(r3);
        centro1.AdicionarLoja(r4);
        centro1.AdicionarLoja(q1);
        centro1.AdicionarLoja(q2);
        centro1.AdicionarLoja(ap3);
        centro1.AdicionarLoja(q3);
        }
        LojaComumRestauracao.setCustoSegurancaPorMesa(7);
        System.out.println("\n### Centro Comercial ###");
        System.out.printf("\nNome centro comercial: %s\n" +
                        "Quantidade de lojas: %d\n" +
                        "Total de rendas das lojas Ancoras: %.2f Euros\n" +
                        "Total de rendas das lojas Comuns: %.2f Euros\n" +
                        "Total dos custos com segurança: %.2f Euros\n" +
                        "Total das receitas do centro comercial: %.2f Euros\n" +
                        "Valor (em percentagem) pago pelas lojas âncora: %.2f %%\n" +
                        "Valor (em percentagem) pago pelas lojas comuns: %.2f %%\n",
                centro1.getNomeCentroC(),
                centro1.nLojas(),
                centro1.totalRendaAncora(),
                centro1.totalRendaLojasComuns(),
                centro1.totalPagarSeguranca(),
                centro1.totalReceitas(),
                centro1.percentualAncora(),
                centro1.percentualComum());
        System.out.println("\nOrdenar as lojas por Ordem Alfabética");
        centro1.ordenarLista();
        for (Loja x : centro1.getLista()) {
            System.out.printf("%s \n Classificada como: %s\n",x,x.classificacaoArea());
        }
        System.out.println("\nOrdenar as lojas por Tipo de Loja e por Area\n");
        centro1.ordenarTipoeArea();
        for (Loja x : centro1.getLista()) {
            System.out.println(x);
        }
        System.out.println("\nRemover Loja Externa Adudas\n");
        centro1.removerLoja(new LojaAncoraExterna(4, "Adudas", 15, 2000, 300, 3));
        for (Loja x : centro1.getLista()) {
            System.out.println(x);
        }
        centro1.CriarFicheiro();
    }
}
