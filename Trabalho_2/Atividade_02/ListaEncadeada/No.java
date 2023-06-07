package Trabalho_2.Atividade_02.ListaEncadeada;

import Trabalho_2.Atividade_02.Aluno.Aluno;

public class No {
    private Aluno element; 
    private No proximo;

    
    public No(Aluno element) {
        this.element = element;
        this.proximo = null;
    }

    public No(Aluno element, No proximo) {
        this.element = element;
        this.proximo = proximo;
    }

    public Aluno getElement() {
        return element;
    }
    public void setElement(Aluno element) {
        this.element = element;
    }
    public No getProximo() {
        return proximo;
    }
    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString() {
        return "No [element=" + element + ", proximo=" + proximo + "]";
    }

    public Object getInfo() {
        return null;
    }

    
    
}







