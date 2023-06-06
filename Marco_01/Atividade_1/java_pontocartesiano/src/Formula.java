import static java.lang.Math.sqrt;

public class Formula {
    public PontoCartesiano x;
    public PontoCartesiano y;

    public Formula(){
        this.x=x;
        this.y=y;
    }

    double calcular(){

        double ponto1 = Math.pow(x.getP1() - y.getP1(), 2);
        double ponto2 = Math.pow(x.getP2() - y.getP2(), 2);

        return Math.sqrt(ponto1 + ponto2);
    }

    public PontoCartesiano getX() {
        return x;
    }

    public void setX(PontoCartesiano x) {
        this.x = x;
    }

    public PontoCartesiano getY() {
        return y;
    }

    public void setY(PontoCartesiano y) {
        this.y = y;
    }
}
