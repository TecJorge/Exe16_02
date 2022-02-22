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
            if (x instanceof Professor)
            System.out.print(x);
        }
        for (Pessoa x:escola) {
            if (x instanceof Aluno && !(x instanceof AlunoBolsa))
                System.out.printf("Numero Mecanografico do Aluno : %d \n",((Aluno) x).getnMecano());
        }
        for (Pessoa x:escola) {
                System.out.print(x);
        }
        for (Pessoa x:escola) {
            if (x instanceof Professor)
                System.out.printf("%s recebe ao fim do mes %.2f Eur\n",x,((Professor) x).calcPagMensal());
        }
        for (Pessoa x:escola) {
            if (x instanceof AlunoBolsa)
                System.out.print(x);
        }
        for (Pessoa x:escola) {
            if(((PagamentoMensal) x).calcPagMensal()!=0)
                System.out.printf("%s\n%s\n%.2f Eur\n",x.getClass().getSimpleName(),x.getNome(),((PagamentoMensal) x).calcPagMensal());
                DespesaEscola+=((PagamentoMensal) x).calcPagMensal();
        }
        System.out.printf("A Escola tera um custo no mes currente de %.2f Eur",DespesaEscola);
    }
}
