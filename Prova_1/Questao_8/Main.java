package Prova_1.Questao_8;

public class Main {
    public static void main(String[] args) {
        ListaEncadeada lista1 = new ListaEncadeada();
        ListaEncadeada lista2 = new ListaEncadeada();

        // Adicionando elementos à lista1
        lista1.addFinal(1);
        lista1.addFinal(2);
        lista1.addFinal(3);
        lista1.addFinal(4);

        // Adicionando elementos à lista2
        lista2.addFinal(5);
        lista2.addFinal(6);
        lista2.addFinal(7);
        lista2.addFinal(8);

        // Concatenando lista2 à lista1
        lista1.concat(lista2);

        // Imprimindo a lista resultante
        No atual = lista1.getInicio();
        while (atual != null) {
            System.out.print(atual.getElement() + " ");
            atual = atual.getProximo();
        }
        System.out.println();
    
    }
}
