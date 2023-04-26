public interface IListaEncadeada {

    public void addInicio(Object element);
    public void addFinal(Object element);
    public boolean remove(Object element);
    public No consultarElement(Object element);
    public String getListaInicio();
    public String getListaFim(); 

}
