package Atividade_6;

public class No {
    private Object element; 
    private No proximo;
    private No anterior;

    
    public No(Object element) {
        this.element = element;
        this.proximo = null;
        this.anterior = null;
    }

    public Object getElement() {
        return element;
    }
    public void setElement(Object element) {
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
