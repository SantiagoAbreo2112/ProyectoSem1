package entretenimiento;

public class Pelicula extends OfertaEntretenimiento {

    private double duracionHoras;
    private double valorPorHora;

    public Pelicula(String nombre, String descripcion, double duracionHoras, double valorPorHora) {
        super(nombre, descripcion);
        this.duracionHoras = duracionHoras;
        this.valorPorHora = valorPorHora;
    }

    public void setDuracionHoras(double duracionHoras) {
        this.duracionHoras = duracionHoras;
    }

    public double getDuracionHoras(){
        return this.duracionHoras;
    }

    public void setValorPorHora(double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    public double getValorPorHora(){
        return this.valorPorHora;
    }

    @Override
    public double calcularPrecio(){
        return this.duracionHoras * this.valorPorHora;
    }

    @Override
    public String toString(){
        // La descripción no se muestra para evitar que el mensaje que es devuelto sea demasiado largo
        return String.format("Pelicula: {nombre: %s, duracionHoras: %s, valorPorHora: %s}", this.nombre, this.duracionHoras, this.valorPorHora);
    }



}
