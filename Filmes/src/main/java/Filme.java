import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;

public class Filme {
    //Um filme é descrito por um título, ano de realização, realizador e categoria. O ano de realização deve
    //ser posterior a 1850 e não posterior ao ano atual. Deverão ser criadas classes de exceção para
    //validação do ano de realização e da categoria: AnoInvalidoException e CategoriaInvalidaException,
    //respetivamente.

    private String titulo;
    private Realizador realizador;
    private int ano;
    private  Cat cat;
    private final String tituloDefault="Indefinido";
    private final int anoDefault=0;
    private final Cat catDefault=Cat.ACAO;
    public enum Cat {COMEDIA,ACAO,TERROR,DRAMA,ANIMACAO}

    Filme(String titulo,Realizador realizador,int ano,Cat cat) throws AnoInvalidoException,CategoriaInvalidaException {
        setAno(ano);
        this.titulo=titulo;
        this.realizador=realizador;
        setCat(cat);
    }
    Filme(){
        this.ano=anoDefault;
        this.titulo=tituloDefault;
        this.cat=catDefault;
    }
    Filme(Filme o){
        this.ano=o.ano;
        this.cat=o.cat;
        this.titulo=o.titulo;
        this.realizador=o.realizador;
    }

    public int getAno() {
        return ano;
    }

    public Cat getCat() {
        return cat;
    }

    public Realizador getRealizador() {
        return realizador;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setAno(int ano) throws AnoInvalidoException {
        if(ano<=1850 && ano> Data.dataAtual().getAno())
            throw new AnoInvalidoException("Ano inválido");
        this.ano = ano;
    }

    public void setCat(Cat cat) throws CategoriaInvalidaException{
        boolean flag = false;

        for (Cat x :Cat.values()) {
            if( x.name().matches(cat.name().toUpperCase(Locale.ROOT)))
            flag=true;

        }
        if (!flag)
            throw new CategoriaInvalidaException("Categoria Invalida");
        this.cat = Cat.valueOf(cat.name().toUpperCase(Locale.ROOT));
    }

    public void setRealizador(Realizador realizador) {
        this.realizador = realizador;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
    return  String.format("\nTitulo: %s ,\n Ano: %d \n Categoria: %s\n\nRealizador: %s",titulo,ano,cat,realizador);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Filme filme = (Filme) o;
        return ano == filme.ano && anoDefault == filme.anoDefault && Objects.equals(titulo, filme.titulo) && Objects.equals(realizador, filme.realizador) && cat == filme.cat && Objects.equals(tituloDefault, filme.tituloDefault) && catDefault == filme.catDefault;
    }

}
