public class VetorAlunos {

    private Alunos[] vetor;
    private int tamanho;

    public VetorAlunos(int tamanho){
        this.vetor = new Alunos[tamanho];
    }

    public boolean add(Alunos aluno) {
        if(this.tamanho < this.vetor.length){
            vetor[tamanho] = aluno;
            this.tamanho++;
            return true;
        }   
        return false;
    }

    public boolean contem(Alunos aluno) {
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
