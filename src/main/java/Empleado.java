public abstract class Empleado {

    public double sueldo(){
        return basico() + adicional() - descuento();
    }
    public abstract double basico();
    public  double descuento(){
        return basico() * 0.13 + adicional() * 0.5;
    };
    public abstract double adicional();
}
