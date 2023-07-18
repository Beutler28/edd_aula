package Atividade_03;

public class NoAVL {

    private int valor;
    private int altura;
    private NoAVL esquerdo;
    private NoAVL direito;

    public NoAVL(int valor) {
        this.valor = valor;
        this.altura = 1;
        this.esquerdo = null;
        this.direito = null;
    }

    public int getValor() {
        return valor;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public NoAVL getEsquerdo() {
        return esquerdo;
    }

    public void setEsquerdo(NoAVL esquerdo) {
        this.esquerdo = esquerdo;
    }

    public NoAVL getDireito() {
        return direito;
    }

    public void setDireito(NoAVL direito) {
        this.direito = direito;
    }
}
