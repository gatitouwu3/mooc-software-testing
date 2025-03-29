package tudelft.ghappy;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GHappyTest {

    @Test
    void testGHappy_SoloG() {
        GHappy ghappy = new GHappy();
        assertFalse(ghappy.gHappy("g")); // Solo un 'g' sin vecinos
    }

    @Test
    void testGHappy_GG() {
        GHappy ghappy = new GHappy();
        assertTrue(ghappy.gHappy("gg")); // Dos 'g' juntos
    }

    @Test
    void testGHappy_GEnMedio() {
        GHappy ghappy = new GHappy();
        assertFalse(ghappy.gHappy("agbg")); // 'g' sin vecinos felices
    }


    @Test
    void testGHappy_GAlFinal() {
        GHappy ghappy = new GHappy();
        assertTrue(ghappy.gHappy("agg")); // 'g' al final con vecino anterior
    }

    @Test
    void testGHappy_GAlInicio() {
        GHappy ghappy = new GHappy();
        assertTrue(ghappy.gHappy("gga")); // 'g' al inicio con vecino posterior
    }

    @Test
    void testGHappy_SinG() {
        GHappy ghappy = new GHappy();
        assertTrue(ghappy.gHappy("abc")); // Sin 'g' en el string
    }

    @Test
    void testGHappy_VariosG() {
        GHappy ghappy = new GHappy();
        assertFalse(ghappy.gHappy("agb")); // 'g' sin vecino
    }

    @Test
    void testGHappy_Vacio() {
        GHappy ghappy = new GHappy();
        assertTrue(ghappy.gHappy("")); // String vacío
    }

    @Test
    void testGHappy_Nulo() {
        GHappy ghappy = new GHappy();
        assertThrows(AssertionError.class, () -> ghappy.gHappy(null)); // Nulo
    }
}
