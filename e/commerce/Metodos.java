package e.commerce;

import java.util.ArrayList;
import java.util.Arrays;

public class Metodos {

    public Metodos() {
    }

    public static void alterar(ArrayList arr, int index, Object obj) {
        arr.set(index - 1, obj);
    }

    public static void deletar(ArrayList arr, int index) {
        arr.remove(index - 1);
    }

}
