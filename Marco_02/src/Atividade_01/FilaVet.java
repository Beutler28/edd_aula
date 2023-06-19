package Atividade_01;

public class FilaVet implements IFila{
    private int nElemFila;
    private int inicio;
    private Object[] vetFila;

    public FilaVet(int tamFila) {
        this.nElemFila = 0;
        this.inicio = 0;
        this.vetFila = new Object[tamFila];
    }

    @Override
    public boolean add(Object info) { // método que insere na fila
        if (this.nElemFila == vetFila.length) {
            System.out.println("Capacidade da fila esgotou");
            return false;
        }
        int fim = (this.inicio + this.nElemFila) % this.vetFila.length;
        this.vetFila[fim] = info;
        this.nElemFila++;
        return true;
    }

    @Override
    public boolean remove() { // método que retira da fila
        if (this.isEmpty()) { // como verificar se está vazia?
            System.out.println("Fila estah vazia");
            return false;
        }
        this.inicio = (this.inicio + 1) % this.vetFila.length;
        this.nElemFila--;
        return true;
    }

    @Override
    public void imprimeFila() {
        if (this.isEmpty()) {
            System.out.println("Fila esta vazia");
            return;
        }
        int i = this.inicio;
        int count = 0;

        while (count < this.nElemFila) {
            System.out.println(this.vetFila[i]);
            i = (i + 1) % this.vetFila.length;
            count++;
        }

    }

    public boolean isEmpty() {
        return this.nElemFila == 0;
    }

}