import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Quadro q1 = new Quadro(1517,"Leonardo da Vinci","Mona Dos Lisos");
        Quadro q2 = new Quadro(1889,"Vincent van Gogh","Ja não há Estrelas no Céu");
        Quadro q3 = new Quadro(1989,"Vincente Vai Goma","Sou um Dumbo Holandes");
        Quadro q4 = new Quadro(2009,"Cristina Ferreira","Esta CERTOOOOOOOOOOOOO!");
        Quadro q5 = new Quadro(2019,"Tania Laranjeiro","Ressaca Jornalistica");
        Quadro q6 = new Quadro(2022,"Marcelo Rebelo Sousa","Eu e o Sol do Algarve");
        ArrayList<Quadro>t1=new ArrayList<>();
        System.out.println(t1.add(q1));
        System.out.println(t1.add(q2));
        t1.add(q3);
        listar(t1);
        ArrayList<Quadro>t2=new ArrayList<>();
        t2.add(q3);
        t2.add(q4);
        t2.add(q5);
        ArrayList<Quadro>t3=new ArrayList<>();
        t3.add(q1);
        t3.add(q3);
        t3.add(q5);
        t3.add(q6);
        exposicao e1 =new exposicao("Desastres",2010,t1);
        exposicao e2 =new exposicao("Desastres 2º Edição",2015,t2);
        exposicao e3 =new exposicao("Desastres 3º Edição",2020,t3);
        ArrayList<Object> todo=new ArrayList<>();
        todo.add(e1);
        todo.add(e2);
        todo.add(e3);
        listar(todo);
        q3.setDesignacao("Comeram-me a Orelha");
        listar(todo);
        Collections.sort(todo,Collections.reverseOrder());
        System.out.println(e3.RemoverQuadro(q3));
        System.out.println(e1);
    }
    public static void listar(List a){
        System.out.println(a);
    }
}
