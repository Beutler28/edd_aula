package Prova_1.Questao_5;

public class ListaEncadeada {
    
    private No inicio;
    private No ultimo;

    
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

    public int nroPares(){
        int nroPares = 0;

        for (No i = inicio; i != null; i = i.getProximo()) {
            if(i.getElement()%2 == 0){
                nroPares++;
            }
        }
        return nroPares;
    }
    
}
