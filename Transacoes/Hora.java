package Transacoes;

import java.util.Scanner;

public class Hora {

    private int hora;
    private int minuto;

    public Hora() {
    }

    public Hora(int hora, int minuto) {
        this.hora = hora;
        this.minuto = minuto;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public void setHora() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o Hora da Transação: ");
        setHora(Integer.parseInt(scan.nextLine()));
        System.out.println("Informe o Minuto da Transação: ");
        setMinuto(Integer.parseInt(scan.nextLine()));
    }

    public void printHora() {
        System.out.println("Hora da Transação: " + getHora() + "h " + getMinuto() + "min");
    }

}
