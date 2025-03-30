package dev.anabelen;

    import org.junit.jupiter.api.BeforeEach;
    import org.junit.jupiter.api.Test;
    import static org.junit.jupiter.api.Assertions.*;

    public class ComputadoraTest {

        private Computadora computadora;

        @BeforeEach
        public void setUp() {
            computadora = new Computadora("HP", "8GB", "Intel i5", "Windows 10", 500.0);
        }

        @Test
        public void testGetMarca() {
            assertEquals("HP", computadora.getMarca());
        }

        @Test
        public void testSetMarca() {
            computadora.setMarca("Dell");
            assertEquals("Dell", computadora.getMarca());
        }

        @Test
        public void testGetMemoria() {
            assertEquals("8GB", computadora.getMemoria());
        }

        @Test
        public void testSetMemoria() {
            computadora.setMemoria("16GB");
            assertEquals("16GB", computadora.getMemoria());
        }

        @Test
        public void testGetProcesador() {
            assertEquals("Intel i5", computadora.getProcesador());
        }

        @Test
        public void testSetProcesador() {
            computadora.setProcesador("Intel i7");
            assertEquals("Intel i7", computadora.getProcesador());
        }

        @Test
        public void testGetSistemaOperativo() {
            assertEquals("Windows 10", computadora.getSistemaOperativo());
        }

        @Test
        public void testSetSistemaOperativo() {
            computadora.setSistemaOperativo("Linux");
            assertEquals("Linux", computadora.getSistemaOperativo());
        }

        @Test
        public void testGetPrecio() {
            assertEquals(500.0, computadora.getPrecio());
        }

        @Test
        public void testSetPrecio() {
            computadora.setPrecio(600.0);
            assertEquals(600.0, computadora.getPrecio());
        }

        @Test
        public void testToString() {
            String expected = "Computadora{marca='HP', memoria='8GB', procesador='Intel i5', sistemaOperativo='Windows 10', precio=500.0}";
            assertEquals(expected, computadora.toString());
        }
    }
