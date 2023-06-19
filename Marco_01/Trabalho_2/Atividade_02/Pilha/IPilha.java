package Trabalho_2.Atividade_02.Pilha;

import Trabalho_2.Atividade_02.Aluno.Aluno;

public interface IPilha {
    public boolean push(Aluno info);

    public Aluno pop();

    public Aluno top();

    public boolean isEmpty();

    public int size();

    public void imprimirPilha();
}
