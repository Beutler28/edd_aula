public class No {
    private int element; 
    private No proximo;
    private No anterior;

    
    public No(int element) {
        this.element = element;
        this.proximo = null;
    }

    public int getElement() {
        return element;
    }
    public void setElement(int element) {
        this.element = element;
    }
    public No getProximo() {
        return proximo;
    }
    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    public No getAnterior() {
        return anterior;
    }

    public void setAnterior(No anterior) {
        this.anterior = anterior;
    }


    @Override
    public String toString() {
        return "No [element=" + element + ", proximo=" + proximo + "]";
    }

   
    
    
}






