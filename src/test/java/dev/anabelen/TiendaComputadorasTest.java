package dev.anabelen;

    import org.junit.jupiter.api.BeforeEach;
    import org.junit.jupiter.api.Test;
    import static org.junit.jupiter.api.Assertions.*;
    import java.util.List;

    public class TiendaComputadorasTest {

        private TiendaComputadoras tienda;
        private Computadora computadora1;
        private Computadora computadora2;

        @BeforeEach
        public void setUp() {
            tienda = new TiendaComputadoras("Mi Tienda", "Anabelen", "123456789");
            computadora1 = new Computadora("HP", "8GB", "Intel i5", "Windows 10", 500.0);
            computadora2 = new Computadora("Dell", "16GB", "Intel i7", "Linux", 800.0);
            tienda.agregarComputadora(computadora1);
            tienda.agregarComputadora(computadora2);
        }

        @Test
        public void testAgregarComputadora() {
            Computadora computadora3 = new Computadora("Apple", "32GB", "M1", "macOS", 1200.0);
            tienda.agregarComputadora(computadora3);
            assertEquals(3, tienda.listarComputadoras().size());
        }

        @Test
        public void testEliminarComputadora() throws ComputadoraNoEliminadaException {
            tienda.eliminarComputadora("HP");
            assertEquals(1, tienda.listarComputadoras().size());
        }

        @Test
        public void testBuscarComputadora() throws ComputadoraNoEncontradaException {
            Computadora computadora = tienda.buscarComputadora("Dell");
            assertEquals("Dell", computadora.getMarca());
        }

        @Test
        public void testListarComputadoras() {
            List<Computadora> computadoras = tienda.listarComputadoras();
            assertEquals(2, computadoras.size());
        }

        @Test
        public void testEliminarComputadoraNoEncontrada() {
            assertThrows(ComputadoraNoEliminadaException.class, () -> tienda.eliminarComputadora("Lenovo"));
        }

        @Test
        public void testBuscarComputadoraNoEncontrada() {
            assertThrows(ComputadoraNoEncontradaException.class, () -> tienda.buscarComputadora("Lenovo"));
        }
    }
