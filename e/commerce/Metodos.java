package e.commerce;

import java.util.ArrayList;

public class Metodos {

    public Metodos() {
    }

    public static <Obj> void alterar(ArrayList<Obj> arr, int index, Obj obj) {
        arr.set(index - 1, obj);
    }

    public static void deletar(ArrayList<?> arr, int index) {
        arr.remove(index - 1);
    }

}
