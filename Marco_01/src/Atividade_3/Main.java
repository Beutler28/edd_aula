package Atividade_3;

public class Main {
    public static void main(String[] args) {

        Alunos aluno1 = new Alunos("Mauricio", 19, 10);
        Alunos aluno2 = new Alunos("Carlos", 20, 10);

        Vetor vetor = new Vetor(10);

        vetor.add(aluno1);
        vetor.add(aluno2);

        
        vetor.imprimeVetor();
        

       

    }
}