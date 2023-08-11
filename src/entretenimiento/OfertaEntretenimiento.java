package entretenimiento;

public abstract class OfertaEntretenimiento {

    protected String nombre;
    protected String descripcion;

    public OfertaEntretenimiento(String nombre, String descripcion){
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

    public String getDescripcion(){
        return this.descripcion;
    }

    public abstract double calcularPrecio();

}
