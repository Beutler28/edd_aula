package Prova_1.Questao_5;

public class Main {

    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();
        lista.addFinal(1);
        lista.addFinal(2);
        lista.addFinal(3);
        lista.addInicio(4);

        System.out.println("Número de pares: "+lista.nroPares());
    }
    
}
