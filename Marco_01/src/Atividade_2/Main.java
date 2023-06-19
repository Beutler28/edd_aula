package Atividade_2;

public class Main {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Mauricio", 19, 10);
        Aluno aluno2 = new Aluno("Carlos", 20, 10);

        VetorAlunos vetor = new VetorAlunos(10);

        vetor.add(aluno1);
        vetor.add(aluno2);

        System.out.println(vetor.contem(aluno1));
        System.out.println(vetor.tamanho());

       

    }
}