package Trabalho_2.Atividade_02.ListaEncadeada;

import Trabalho_2.Atividade_02.Aluno.Aluno;
import Trabalho_2.Atividade_02.ListaEncadeada.ListaEncadeada;

public class ListaEncadeada implements IListaEncadeada {

    private No inicio;
    private No ultimo;

    public ListaEncadeada() {
        this.inicio = null;
    }

    @Override
    public void addInicio(Aluno element) {
        No celula = new No(element);
        if (this.inicio == null) {
            this.inicio = celula;
        } else {
            celula.setProximo(this.inicio);
            this.inicio = celula;
        }

    }

    @Override
    public void addFinal(Aluno element) {
        No celula = new No(element);
        if (inicio == null) {
            this.inicio = celula;
        } else {
            ultimo = null; 
            for (No i = inicio; i != null; i = i.getProximo()) {
                ultimo = i;
            }
            ultimo.setProximo(celula);
        }
    }

    @Override
    public boolean isEmpty() {
        return inicio == null;
    }

    @Override
    public boolean remove(Aluno element) {

        No anterior = null;
        No atual = inicio;

        while (atual != null && !atual.getElement().equals(element)) {
            anterior = atual;
            atual = atual.getProximo();
        }

        if (atual == null) {
            return false;
        }

        if (anterior == null) {
            inicio = atual.getProximo();
        } else {
            anterior.setProximo(atual.getProximo());
        }

        return true;
    }

    @Override
    public void inverterLista() {
        if (inicio == null || inicio.getProximo() == null) {
            return;
        }

        No anterior = null;
        No atual = inicio;
        No proximo = atual.getProximo();

        while (atual != null) {
            atual.setProximo(anterior);
            anterior = atual;
            atual = proximo;
            if (proximo != null) {
                proximo = proximo.getProximo();
            }
        }
        ultimo = inicio;
        inicio = anterior;
    }

    @Override
    public String imprimirLista() {

        String lista = "";

        for (No i = inicio; i != null; i = i.getProximo()) {
            lista += i.getElement() + " ";
        }

        return lista;
    }

}
