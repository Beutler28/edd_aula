package Atividade_03;

public class Main {
    public static void main(String[] args) {
        Maps maps = new Maps();

        // Criando alguns objetos Aluno
        Aluno aluno1 = new Aluno(123, "João", 10.1);
        Aluno aluno2 = new Aluno(456, "Maria", 10.2);
        Aluno aluno3 = new Aluno(789, "Pedro", 10.3);

        // Adicionando os alunos ao Maps
        maps.put(aluno1.getMatricula(), aluno1);
        maps.put(aluno2.getMatricula(), aluno2);
        maps.put(aluno3.getMatricula(), aluno3);

        // Acessando alunos pelo número de matrícula
        Aluno alunoEncontrado = maps.get(123);
        System.out.println("Aluno encontrado: " + alunoEncontrado);

        // Alterando um aluno existente
        Aluno novoAluno1 = new Aluno(123, "Carlos", 10.4);
        maps.put(novoAluno1.getMatricula(), novoAluno1);

        // Acessando novamente o aluno pelo número de matrícula
        Aluno alunoAlterado = maps.get(123);
        System.out.println("Aluno alterado: " + alunoAlterado);
    }
}

