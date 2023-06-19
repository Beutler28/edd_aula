package Trabalho_2.Atividade_02.ListaEncadeada;

import Trabalho_2.Atividade_02.Aluno.Aluno;

public interface IListaEncadeada {
    public void addInicio(Aluno element);
    public void addFinal(Aluno element);
    public boolean isEmpty();
    public boolean remove(Aluno element);
    public void inverterLista();
    public String imprimirLista();
}
