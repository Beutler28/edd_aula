package Atividade_04;
public class ListaEncadeada implements IListaEncadeada{
    
    private No inicio;
    private No ultimo;
    private int tamanho;

    
    public No inicio(){
        return this.inicio;
    }

    @Override
    public void addInicio(Aluno element){
        No celula = new No(element);
        if(this.tamanho == 0){
            this.inicio = celula;
        } else {
            celula.setProximo(inicio);
            inicio = celula;
        } 
        this.tamanho++;
        
    }

    @Override
    public void addFinal(Aluno element){
        No celula = new No(element);
        if(this.tamanho == 0){
            this.inicio = celula;
        } else{
            this.ultimo.setProximo(celula); 
        }
        this.ultimo = celula;
        this.tamanho++;
    }

    @Override
    public void imprimirLista() {
        No atual = inicio;
            while (atual != null) {
            System.out.println(atual.getElement());
            atual = atual.getProximo();
    }
}

    @Override
    public int getTamanho(){
        return this.tamanho;
    }

    
    
}