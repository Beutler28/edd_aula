public class Main {
    public static void main(String[] args) {

        Alunos aluno1 = new Alunos("Mauricio", 19, 10);
        Alunos aluno2 = new Alunos("Carlos", 20, 10);

        VetorAlunos vetor = new VetorAlunos(10);

        vetor.add(aluno1);
        vetor.add(aluno2);

        System.out.println(vetor.contem(aluno1));
        System.out.println(vetor.tamanho());

       

    }
}