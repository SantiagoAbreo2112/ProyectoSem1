package entretenimiento;

public class Serie extends OfertaEntretenimiento {
    private int cantidadEpisodios;
    private double valorPorHora;

    public Serie(String nombre, String descripcion, int numeroEpisodios, double valorPorHora) {
        super(nombre, descripcion);
        this.cantidadEpisodios = numeroEpisodios;
        this.valorPorHora = valorPorHora;
    }

    public void setNumeroEpisodios(int numeroEpisodios) {
        this.cantidadEpisodios = numeroEpisodios;
    }

    public int getNumeroEpisodios() {
        return this.cantidadEpisodios;
    }

    public void setValorPorHora(double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    public double getValorPorHora() {
        return this.valorPorHora;
    }

    @Override
    public double calcularPrecio(){
        return this.cantidadEpisodios * this.valorPorHora;
    }

    @Override
    public String toString(){
        // La descripción no se muestra para evitar que el mensaje que es devuelto sea demasiado largo
        return String.format("Pelicula: {nombre: %s, cantidadEpisodios: %s, valorPorHora: %s}", this.nombre, this.cantidadEpisodios, this.valorPorHora);
    }
}
