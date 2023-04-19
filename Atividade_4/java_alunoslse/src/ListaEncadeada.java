public class ListaEncadeada implements IListaEncadeada{
    
    private No inicio;
    private No ultimo;
    private int tamanho;

    @Override
    public No inicio(){
        return this.inicio;
    }

    @Override
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

    @Override
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


    @Override
    public int getTamanho(){
        return this.tamanho;
    }

  

//    public void remove(Object element){
    //  No p = inicio;
     

    //  while(this.p!=0 &&    ){
//
   //  }
   //  return true;
   // }

  //  @Override
  //  public String toString() {
//
  //      if(this.tamanho ==0){
  //          return "[]";
  //      }
//
  //      StringBuilder builder = new StringBuilder("[");
 //
  //      No atual = this.inicio;
  //      for(int i = 0; i<this.tamanho - 1; i++){
  //          builder.append(atual.getElement()).append(",");
  //          atual = atual.getProximo();
  //      }
  //      builder.append(atual.getElement()).append("]");
//
  //      return builder.toString();
  //  }

    
    
}