public class MovableRectangle implements Movable {
    private MovablePoint supEsquerdo;
    private MovablePoint infDireito;

    public MovableRectangle (int xEsq, int xDir, int yEsq, int yDir, int xSpeed, int ySpeed){
        supEsquerdo = new MovablePoint(xEsq, yEsq, xSpeed, ySpeed);
        infDireito = new MovablePoint(xDir, yDir, xSpeed, ySpeed);
    }

    public String toString() {
        return "Superior Esquerdo: "+this.supEsquerdo.toString()+"\nInferior Direito: "+this.infDireito.toString();
    }

    public void moveUp() {
        this.supEsquerdo.moveUp();
        this.infDireito.moveUp();
    }

    public void moveDown() {
        this.supEsquerdo.moveDown();
        this.infDireito.moveDown();
    }

    public void moveLeft() {
        this.supEsquerdo.moveLeft();
        this.infDireito.moveLeft();
    }

    public void moveRight() {
        this.supEsquerdo.moveRight();
        this.infDireito.moveRight();
    }
}