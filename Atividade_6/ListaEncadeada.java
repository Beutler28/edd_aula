public class ListaEncadeada implements IListaEncadeada{
    
    private No inicio;
    private No ultimo;

    
    public ListaEncadeada(){
        this.inicio = null;
        this.ultimo = null;
    }

    @Override
    public void addInicio(Object element){
        No celula = new No(element);
        if(inicio == null){
            inicio = celula;
            ultimo = celula;
        } else {
            celula.setProximo(inicio);
            inicio.setAnterior(celula);
            inicio = celula;
        }     
    }

    @Override
    public void addFinal(Object element){
        No celula = new No(element);
        if(ultimo == null){
            inicio = celula;
            ultimo = celula;

        } else{
            celula.setAnterior(ultimo);
            ultimo.setProximo(celula);
            ultimo = celula;
        }
    }

    @Override
    public boolean remove(Object element) {
        No p = consultarElement(element);

        if (p == null) {
            return false;
        }

        if (p == inicio) {
            inicio = p.getProximo();

            if (inicio != null) {
                inicio.setAnterior(null);
            } else {
                ultimo = null;
            }

        } else if (p.getProximo() == null) {
            p.getAnterior().setProximo(null);
            ultimo = p.getAnterior();
        } else {
            p.getAnterior().setProximo(p.getProximo());
            p.getProximo().setAnterior(p.getAnterior());
        }
        return true;
    }

    public No consultarElement(Object element) {
        No p = inicio;

        while (p != null && !p.getElement().equals(element)) {
            p = p.getProximo();
        }

        return p;
    }

    @Override
    public String getListaInicio() {
        String lista = "";

        for (No i = inicio; i != null; i = i.getProximo()) {
            lista += i.getElement() + " ";
        }

        return lista;
    }

    @Override
    public String getListaFim() {
        String lista = "";

        for (No i = ultimo; i != null; i = i.getAnterior()) {
            lista += i.getElement() + " ";
        }

        return lista;
    }
    
    public int getTamanho(){
        return this.tamanho;
    }

    
    
}