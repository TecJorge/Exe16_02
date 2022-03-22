import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<Integer>n1=new ArrayList<>();
        n1.add(939999999);
        n1.add(929999999);
        Contato c1=new Contato("Henrique","aeiou@exemplo.pt",n1,"Familia");
        Contato c2 =new Contato("José","jose@exemplo.pt",new ArrayList<>());
        c2.addNum(220000000);
        ListaTelefonica l1=new ListaTelefonica("marretas",new ArrayList<Contato>());
        l1.novoContatojaCriado(c1);
        l1.novoContatojaCriado(c2);
        l1.novoContato("Manuel","manuel@exemplo.pt",new ArrayList<>(),"Familia");
        l1.novoContato("Antonio","tonydorock@exemplo.pt",new ArrayList<>(),"Amigo");
        l1.getList().get(2).addNum(933333333);
        l1.getList().get(3).addNum(928888888);
        l1.novoContato("JonyPistols","JonyElPistolero@exemplo.pt",new ArrayList<>(),"Nabo");
        l1.getList().get(4).addNum(977777777);
        l1.novoContato("FlavioGravatas","Matei_o_HarryComUmaTabua@exemplo.pt",new ArrayList<>(),"Psyco");
        l1.getList().get(5).addNum(966666666);
        System.out.println(l1);
        l1.mostrarUmaCategoria("Psyco");
        l1.mostrarUmaCategoria("Nabo");
    }
}
