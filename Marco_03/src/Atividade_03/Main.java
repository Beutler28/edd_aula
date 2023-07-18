package Atividade_03;

public class Main {

    public static void main(String[] args) {
        AVL avl = new AVL();


        avl.add(51);
        avl.add(57);
        avl.add(98);
        avl.add(19);
        avl.add(11);
        avl.add(45);
        avl.add(79);

        System.out.println("Árvore AVL em ordem: " + avl.emOrdem());

        // Teste de busca
        int elementoBusca = 12;
        if (avl.contains(elementoBusca)) {
            System.out.println("O elemento " + elementoBusca + " está na árvore AVL.");
        } else {
            System.out.println("O elemento " + elementoBusca + " não está na árvore AVL.");
        }

        elementoBusca = 98;
        if (avl.contains(elementoBusca)) {
            System.out.println("O elemento " + elementoBusca + " está na árvore AVL.");
        } else {
            System.out.println("O elemento " + elementoBusca + " não está na árvore AVL.");
        }
    }
}
