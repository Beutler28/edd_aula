public class ListaEncadeada implements IListaEncadeada{
    
    private No inicio;
    private No ultimo;
    private int tamanho;

    
    public No inicio(){
        return this.inicio;
    }

    
    public void addInicio(Object element){
        No celula = new No(element);
        if(this.tamanho == 0){
            this.inicio = celula;
        } else {
            celula.setProximo(inicio);
            inicio = celula;
        } 
        this.tamanho++;
        
    }

    
    public void addFinal(Object element){
        No celula = new No(element);
        if(this.tamanho == 0){
            this.inicio = celula;
        } else{
            this.ultimo.setProximo(celula); 
        }
        this.ultimo = celula;
        this.tamanho++;
    }

    
    public int getTamanho(){
        return this.tamanho;
    }

    
    
}