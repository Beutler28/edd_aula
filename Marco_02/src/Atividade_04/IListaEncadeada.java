package Atividade_04;
public interface IListaEncadeada {
    public void addFinal(Aluno element);
    public void addInicio(Aluno element);
    public void imprimirLista();
    public int getTamanho();
    public No inicio();
    public Aluno get(int index);
    public void setInicio(No inicio);
}
