package Atividade_04;

public class Aluno {
    private String nome;
    private int id;
    private double nota;

    public Aluno(int id, String nome, float nota) {
        this.nome = nome;
        this.id = id;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                ", id: " + id +
                ", Nota: " + nota;
    }

}