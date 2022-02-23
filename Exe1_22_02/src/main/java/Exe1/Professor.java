package Exe1;

public class Professor extends Pessoa implements PagamentoMensal{
    String Cat;
    String Cat_Default="Indefinido";
    private static int SalarioBase=1500;
    private static int TaxASsist=0;
    private static int TaxCorden=50;
    private static int TaxSuper=20;

    Professor(String Nome ,int id,String Cat){
        super(Nome,id);
        this.Cat=Cat;
    }
    Professor(){
        super();
        Cat=Cat_Default;
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public int getiDCivil() {
        return super.getiDCivil();
    }

    public String getCat() {
        return Cat;
    }

    @Override
    public void setiDCivil(int iDCivil) {
        super.setiDCivil(iDCivil);
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    public void setCat(String cat) {
        Cat = cat;
    }

    @Override
    public String toString() {
       return String.format("%s com Categoria %s\n ",super.toString(),Cat);
    }
    public double calcMajoracao() {

        return ((this.getCat().equalsIgnoreCase("Assistente")?((TaxASsist==0)?TaxASsist:(SalarioBase*TaxASsist)/100):(this.getCat().equalsIgnoreCase("Coordenador")?(SalarioBase*TaxCorden)/100:(this.getCat().equalsIgnoreCase("Supervisor")?(SalarioBase*TaxSuper)/100:0))));
    }

    @Override
    public double calcPagMensal() {
        return SalarioBase+calcMajoracao();
    }

    public static void setSalarioBase(int salarioBase) {
        SalarioBase = salarioBase;
    }

    public static void setTaxASsist(int taxASsist) {
        TaxASsist = taxASsist;
    }

    public static void setTaxCorden(int taxCorden) {
        TaxCorden = taxCorden;
    }

    public static void setTaxSuper(int taxSuper) {
        TaxSuper = taxSuper;
    }

    public static int getTaxASsist() {
        return TaxASsist;
    }

    public static int getTaxCorden() {
        return TaxCorden;
    }

    public static int getTaxSuper() {
        return TaxSuper;
    }
}
