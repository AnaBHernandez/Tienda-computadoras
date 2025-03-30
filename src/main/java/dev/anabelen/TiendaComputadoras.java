package dev.anabelen;

    import java.util.ArrayList;
    import java.util.List;

    public class TiendaComputadoras {
        private String nombreTienda;
        private String propietarioTienda;
        private String identificadorTributario;
        private List<Computadora> computadoras;

        public TiendaComputadoras(String nombreTienda, String propietarioTienda, String identificadorTributario) {
            this.nombreTienda = nombreTienda;
            this.propietarioTienda = propietarioTienda;
            this.identificadorTributario = identificadorTributario;
            this.computadoras = new ArrayList<>();
        }

        public void agregarComputadora(Computadora computadora) {
            computadoras.add(computadora);
        }

        public void eliminarComputadora(String marca) throws ComputadoraNoEliminadaException {
            if (!computadoras.removeIf(computadora -> computadora.getMarca().equalsIgnoreCase(marca))) {
                throw new ComputadoraNoEliminadaException("No se pudo eliminar la computadora con marca " + marca + ".");
            }
        }

        public Computadora buscarComputadora(String marca) throws ComputadoraNoEncontradaException {
            for (Computadora computadora : computadoras) {
                if (computadora.getMarca().equalsIgnoreCase(marca)) {
                    return computadora;
                }
            }
            throw new ComputadoraNoEncontradaException("Computadora con marca " + marca + " no encontrada.");
        }

        public List<Computadora> listarComputadoras() {
            return this.computadoras;
        }
    }
