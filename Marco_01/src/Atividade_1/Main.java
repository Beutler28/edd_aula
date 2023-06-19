package Atividade_1;

public class Main {
    public static void main(String[] args) {
        PontoCartesiano pontoX = new PontoCartesiano(3, 4);
        PontoCartesiano pontoY = new PontoCartesiano(6, 8);

        Formula formula = new Formula();

        formula.setX(pontoX);
        formula.setY(pontoY);

        System.out.println("Distância euclidiana entre os pontos: " + formula.calcular());
    }
}
