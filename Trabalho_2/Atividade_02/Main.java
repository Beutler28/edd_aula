package Trabalho_2.Atividade_02;
import Trabalho_2.Atividade_02.Aluno.Aluno;
import Trabalho_2.Atividade_02.ListaEncadeada.ListaEncadeada;


public class Main {
    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();

        Aluno aluno = new Aluno("Carlos", 18, 15);
        Aluno aluno1 = new Aluno("Antoni", 18, 15);
        Aluno aluno2 = new Aluno("Manoel", 18, 15);

        lista.addInicio(aluno);
        lista.addInicio(aluno1);
        lista.addInicio(aluno2);

        System.out.println(lista.imprimirLista());




    }
}
