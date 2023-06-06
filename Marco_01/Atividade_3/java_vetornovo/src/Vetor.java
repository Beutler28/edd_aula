public class Vetor {

    private Alunos[] vetor;
    private int tamanho;

    public Vetor(int tamanho){
        this.vetor = new Alunos[tamanho];
    }

    @Override
    public boolean add(Alunos aluno){
        if(this.tamanho < this.vetor.length){
            vetor[tamanho] = aluno;
            this.tamanho++;
            return true;
        }   
        return false;
    }

    @Override
    public boolean contem(Alunos aluno) {
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i].equals(aluno)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean remove(Alunos aluno){
        int p = -1;
        for(int i = 0; i<tamanho; i++){
            if(vetor[i].equals(aluno)){
             p = i;
             break;
            }
        }
        if(p != -1){
        for(int i = p; i<tamanho -1; i++){
            vetor[i] = vetor[i + 1];
        }
        vetor[tamanho-1] = null;
        tamanho--;
        return true;
        }
        return false;
    }

    @Override
    public int tamanho(){
        return this.tamanho;
    }

}
