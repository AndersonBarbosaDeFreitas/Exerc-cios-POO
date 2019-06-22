public class Circulo implements AreaCalculavel {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double calculaArea() {
        return 3.15*(this.raio*this.raio);
    }
}