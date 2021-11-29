package Transacoes;

import java.util.Scanner;
import e.commerce.Enum;

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
        try {
            System.out.println("Informe o Hora da Transação: ");
            setHora(Integer.parseInt(scan.nextLine()));
            System.out.println("Informe o Minuto da Transação: ");
            setMinuto(Integer.parseInt(scan.nextLine()));
        } catch (Exception e) {
            System.out.println(Enum.ERRO + e + Enum.DIGITE_EXPRESSAO_VALIDA);
            setHora();
        }
    }

    public void printHora() {
        System.out.println("Hora da Transação: " + getHora() + "h " + getMinuto() + "min");
    }

}
