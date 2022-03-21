public class Ponto {
    private double y,x;
    private String nome;
    private static double y_default,x_default=0;
    private static String nome_default="Indefinido";
    public Ponto(String nome,double x,double y){
        this.y=y;
        this.x=x;
        this.nome=nome;
    }
    public Ponto(){
        this.y=y_default;
        this.x=x_default;
        this.nome=nome_default;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("O Ponto %s tem como coordenadas : X= %.2f , Y= %.2f",nome,x,y);
    }
    public void MoverPonto(double newx,double newy){
        this.setX(newx);
        this.setY(newy);
    }
    public void Moverx(double newx){
        this.setX(getX()+newx);
    }
    public void Movery(double newy){
        this.setY(getY()+newy);
    }
}
