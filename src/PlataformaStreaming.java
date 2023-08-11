import entretenimiento.IListaContenido;
import entretenimiento.OfertaEntretenimiento;
import utilidades.Utilidades;

import java.util.ArrayList;

public class PlataformaStreaming implements IListaContenido {
    private static PlataformaStreaming instancia;
    private ArrayList<OfertaEntretenimiento> contenido;

    private PlataformaStreaming(){
        this.contenido = new ArrayList<>();
    }
    
    public static PlataformaStreaming getInstancia(){
        if(instancia == null) instancia = new PlataformaStreaming();
        return instancia;
    }

    public void setContenido(ArrayList<OfertaEntretenimiento> contenido){
        this.contenido = contenido;
    }

    public void addContenido(OfertaEntretenimiento contenido){
        this.contenido.add(contenido);
    }

    public ArrayList<OfertaEntretenimiento> getContenido(){
        return this.contenido;
    }

    @Override
    public String toString(){
        String contenidoConcatenado = Utilidades.contcatenarEntretenimiento(this.contenido, 2);

        return "Contenido de la plataforma: {\n " + contenidoConcatenado + "\n}";
    }

}
