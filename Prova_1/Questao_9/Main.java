package Prova_1.Questao_9;

public class Main {
    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();
        lista.addInicio(5);
        lista.addInicio(3);
        lista.addInicio(8);
        lista.addInicio(1);

        System.out.println("Lista antes da ordenação: ");
        lista.imprimirLista();

        lista.bubbleSort();

        System.out.println("Lista após a ordenação: ");
        lista.imprimirLista();
    }
}
