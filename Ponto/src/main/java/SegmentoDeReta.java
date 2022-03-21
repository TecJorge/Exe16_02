import java.util.Scanner;

public class SegmentoDeReta {
    private Ponto p1,p2;
    public SegmentoDeReta(Ponto p1,Ponto p2){
        this.p1=p1;
        this.p2=p2;
    }
    public SegmentoDeReta(){
        this.p1=new Ponto();
        this.p2=new Ponto();
    }

    public Ponto getP2() {
        return p2;
    }

    public Ponto getP1() {
        return p1;
    }

    public void setP1(Ponto p1) {
        this.p1 = p1;
    }

    public void setP2(Ponto p2) {
        this.p2 = p2;
    }

    @Override
    public String toString() {
        return String.format("\nO Segmento de reta é composto pelos pontos: \n %s e\n %s",p1,p2);
    }
    public double Comprimento(){
            return Math.sqrt( Math.pow(this.p2.getX()-this.p1.getX(), 2) +
                    Math.pow(this.p2.getY()-this.p1.getY(), 2));
    }
    public double Declive(){
        return (this.p2.getX()-this.p1.getX())/(this.p2.getY()-this.p1.getY());
    }
    public void Deslocar(){
        Scanner ler=new Scanner(System.in);
        String eixo;
        int ponto;
        System.out.println("\nQual dos pontos deseja deslocar 1 ou 2 , se pretende deslocar os 2 insira 3\n");
        ponto=ler.nextInt();
        if (ponto==1){
            ler.nextLine();
            System.out.println("\nQual dos eixos deseja deslocar X ou Y , se pretende deslocar os 2 insira Z\n");
            eixo= ler.nextLine();
            if (eixo.equalsIgnoreCase("X")){
                ler.nextLine();
                System.out.println("\nInsira o Valor de X \n");
                p1.Moverx(ler.nextDouble());
            }
            else if (eixo.equalsIgnoreCase("Y")){
                ler.nextLine();
                System.out.println("\nInsira o Valor de Y\n");
                p1.Movery(ler.nextDouble());
            }
            else{
                ler.nextLine();
                System.out.println("\nInsira o valor de X\n");
                p1.Moverx(ler.nextDouble());
                ler.nextLine() ;
                System.out.println("\nInsira o valor de Y\n");
                p1.Movery(ler.nextDouble());
            }
        }
        else if(ponto==2) {
            ler.nextLine();
            System.out.println("\nQual dos eixos deseja deslocar X ou Y , se pretende deslocar os 2 insira Z\n");
            eixo = ler.nextLine();
            if (eixo.equalsIgnoreCase("X")) {
                ler.nextLine();
                System.out.println("\nInsira o Valor de X\n");
                p2.Moverx(ler.nextDouble());
            } else if (eixo.equalsIgnoreCase("Y")) {
                ler.nextLine();
                System.out.println("\nInsira o Valor de Y\n");
                p2.Movery(ler.nextDouble());
            } else {ler.nextLine();
                System.out.println("\nInsira o valor de X\n");
                p2.Moverx(ler.nextDouble());
                ler.nextLine();
                System.out.println("\nInsira o valor de Y\n");
                p2.Movery(ler.nextDouble());
            }
        }
        else {ler.nextLine();
            System.out.println("\nQual dos eixos deseja deslocar X ou Y , se pretende deslocar os 2 insira Z\n");
            eixo = ler.nextLine();
            if (eixo.equalsIgnoreCase("X")) {
                ler.nextLine();
                System.out.println("\nInsira o valor de X do 1º Ponto\n");
                p1.Moverx(ler.nextDouble());
                ler.nextLine();
                System.out.println("\nInsira o valor de X do 2º Ponton\n");
                p2.Moverx(ler.nextDouble());
            } else if (eixo.equalsIgnoreCase("Y")) {
                ler.nextLine();
                System.out.println("\nInsira o valor de Y do 1º Ponto\n");
                p1.Movery(ler.nextDouble());
                ler.nextLine();
                System.out.println("\nInsira o Valor de Y do 2º Ponto\n");
                p2.Movery(ler.nextDouble());
            } else {
                ler.nextLine();
                System.out.println("\nInsira o valor de X do 1º Ponto\n");
                p1.Moverx(ler.nextDouble());
                ler.nextLine();
                System.out.println("\nInsira o valor de Y do 1º Ponto\n");
                p1.Movery(ler.nextDouble());
                ler.nextLine();
                System.out.println("\nInsira o valor de X do 2º Ponto\n");
                p2.Moverx(ler.nextDouble());
                ler.nextLine();
                System.out.println("\nInsira o valor de Y do 2º Ponto\n");
                p2.Movery(ler.nextDouble());
            }

        }
    }
}
