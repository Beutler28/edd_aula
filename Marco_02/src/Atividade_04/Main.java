package Atividade_04;

import Atividade_04.MapaHashLSE;

public class Main {
    public static void main(String[] args) {
        MapaHashLSE mapa = new MapaHashLSE();

        // Adicionar elementos ao mapa
        mapa.put(1, new Aluno(1, "João", 8.0));
        mapa.put(2, new Aluno(2, "Maria", 8.1));
        mapa.put(3, new Aluno(3, "Pedro", 8.3));
        mapa.put(4, new Aluno(4, "Ana", 8.7));
        mapa.put(5, new Aluno(5, "Carlos", 8.6));

        // Imprimir o mapa
        System.out.println("Mapa:");
        mapa.imprimirMapa();
        System.out.println();

        // Acessar elementos do mapa
        int chave = 3;
        Aluno aluno = mapa.get(chave);
        if (aluno != null) {
            System.out.println("Aluno encontrado - Chave: " + chave + ", Aluno: " + aluno);
        } else {
            System.out.println("Aluno não encontrado - Chave: " + chave);
        }
        System.out.println();

        // Remover elemento do mapa
        chave = 2;
        mapa.remove(chave);
        System.out.println("Removendo aluno - Chave: " + chave);
        System.out.println();

        // Imprimir o mapa novamente após a remoção
        System.out.println("Mapa após remoção:");
        mapa.imprimirMapa();
    }
}
