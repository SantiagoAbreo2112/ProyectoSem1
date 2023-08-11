package entretenimiento;

import java.util.ArrayList;

public interface IListaContenido {
    public void setContenido(ArrayList<OfertaEntretenimiento> contenido);

    public void addContenido(OfertaEntretenimiento contenido);

    public ArrayList<OfertaEntretenimiento> getContenido();
}
