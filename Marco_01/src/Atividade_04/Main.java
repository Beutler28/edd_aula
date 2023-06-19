package Atividade_04;
public class Main {
    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();

        Item item1 = new Item(20, "Pilha", 3);
        Item item2 = new Item(40, "Bola", 5);

        lista.addInicio(item1);
       
        
        lista.imprimirLista();
     
        lista.addInicio(item2);
    
        lista.imprimirLista();

        System.out.println("Tamanho atual da lista: " + lista.getTamanho());
    }
}
