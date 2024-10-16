public class Temporario extends FamiliaEmpleado {

    private int cantidadHoras;

    public Temporario(int cantidadHijos, int cantidadHoras, boolean casado){
        this.cantidadHijos = cantidadHijos;
        this.cantidadHoras = cantidadHoras;
        this.casado = casado;
    }

    @Override
    public double basico() {
        return 20000 + cantidadHoras * 300;
    }

    @Override
    public double adicional() {
        return this.casado() + this.valorPorHijo();
    }
}
