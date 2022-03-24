public class Funcionario1 {
    private String nome;
    private float vencimento;

    private static final String NOME_POR_OMISSAO = "sem nome";
    private static final float VENC_POR_OMISSAO = 500;

    public Funcionario1() throws ExcecaoAlfabetoEspaco, ExcecaoSalarioNegativo {
        setNome(NOME_POR_OMISSAO);
        setVencimento(VENC_POR_OMISSAO);
    }
    public Funcionario1(String nome, float vencimento) throws ExcecaoAlfabetoEspaco, ExcecaoSalarioNegativo {
        setNome(nome);
        setVencimento(vencimento);
    }
    public String getNome() {
        return nome;

    }
    public void setNome(String nome) throws ExcecaoAlfabetoEspaco{
        char c;
        for(int i=0;i<nome.length();i++){
            c = nome.charAt(i);
            if (Character.isLetter(c)== false && Character.isSpaceChar(c)== false)
                throw new ExcecaoAlfabetoEspaco("O " + nome +" tem caracteres que não são letras");
        }
        this.nome = nome;
    }
    public float getVencimento() {
        return vencimento;
    }
    public void setVencimento(float vencimento) throws ExcecaoSalarioNegativo {
        if(vencimento<=0)
            throw new ExcecaoSalarioNegativo(String.format("O %s é desconcertante e por isso não têm salário",nome));
        else
            this.vencimento=vencimento;
    }
    public String toString() {
        return nome + " tem o vencimento de " + vencimento;
    }
}