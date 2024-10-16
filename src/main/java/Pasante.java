public class Pasante extends Empleado {

    private int examenesRendidos;

    public Pasante(int examenesRendidos) {
        this.examenesRendidos = examenesRendidos;
    }

    @Override
    public double basico() {
        return 20000;
    }

    @Override
    public double adicional() {
        return 2000 * examenesRendidos;
    }
}
