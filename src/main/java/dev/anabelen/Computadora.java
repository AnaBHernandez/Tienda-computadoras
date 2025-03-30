package dev.anabelen;

    public class Computadora {
        private String marca;
        private String memoria;
        private String procesador;
        private String sistemaOperativo; // Corregido el nombre del atributo
        private double precio;

        public Computadora(String marca, String memoria, String procesador, String sistemaOperativo, double precio) { // Corregido el nombre del parametro
            this.marca = marca;
            this.memoria = memoria;
            this.procesador = procesador;
            this.sistemaOperativo = sistemaOperativo; // Corregido el nombre del atributo
            this.precio = precio;
        }

        public String getMarca() {
            return marca;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public String getMemoria() {
            return memoria;
        }

        public void setMemoria(String memoria) {
            this.memoria = memoria;
        }

        public String getProcesador() {
            return procesador;
        }

        public void setProcesador(String procesador) {
            this.procesador = procesador;
        }

        public String getSistemaOperativo() { // Corregido el nombre del metodo
            return sistemaOperativo;
        }

        public void setSistemaOperativo(String sistemaOperativo) { // Corregido el nombre del metodo
            this.sistemaOperativo = sistemaOperativo; // Corregido el nombre del atributo
        }

        public double getPrecio() {
            return precio;
        }

        public void setPrecio(double precio) {
            this.precio = precio;
        }

        @Override
        public String toString() {
            return "Computadora{marca='" + marca + '\'' +
                    ", memoria='" + memoria + '\'' +
                    ", procesador='" + procesador + '\'' +
                    ", sistemaOperativo='" + sistemaOperativo + '\'' +
                    ", precio=" + precio +
                    '}';
        }
    }
