public class Punto<E> {
    private E x;
    private E y;

    public Punto(E x, E y) {
        this.x = x;
        this.y = y;
    }

    public E getX() {
        return x;
    }

    public E getY() {
        return y;
    }

    public void setX(E x) {
        this.x = x;
    }

    public void setY(E y) {
        this.y = y;
    }

    public static void main(String[] args) {
        Punto<Integer> punto = new Punto<Integer>(5,4);
        Punto<Double> punto1 = new Punto<Double>(2.5, 2.75);
    }
}
