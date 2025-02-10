import static org.junit.jupiter.api.Assertions.*;
import org.junit.*;

public class EquipoFutbolTest {
    
    @Test
    public void testCase01()
    {
        EquipoFutbol equipoFu1 = new EquipoFutbol("Los Mazacotes de Chicontepec", "Horacio Cascarin");
        assertEquals("Horacio Cascarin", equipoFu1.getNombre());
    }

}
