package Atividade_02;

public class Main {

    public static void main(String[] args) {
        ABB abb = new ABB();

        abb.add(10);
        abb.add(5);
        abb.add(15);
        abb.add(3);
        abb.add(7);
        abb.add(12);
        abb.add(20);

        System.out.println("Árvore em ordem: " + abb.emOrdem());

        int elementoBusca = 12;
        if (abb.contains(elementoBusca)) {
            System.out.println("O elemento " + elementoBusca + " está na árvore.");
        } else {
            System.out.println("O elemento " + elementoBusca + " não está na árvore.");
        }

        elementoBusca = 8;
        if (abb.contains(elementoBusca)) {
            System.out.println("O elemento " + elementoBusca + " está na árvore.");
        } else {
            System.out.println("O elemento " + elementoBusca + " não está na árvore.");
        }

        int elementoRemocao = 5;
        No noRemovido = abb.remove(elementoRemocao);
        if (noRemovido != null) {
            System.out.println("Elemento " + elementoRemocao + " removido da árvore.");
        } else {
            System.out.println("Elemento " + elementoRemocao + " não encontrado na árvore.");
        }

        System.out.println("Árvore em ordem após remoção: " + abb.emOrdem());
    }
}
