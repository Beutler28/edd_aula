package Atividade_01;

public class ABB {

    private No raiz;

    public boolean isEmpty(){
         return this.raiz == null;
    }

    public void add(int element){
        if(isEmpty()){
            this.raiz = new No(element);
        } else {
            No aux = this.raiz;
            while (aux != null){
                if (element < aux.getValor()){
                    if(aux.getEsq() == null){
                        No newNo = new No(element);
                        aux.setEsq(newNo);
                        newNo.setPai(aux);
                        return;
                    }
                    aux = aux.getEsq();
                } else {
                    if(aux.getDir() == null){
                        No newNo = new No(element);
                        aux.setDir(newNo);
                        newNo.setPai(aux);
                        return;
                    }
                    aux = aux.getDir();
                }
            }
        }
    }

    public boolean buscar(int element) {

        if (isEmpty()) {
            return false;
        }

        No aux = this.raiz;
        while (aux != null) {
            if (element == aux.getValor()) {
                return true;
            } else if (element < aux.getValor()) {
                aux = aux.getEsq();
            } else {
                aux = aux.getDir();
            }
        }
        return false;
    }

    public void imprimirArvore() {
        if (isEmpty()) {
            System.out.println("A árvore está vazia.");
        } else {
            imprimirArvoreRecursivo(raiz);
        }
    }

    private void imprimirArvoreRecursivo(No no) {
        if (no != null) {
            imprimirArvoreRecursivo(no.getEsq());
            System.out.print(no.getValor() + " ");
            imprimirArvoreRecursivo(no.getDir());
        }
    }


}
