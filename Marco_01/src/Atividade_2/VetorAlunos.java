package Atividade_2;

public class VetorAlunos {

    private Aluno[] vetor;
    private int tamanho;

    public VetorAlunos(int tamanho){
        this.vetor = new Aluno[tamanho];
    }

    public boolean add(Aluno aluno) {
        if(this.tamanho < this.vetor.length){
            vetor[tamanho] = aluno;
            this.tamanho++;
            return true;
        }   
        return false;
    }

    public boolean contem(Aluno aluno) {
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i].equals(aluno)) {
                return true;
            }
        }
        return false;
    }

    public int tamanho(){
        return this.tamanho;
    }

}
