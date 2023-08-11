import entretenimiento.OfertaEntretenimiento;

import java.util.ArrayList;

public class PlataformaStreaming {
    private static PlataformaStreaming instancia;
    private ArrayList<OfertaEntretenimiento> contenido;

    private PlataformaStreaming(){
        this.contenido = new ArrayList<>();
    }
    
    public static PlataformaStreaming getInstancia(){
        if(instancia == null) instancia = new PlataformaStreaming();
        return instancia;
    }
    
    public ArrayList<OfertaEntretenimiento> getContenido(){
        return this.contenido;
    }

}
