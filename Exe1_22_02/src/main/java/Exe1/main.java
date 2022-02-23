package Exe1;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        double DespesaEscola=0;
        ArrayList<Pessoa> escola= new ArrayList<>();
        escola.add(new Professor("Duarte",19023291,"Assistente"));
        escola.add(new Professor("Manel",19042129,"Coordenador"));
        escola.add(new Professor("Toze",18872329,"Supervisor"));
        escola.add(new Aluno("Duarte",190232219,1998232455));
        escola.add(new Aluno("Martim",19022139,1998888855));
        escola.add(new AlunoBolsa("Joao",18822329,1998232455,600));
        escola.add(new AlunoBolsa("Jorge",10042329,1998232455,3600));
        for (Pessoa x:escola) {
            if (x.getClass().getSimpleName().equalsIgnoreCase("Professor"))
            System.out.printf("O %s %s é %s\n",x.getClass().getSimpleName(),x.getNome(), ((Professor) x).getCat());
        }
        for (Pessoa x:escola) {
            if (x.getClass().getSimpleName().equalsIgnoreCase("Aluno"))
                System.out.printf("Numero Mecanografico do Aluno %s é : %d \n",x.getNome(),((Aluno) x).getnMecano());
        }
        for (Pessoa x:escola) {
                System.out.printf("%s é %s\n",x.getNome(),x.getClass().getSimpleName());
        }
        for (Pessoa x:escola) {
            if (x.getClass().getSimpleName().equalsIgnoreCase("Professor")) {
                System.out.printf("%s recebe ao fim do mes %.2f Eur\n", x.getNome(), ((Professor) x).calcPagMensal());
                DespesaEscola += ((PagamentoMensal) x).calcPagMensal();}
        }
        for (Pessoa x:escola) {
            if (x.getClass().getSimpleName().equalsIgnoreCase("AlunoBolsa")) {
                System.out.print(x);
                DespesaEscola += ((PagamentoMensal) x).calcPagMensal();}
        }
        System.out.printf("A Escola tera um custo no mes currente de %.2f Eur",DespesaEscola);
    }
}
