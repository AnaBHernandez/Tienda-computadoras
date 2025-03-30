package dev.anabelen;

import java.util.ArrayList;
import java.util.List;

public class TiendaComputadoras {
    private String nombreTienda;
    private String propietarioTienda;
    private String identificadorTributario;
    private List<Computadora> computadoras;

    public TiendaComputadoras(String nombreTienda, String propietarioTienda, String identificadorTributario, List<Computadora> computadoras) {
        this.nombreTienda = nombreTienda;
        this.propietarioTienda = propietarioTienda;
        this.identificadorTributario = identificadorTributario;
        this.computadoras = new ArrayList<>();
    }

    public void agregarComputadora(Computadora computadora) {
        computadoras.add(computadora);
    }

    public void eliminarComputadora(String marca) {
        computadoras.removeIf(computadora -> computadora.getMarca().equalsIgnoreCase(marca));
    }

    public Computadora buscarComputaroras(String marca) {
        for (Computadora computadora : computadoras) {
            if (computadora.getMarca().equals(marca)) {
                return computadora;
            }
        }
        return null;
    }

    public List<Computadora> listarComputadoras() {
        return computadoras;
    }
}

