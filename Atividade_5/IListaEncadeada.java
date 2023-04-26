public interface IListaEncadeada {

    public void addInicio(int element);
    public void addFinal(int element);
    public boolean remove(int element);
    public No consultarElement(int element);
    public String getListaInicio();
    public String getListaFim(); 

}
