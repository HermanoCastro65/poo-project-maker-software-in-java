package Transacoes;

import java.util.Scanner;

public class Data {

    private Hora hora = new Hora();
    private int dia;
    private int mes;
    private int ano;

    public Data() {
    }

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public Hora getHora() {
        return hora;
    }

    public void setHora(Hora hora) {
        this.hora = hora;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setData() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o Dia da Transação: ");
        setDia(Integer.parseInt(scan.nextLine()));
        System.out.println("Informe o Mês da Transação: ");
        setMes(Integer.parseInt(scan.nextLine()));
        System.out.println("Informe o Ano da Transação: ");
        setAno(Integer.parseInt(scan.nextLine()));
        hora.setHora();
    }

    public void printData() {
        System.out.println("Data da Transação: " + getDia() + "/" + getMes() + " de " + getAno());
        hora.printHora();
    }

    @Override
    public String toString() {
        return this.dia + "/" + this.mes + "/" + this.ano;
    }
}
