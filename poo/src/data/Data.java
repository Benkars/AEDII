package data;

public class Data {

    private int dia, mes, ano;

    public Data() {
        this.dia = 1;
        this.mes = 1;
        this.ano = 1900;
    }

    public Data(int dia) {
        setDia(dia);
        this.mes = 1;
        this.ano = 1900;
    }

    public Data(int dia, int mes) {
        setDia(dia);
        setMes(mes);
        this.ano = 1900;
    }

    public Data(int dia, int mes, int ano) {
        setDia(dia);
        setMes(mes);
        setAno(ano);
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if (dia > 0 && dia < 32) {
            this.dia = dia;
        } else
            this.dia = 1;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if (mes > 0 && mes < 13) {
            this.mes = mes;
        } else
            this.mes = 1;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (ano > 1900 && ano <= 9999) {
            this.ano = ano;
        } else
            this.ano = 1900;
    }

    public String toString() {
        return "0" + dia + "/" + mes + "/" + ano;
    }
}