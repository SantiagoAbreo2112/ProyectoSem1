package entretenimiento;

import java.util.ArrayList;

public class PaqueteEspecial extends OfertaEntretenimiento {
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

    public ArrayList<OfertaEntretenimiento> getContenido() {
        return this.contenido;
    }

    public void setContenido(OfertaEntretenimiento contenido) {
        this.contenido.add(contenido);
    }

    public double getPorcentajeBonificacion() {
        return this.porcentajeBonificacion;
    }

    public void setPorcentajeBonificacion(double porcentajeBonificacion) {
        this.porcentajeBonificacion = porcentajeBonificacion;
    }

    @Override
    public double calcularPrecio(){
        double precio = 0;

        for(OfertaEntretenimiento elemento : contenido){
            precio += elemento.calcularPrecio();
        }

        return precio * (1 - this.porcentajeBonificacion / 100);
    }

}
