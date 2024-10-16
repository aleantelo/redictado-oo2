public abstract class FamiliaEmpleado extends Empleado {

    protected boolean casado;

    protected int cantidadHijos;

    protected double casado() {
        return casado ? 5000 : 0;
    }

    protected double valorPorHijo() {
        return cantidadHijos * 2000;
    }

}
