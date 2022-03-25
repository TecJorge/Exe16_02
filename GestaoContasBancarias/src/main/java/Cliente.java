import java.sql.Array;
import java.util.Arrays;
import java.util.Objects;

public class Cliente {
    private int nif;
    private String nome;
    private Tipo tipo;
    private String email;
    private Telefone telefone;
    private final static int nifDefault=100000;
    private final static String nomeDefault="Indefinido";
    private final static String emailDefault="Indefinido";
    private final static Tipo tipoDefault=Tipo.PS;


    public enum Tipo {
        PS {
            @Override
            public String toString() {
                return "Pessoa Singular";
            }
        }, PC {
            @Override
            public String toString() {
                return "Pessoa Colectiva";
            }
        }
    }

    Cliente(String nome1, int nif, int indice,int numer, String email, Tipo tipo) throws NomeCurtoException, NifInvalidoException, CategoriaInvalidaException, NumerInvalidoException {
        this.email = email;
        setTipo(tipo);
        this.telefone = new Telefone(numer,indice);
        setNif(nif);
        setnome(nome1);
    }

    Cliente() {
        this.nif=nifDefault;
        this.tipo=tipoDefault;
        this.telefone=new Telefone();
        this.nome=nomeDefault;
        this.email=emailDefault;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setnome(String x) throws NomeCurtoException {
        String[] obj;
        char[]obj1;
        obj = x.split(" ");
        if (obj.length - 1 < 2)
            throw new NomeCurtoException("Deve pelo menos introduzir 2 nomes");
        for (String y : obj) {
            char[]chars;
            if (y.length() < 2)
                throw new NomeCurtoException("o nome" + y + "tem menos que dois caracteres");
            chars=y.toCharArray();
            int count =0;
            for (int i = 0; i <chars.length-1 ; i++) {
                if (Character.isLetter(chars[i]))
                    count++;
            }
            if (count<2)
                throw new NomeCurtoException("Nome com Menos de Duas Letras");
        }
        this.nome = x;
    }

    public void setNif(int nif) throws NifInvalidoException {
        Character temp;
        temp = String.valueOf(nif).charAt(0);
        if (nif > 999999999)
            throw new NifInvalidoException("O Nif só pode conter 9 digitos");
        else {
            if (this.tipo == Tipo.PS) {
                if (Integer.valueOf(temp) == 1 || Integer.valueOf(temp) == 2)
                    this.nif = nif;
                else
                    throw new NifInvalidoException("O Nif de Pessoa Singular deve começar por 1 ou 2");
            } else {
                if (Arrays.asList(5, 6, 8, 9).contains(Integer.valueOf(temp)))
                    this.nif = nif;
                else
                    throw new NifInvalidoException("O NIF de Pessoa Colectiva deve começar por 5,6,8 ou 9");
            }
        }
    }

    public void setTelefone(int num,int ind) throws NumerInvalidoException {
        this.telefone = new Telefone(num,ind);
    }

    public void setTipo(Tipo nome) throws CategoriaInvalidaException {
        boolean flag=false;

        for (Tipo x :Tipo.values()) {
            if (nome.name().equalsIgnoreCase(x.name()));
            flag=true;
        }
        if (flag)
        this.tipo =nome;
        else
            throw new CategoriaInvalidaException("A Pessoa apenas pode ser Singular ou Colectiva");
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public int getNif() {
        return nif;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public Tipo getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return String.format("Cliente: %s \n Nif:%d\n Tipo: %s \n Email:%s \n Telefone :%s",nome,nif,tipo,email,telefone);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return nif == cliente.nif && Objects.equals(nome, cliente.nome) && tipo == cliente.tipo && Objects.equals(email, cliente.email) && Objects.equals(telefone, cliente.telefone);
    }

}
