public class main {
    public static void main(String[] args) {
        Ponto p1 = new Ponto("Zacarias",3.4,7.6);
        Ponto p2 = new Ponto("ZeManuel",5.5,8.9);
        System.out.println(p1);
        System.out.println(p2);
        SegmentoDeReta a =new SegmentoDeReta(p1,p2);
        System.out.printf("\nO Comprimento do segmento é de %.2f",a.Comprimento());
        System.out.printf("\nO Declive do Segmento é de %.2f",a.Declive());
        a.Deslocar();
        System.out.println(p1);
        System.out.println(p2);

    }
}
