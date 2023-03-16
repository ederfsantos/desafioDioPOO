package desafio.dominio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Mentoria extends Conteudo {
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");//formatador de data para localDate
    private int cargaHoraria;
    private LocalDate data;

    public Mentoria(){}

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }



    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return String.format("%s\nCarga Horaria = %d\nData = %s",super.toString(),this.getCargaHoraria(),data.format(dtf));
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }
}
