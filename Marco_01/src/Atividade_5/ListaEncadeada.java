package Atividade_5;

public class ListaEncadeada{
    
    private No inicio;
    private No ultimo;
    private int tamanho;

    
    public ListaEncadeada(){
        this.inicio = null;
        this.ultimo = null;
    }

  
    public void addInicio(int element){
        No celula = new No(element);
        if(inicio == null){
            inicio = celula;
            ultimo = celula;
        } else {
            celula.setProximo(inicio);
            inicio.setAnterior(celula);
            inicio = celula;
        }     
    }


    public void addFinal(int element){
        No celula = new No(element);
        if(ultimo == null){
            inicio = celula;
            ultimo = celula;

        } else{
            celula.setAnterior(ultimo);
            ultimo.setProximo(celula);
            ultimo = celula;
        }
    }

 
    public boolean remove(int element) {
        No p = consultarElement(element);

        if (p == null) {
            return false;
        }

        if (p == inicio) {
            inicio = p.getProximo();

            if (inicio != null) {
                inicio.setAnterior(null);
            } else {
                ultimo = null;
            }

        } else if (p.getProximo() == null) {
            p.getAnterior().setProximo(null);
            ultimo = p.getAnterior();
        } else {
            p.getAnterior().setProximo(p.getProximo());
            p.getProximo().setAnterior(p.getAnterior());
        }
        return true;
    }

  
    public No consultarElement(int element) {
        No p = inicio;

        while (p != null && p.getElement() == element); {
            p = p.getProximo();
        }

        return p;
    }

 
    public String getListaInicio() {
        String lista = "";

        for (No i = inicio; i != null; i = i.getProximo()) {
            lista += i.getElement() + " ";
        }

        return lista;
    }

  
    public String getListaFim() {
        String lista = "";

        for (No i = ultimo; i != null; i = i.getAnterior()) {
            lista += i.getElement() + " ";
        }

        return lista;
    }

    public void imprimirLista(){
        No atual = inicio;

        while(atual != null){
            System.out.println(atual.getElement() + " ");
            atual = atual.getProximo();
        }
        System.out.println();
    }
    

    public int getTamanho(){
        return this.tamanho;
    }

    

}