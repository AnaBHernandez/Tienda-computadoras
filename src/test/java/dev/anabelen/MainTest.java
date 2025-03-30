package dev.anabelen;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.Locale;

public class MainTest {
    @Test
    void testAgregarComputadora() throws ComputadoraNoEliminadaException, ComputadoraNoEncontradaException {
        String input = "1\nmarcaTest\nmemoriaTest\nprocesadorTest\nsistemaOperativoTest\n1000.0\n4\n5\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US); // Forzar Locale.US
        TiendaComputadoras tienda = new TiendaComputadoras("TiendaTest", "PropietarioTest", "123456789");
        Main main = new Main(tienda, scanner);
        main.ejecutar();

        String output = out.toString();

        assertTrue(output.contains("Computadora agregada."));
        assertTrue(output.contains("marcaTest"));
        assertTrue(output.contains("memoriaTest"));
        assertTrue(output.contains("procesadorTest"));
        assertTrue(output.contains("sistemaOperativoTest"));
        assertTrue(output.contains("1000.0"));
        assertEquals(1, tienda.listarComputadoras().size());
        assertEquals("marcaTest", tienda.buscarComputadora("marcaTest").getMarca());
    }
}
