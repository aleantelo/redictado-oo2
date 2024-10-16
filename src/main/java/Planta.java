public class Planta extends FamiliaEmpleado {

    private int antiguedad;

    public Planta(int cantidadHijos, int antiguedad, boolean casado){
        this.cantidadHijos = cantidadHijos;
        this.antiguedad = antiguedad;
        this.casado = casado;
    }

    @Override
    public double basico() {
        return 50000;
    }

    @Override
    public double adicional() {
        return this.casado() + this.valorPorHijo() + antiguedad * 2000; //27000
    }


}
