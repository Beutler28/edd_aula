public class Main {
    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();
        lista.addFinal(1);
        lista.addFinal(2);
        lista.addFinal(3);
        System.out.println(lista.inicio());
     

        lista.addInicio(4);
        System.out.println(lista.inicio());

        System.out.println("Tamanho atual da lista: " + lista.getTamanho());
    }
}
