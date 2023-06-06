package Marco_02.Atividade_02;

public class No {
    private Object info;
    private No prox;

    public No(Object info){
        this.info = info;
        this.prox = null;
    }

    public Object getInfo() {
        return info;
    }

    public void setInfo(Object info) {
        this.info = info;
    }

    public No getProx() {
        return prox;
    }

    public void setProx(No n) {
        this.prox = n;
    }

    
}
