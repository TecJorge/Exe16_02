import java.util.Scanner;

public class main {
    public static void main(String[] args) throws Exception {
        String s;
        int x;
        boolean flag=false;
        Realizador r1 = new Realizador("Pascoal","Portuguesa",1970,01,10);
        Realizador r2 = new Realizador("Olivier","Francês",1970,01,10);
        Filme f1 = new Filme ("JonyPistols",r1,2010, Filme.Cat.DRAMA);
        Filme f2 = new Filme ("ElQuartetitoFantastic",r1,2015, Filme.Cat.ACAO);
        Filme f3 = new Filme ("ElPincho",r1,2020, Filme.Cat.ACAO);
        Filme f4 = new Filme ("JuanPistols",r2,2010, Filme.Cat.DRAMA);
        Filme f5 = new Filme ("CeLaVie",r2,2015, Filme.Cat.ACAO);
        Filme f6 = new Filme ("Garçon",r2,2020, Filme.Cat.ANIMACAO);
        Filme f7=new Filme();
        f7.setRealizador(r2);
        Scanner ler = new Scanner(System.in);
        System.out.println("Introduza o nome do filme\n");
        s=ler.nextLine();
        f7.setTitulo(s);

        while(flag==false) {
            try {
                System.out.println("Introduza a categoria do filme\n");
                s = ler.nextLine();
                f7.setCat(Filme.Cat.valueOf(s));
                flag = true;
            } catch (CategoriaInvalidaException e) {
                System.out.println(e.getMessage());
                ler.nextLine();
            }
        }
        flag=false;
        while(flag==false){
            try {
                System.out.println("Introduza o ano do filme\n");
                x=ler.nextInt();
                f7.setAno(x);
                flag=true;
            }catch (AnoInvalidoException e ){
                System.out.println(e.getMessage());
                ler.nextLine();
            }
        }
        flag=false;
        System.out.println(f1);
        ListaFIlmes l1 = new ListaFIlmes();
        ListaFIlmes l2 = new ListaFIlmes();
        while(flag==false){
            try {
                System.out.println("Introduza o ID da Lista\n");
                s=ler.nextLine();
                l1.setId(s);
                flag=true;
            }catch (IdentificadorInvalidoException e ){
                System.out.println(e.getMessage());
                ler.nextLine();
            }
        }
        l1.addFilme(f1);
        l1.addFilme(f2);
        l1.addFilme(f3);
        l2.addFilme(f4);
        l2.addFilme(f5);
        l2.addFilme(f6);
        l2.addFilme(f7);

    }
}
