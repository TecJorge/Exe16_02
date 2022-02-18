package Exe1;

public abstract class Contador {
    private String nome;
    private String ID;
    private int consumoForaVazio;
    private final static String nome_DEFAULT = "SemNome";
    private final static String id_DEFAULT = "SemNome";
    private final static int consumoForaVazio_DEFAULT = 0;

    Contador(String nome, String ID, int consumoForaVazio) {
        this.nome = nome;
        this.ID = ID;
        this.consumoForaVazio = consumoForaVazio;
    }

    Contador(String nome, String ID) {
        this.nome = nome;
        this.ID = ID;
        consumoForaVazio = consumoForaVazio_DEFAULT;
    }

    Contador(String nome, int consumoForaVazio) {
        this.nome = nome;
        this.consumoForaVazio = consumoForaVazio;
        ID = id_DEFAULT;
    }
    Contador(String ID) {
        nome = nome_DEFAULT;
        consumoForaVazio = consumoForaVazio_DEFAULT;
        this.ID=ID;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setConsumoForaVazio(int consumoForaVazio) {
        this.consumoForaVazio = consumoForaVazio;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public int getConsumoForaVazio() {
        return consumoForaVazio;
    }

    public String getID() {
        return ID;
    }

    public String toString() {
        return  String.format("O Cliente %s",nome);

    }

    public abstract double calcConsumo();
}