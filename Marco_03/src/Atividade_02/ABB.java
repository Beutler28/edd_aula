package Atividade_02;

public class ABB {

    private No raiz;

    public ABB() {
        this.raiz = null;
    }

    public ABB(No raiz) {
        this.raiz = raiz;
    }

    public No getRaiz() {
        return raiz;
    }

    public void setRaiz(No raiz) {
        this.raiz = raiz;
    }

    public boolean isEmpty() {
        return raiz == null;
    }

    public void add(int element) {
        if (isEmpty()){
            this.raiz = new No(element);
        } else {
            No aux = this.raiz;
            while (aux != null) {
                if (element < aux.getValor()) {
                    if (aux.getEsq() == null) {
                        No newNode = new No(element);
                        aux.setEsq(newNode);
                        newNode.setPai(aux);
                        return;
                    }
                    aux = aux.getEsq();
                } else {
                    if (aux.getDir() == null) {
                        No newNode = new No(element);
                        aux.setDir(newNode);
                        newNode.setPai(aux);
                        return;
                    }
                    aux = aux.getDir();
                } // fim else
            } // fim while
        } // fim else
    }

    public void recursiveAdd(int element) {
        if (isEmpty()){
            this.raiz = new No(element);
        } else {
            recursiveAdd(this.raiz, element);
        }
    }

    private void recursiveAdd(No node, int element) {
        if (element < node.getValor()) {
            if (node.getEsq() == null) {
                No newNode = new No(element);
                node.setEsq(newNode);
                newNode.setPai(node);
                return;
            }
            recursiveAdd(node.getEsq(), element);
        } else {
            if (node.getDir() == null) {
                No newNode = new No(element);
                node.setDir(newNode);
                newNode.setPai(node);
                return;
            }
            recursiveAdd(node.getDir(), element);
        }
    }

    public No remove(int element) {
        if(isEmpty()) {
            return null;
        }

        No aux = this.raiz;

        while (aux != null) {
            if (element == aux.getValor()) {
                break;
            } else if (element < aux.getValor()) {
                aux = aux.getEsq();
            } else {
                aux = aux.getDir();
            }
        }

        if (aux == null) {
            return null;
        }

        if (aux.getEsq() == null && aux.getDir() == null) {
            if (aux == this.raiz) {
                this.raiz = null;
            } else {
                if (aux.getPai().getEsq() == aux) {
                    aux.getPai().setEsq(null);
                } else {
                    aux.getPai().setDir(null);
                }
            }
        } else if (aux.getEsq() != null && aux.getDir() == null) {
            if (aux == this.raiz) {
                this.raiz = aux.getEsq();
            } else {
                if (aux.getPai().getEsq() == aux) {
                    aux.getPai().setEsq(aux.getEsq());
                } else {
                    aux.getPai().setDir(aux.getEsq());
                }
            }
        } else if (aux.getEsq() == null && aux.getDir() != null) {
            if (aux == this.raiz) {
                this.raiz = aux.getDir();
            } else {
                if (aux.getPai().getEsq() == aux) {
                    aux.getPai().setEsq(aux.getDir());
                } else {
                    aux.getPai().setDir(aux.getDir());
                }
            }
        } else {
            No sucessor = aux.getDir();
            while (sucessor.getEsq() != null) {
                sucessor = sucessor.getEsq();
            }

            aux.setValor(sucessor.getValor());

            if (sucessor.getPai().getEsq() == sucessor) {
                sucessor.getPai().setEsq(null);
            } else {
                sucessor.getPai().setDir(null);
            }
        }

        return aux;
    }

    public boolean contains(int element) {
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

    public String preOrdem() {
        if(isEmpty()) {
            return "AAB está vazia";
        }

        StringBuilder conteudo = new StringBuilder();
        preOrdem(raiz, conteudo);
        return conteudo.toString();
    }

    private void preOrdem(No node, StringBuilder str) {
        if (node != null) {
            str.append(node.getValor()).append(" ");
            preOrdem(node.getEsq(), str);
            preOrdem(node.getDir(), str);
        }
    }

    public String emOrdem() {
        if(isEmpty()) {
            return "AAB está vazia";
        }

        StringBuilder conteudo = new StringBuilder();
        emOrdem(raiz, conteudo);
        return conteudo.toString();
    }

    private void emOrdem(No node, StringBuilder str) {
        if (node != null) {
            emOrdem(node.getEsq(), str);
            str.append(node.getValor()).append(" ");
            emOrdem(node.getDir(), str);
        }
    }

    public String posOrdem() {
        if(isEmpty()) {
            return "AAB está vazia";
        }

        StringBuilder conteudo = new StringBuilder();
        posOrdem(raiz, conteudo);
        return conteudo.toString();
    }

    private void posOrdem(No node, StringBuilder str) {
        if (node != null) {
            posOrdem(node.getEsq(), str);
            posOrdem(node.getDir(), str);
            str.append(node.getValor()).append(" ");
        }
    }
}



