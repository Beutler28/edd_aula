package Atividade_03;

public class AVL {

    private NoAVL raiz;

    public boolean isEmpty() {
        return raiz == null;
    }

    public void add(int valor) {
        raiz = add(raiz, valor);
    }

    private NoAVL add(NoAVL no, int valor) {
        if (no == null) {
            return new NoAVL(valor);
        }

        if (valor < no.getValor()) {
            no.setEsquerdo(add(no.getEsquerdo(), valor));
        } else if (valor > no.getValor()) {
            no.setDireito(add(no.getDireito(), valor));
        } else {
            return no; // Nao permitir elementos duplicados
        }

        no.setAltura(1 + Math.max(getAltura(no.getEsquerdo()), getAltura(no.getDireito())));

        int balanceamento = getBalanceamento(no);

        // Rotação simples à direita
        if (balanceamento > 1 && valor < no.getEsquerdo().getValor()) {
            return rotacaoDireita(no);
        }

        // Rotação simples à esquerda
        if (balanceamento < -1 && valor > no.getDireito().getValor()) {
            return rotacaoEsquerda(no);
        }

        // Rotação dupla à direita
        if (balanceamento > 1 && valor > no.getEsquerdo().getValor()) {
            no.setEsquerdo(rotacaoEsquerda(no.getEsquerdo()));
            return rotacaoDireita(no);
        }

        // Rotação dupla à esquerda
        if (balanceamento < -1 && valor < no.getDireito().getValor()) {
            no.setDireito(rotacaoDireita(no.getDireito()));
            return rotacaoEsquerda(no);
        }

        return no;
    }

    private int getAltura(NoAVL no) {
        return (no == null) ? 0 : no.getAltura();
    }

    private int getBalanceamento(NoAVL no) {
        return (no == null) ? 0 : getAltura(no.getEsquerdo()) - getAltura(no.getDireito());
    }

    private NoAVL rotacaoDireita(NoAVL y) {
        NoAVL x = y.getEsquerdo();
        NoAVL T2 = x.getDireito();
        x.setDireito(y);
        y.setEsquerdo(T2);

        y.setAltura(1 + Math.max(getAltura(y.getEsquerdo()), getAltura(y.getDireito())));
        x.setAltura(1 + Math.max(getAltura(x.getEsquerdo()), getAltura(x.getDireito())));

        return x;
    }

    private NoAVL rotacaoEsquerda(NoAVL x) {
        NoAVL y = x.getDireito();
        NoAVL T2 = y.getEsquerdo();

        y.setEsquerdo(x);
        x.setDireito(T2);

        x.setAltura(1 + Math.max(getAltura(x.getEsquerdo()), getAltura(x.getDireito())));
        y.setAltura(1 + Math.max(getAltura(y.getEsquerdo()), getAltura(y.getDireito())));

        return y;
    }

    public boolean contains(int valor) {
        NoAVL no = raiz;
        while (no != null) {
            if (valor == no.getValor()) {
                return true;
            } else if (valor < no.getValor()) {
                no = no.getEsquerdo();
            } else {
                no = no.getDireito();
            }
        }
        return false;
    }

    public String emOrdem() {
        if (isEmpty()) {
            return "Árvore AVL está vazia";
        }
        StringBuilder conteudo = new StringBuilder();
        emOrdem(raiz, conteudo);
        return conteudo.toString();
    }

    private void emOrdem(NoAVL no, StringBuilder str) {
        if (no != null) {
            emOrdem(no.getEsquerdo(), str);
            str.append(no.getValor()).append(" ");
            emOrdem(no.getDireito(), str);
        }
    }
}
