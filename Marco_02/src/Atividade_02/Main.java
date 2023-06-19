package Atividade_02;

public class Main {
    public static void main(String[] args) {
        FilaLista aluno = new FilaLista();

        aluno.add("Carlos");
        aluno.add("João");

        System.out.println(aluno.size());

        aluno.remove("João");

        System.out.println(aluno.size());
    }
}
