import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //polimorfismo
        List<String> lista;

        lista = new ArrayList<>();

        //elementos ArrayList
        lista.add("Elemento 1");
        lista.add("Elemento 2");
        lista.add("Elemento 3");

        System.out.println("ArrayList:");
        imprimirLista(lista);

        //implementação para LinkedList (mesma variável lista)
        lista = new LinkedList<>(lista);

        //mais elementos na LinkedList
        lista.add("Elemento 4");
        lista.add("Elemento 5");

        System.out.println("\nLinkedList:");
        imprimirLista(lista);
    }

    //para imprimir os elementos da lista
    public static void imprimirLista(List<String> lista) {
        for (String elemento : lista) {
            System.out.println(elemento);
        }
    }
}