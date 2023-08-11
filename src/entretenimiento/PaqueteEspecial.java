package entretenimiento;

import utilidades.Utilidades;

import java.util.ArrayList;

public class PaqueteEspecial extends OfertaEntretenimiento implements IListaContenido{
    private ArrayList<OfertaEntretenimiento> contenido;
    private double porcentajeBonificacion;

    public PaqueteEspecial(String nombre, String descripcion, ArrayList<OfertaEntretenimiento> contenido, double porcentajeBonificacion) {
        super(nombre, descripcion);
        if(porcentajeBonificacion < 0) {
            throw new IllegalArgumentException("El porcentaje de bonificación debe ser positivo!");
        };
        this.contenido = contenido;
        this.porcentajeBonificacion = porcentajeBonificacion;
    }

    public void setContenido(ArrayList<OfertaEntretenimiento> contenido) {
        this.contenido = contenido;
    }

    public void addContenido(OfertaEntretenimiento contenido) {
        this.contenido.add(contenido);
    }

    public ArrayList<OfertaEntretenimiento> getContenido() {
        return this.contenido;
    }

    public void setPorcentajeBonificacion(double porcentajeBonificacion) {
        this.porcentajeBonificacion = porcentajeBonificacion;
    }

    public double getPorcentajeBonificacion() {
        return this.porcentajeBonificacion;
    }

    @Override
    public double calcularPrecio(){
        double precio = 0;

        for(OfertaEntretenimiento elementoContenido : contenido){
            precio += elementoContenido.calcularPrecio();
        }

        return precio * (1 - this.porcentajeBonificacion / 100);
    }

    @Override
    public String toString(){
        String contenidoConcatenado = Utilidades.contcatenarEntretenimiento(this.contenido, 4);

        return "PaqueteEspecial: {\n nombre: " + this.nombre + ",\n porcentajeBonificacion: " + this.porcentajeBonificacion + "\n contenido: " + contenidoConcatenado + "\n}";
    }

}
