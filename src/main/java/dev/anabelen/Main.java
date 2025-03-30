package dev.anabelen;

import java.util.Scanner;
import java.util.Locale;

public class Main {

    private TiendaComputadoras tienda;
    private Scanner scanner;

    public Main(TiendaComputadoras tienda, Scanner scanner) {
        this.tienda = tienda;
        this.scanner = scanner;
    }

    public void agregarComputadora() {
        System.out.print("Marca: ");
        String marca = scanner.nextLine();
        System.out.print("Memoria: ");
        String memoria = scanner.nextLine();
        System.out.print("Procesador: ");
        String procesador = scanner.nextLine();
        System.out.print("Sistema Operativo: ");
        String sistemaOperativo = scanner.nextLine();
        System.out.print("Precio: ");
        scanner = scanner.useLocale(Locale.US); // Forzar Locale.US
        double precio = scanner.nextDouble();
        scanner.nextLine(); // Consumir la nueva línea
        Computadora nuevaComputadora = new Computadora(marca, memoria, procesador, sistemaOperativo, precio);
        tienda.agregarComputadora(nuevaComputadora);
        System.out.println("Computadora agregada.");
    }

    public void eliminarComputadora() throws ComputadoraNoEliminadaException {
        System.out.print("Marca de la computadora a eliminar: ");
        String marcaEliminar = scanner.nextLine();
        tienda.eliminarComputadora(marcaEliminar);
        System.out.println("Computadora eliminada.");
    }

    public void buscarComputadora() throws ComputadoraNoEncontradaException {
        System.out.print("Marca de la computadora a buscar: ");
        String marcaBuscar = scanner.nextLine();
        Computadora computadoraEncontrada = tienda.buscarComputadora(marcaBuscar);
        System.out.println(computadoraEncontrada);
    }

    public void listarComputadoras() {
        System.out.println("Lista de computadoras:");
        tienda.listarComputadoras().forEach(System.out::println);
    }

    public void ejecutar() {
        while (true) {
            System.out.println("\n--- Tienda de Computadoras ---");
            System.out.println("1. Agregar computadora");
            System.out.println("2. Eliminar computadora");
            System.out.println("3. Buscar computadora");
            System.out.println("4. Listar computadoras");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            try {
                switch (opcion) {
                    case 1:
                        agregarComputadora();
                        break;
                    case 2:
                        eliminarComputadora();
                        break;
                    case 3:
                        buscarComputadora();
                        break;
                    case 4:
                        listarComputadoras();
                        break;
                    case 5:
                        System.out.println("¡Hasta luego!");
                        return;
                    default:
                        System.out.println("Opción inválida.");
                }
            } catch (ComputadoraNoEncontradaException | ComputadoraNoEliminadaException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        TiendaComputadoras tienda = new TiendaComputadoras("Mi Tienda", "Anabelen", "123456789");
        Scanner scanner = new Scanner(System.in);
        Main main = new Main(tienda, scanner);
        main.ejecutar();
    }
}
