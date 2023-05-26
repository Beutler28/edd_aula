package Prova_1.Questao_7;

public class No {
    private Object element; 
    private No proximo;

    
    public No(Object element) {
        this.element = element;
        this.proximo = null;
    }

    public No(Object element, No proximo) {
        this.element = element;
        this.proximo = proximo;
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

    @Override
    public String toString() {
        return "No [element=" + element + ", proximo=" + proximo + "]";
    }

}
