package Trabalho_2.Atividade_01;

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

    public No getProx() {
        return prox;
    }

    public void setProx(No n) {
        this.prox = n;
    }
}
