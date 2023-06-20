package Trabalho_2.Atividade_01;

public class Main {
   public static void main(String[] args) {
    Pilha pilha = new Pilha();

    pilha.push("a");
    pilha.push("b");
    pilha.push("a");
    pilha.push("b");
    pilha.push("b");

    pilha.imprimirPilha();

    System.out.println(pilha.palindromo());
   }
}
