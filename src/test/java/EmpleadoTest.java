import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmpleadoTest {

    private Empleado pasante;

    private Empleado temporario;

    private Empleado planta;

    @BeforeEach
    public void setUp(){
        pasante = new Pasante(1);
        temporario = new Temporario(1, 1, false);
        planta = new Planta(10, 1, true);
    }

    @Test
    public void empleadoTest(){
        Assertions.assertEquals(18400, pasante.sueldo());
        Assertions.assertEquals(18661, temporario.sueldo());
        Assertions.assertEquals(57000,planta.sueldo());
    }
}
