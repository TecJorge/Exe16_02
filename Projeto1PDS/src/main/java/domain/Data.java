package domain;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Date;

public class Data {
    private int dia, ano;
    private int mes;
    private DayOfWeek diaSemana;
    private static final DayOfWeek diaSemanaDefault = DayOfWeek.FRIDAY;
    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public Data(DayOfWeek diaSemana) {
        this.diaSemana = diaSemana;
    }

    public Data() {
        this.diaSemana = diaSemanaDefault;
    }

    public DayOfWeek getDiaSemana() {
        return diaSemana;
    }

    public int getDia() {
        return dia;
    }

    public int getAno() {
        return ano;
    }

    public int getMes() {
        return mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setDiaSemana(DayOfWeek diaSemana) {
        this.diaSemana = diaSemana;
    }
    public DayOfWeek setDiaSemanaFromString(String diaSemana){
        return this.diaSemana=StringToDayOfWeek(diaSemana);
    }

    @Override
    public String toString() {
        return String.format("%d-%d-%d", dia, mes, ano);
    }

    public String sDiaSemana() {
        return diaSemana.getDisplayName(TextStyle.FULL_STANDALONE, new Locale(System.getProperty("user.country.format")));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Data date = (Data) o;
        return dia == date.dia && mes == date.mes && ano == date.ano;
    }
    private String diaSemana(Date d1) {
        DayOfWeek diaSemana;
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String inputStartDateString = dia + "-" + mes + "-" + ano;
        LocalDateTime startDate = LocalDateTime.parse(inputStartDateString, df);
        diaSemana = startDate.getDayOfWeek();
        return diaSemana.toString();
    }
    public String getsDiaSemana(){
        String sMes= String.valueOf(Month.values()[this.mes-1]);
        LocalDate dt=LocalDate.of(ano,Month.valueOf(sMes),dia);

        return DayOfWeek.from(dt).toString();
    }
    private DayOfWeek StringToDayOfWeek(String dayofweek){
        DayOfWeek diaSemana;

        diaSemana=DayOfWeek.valueOf(dayofweek);

        return diaSemana;
    }
}

