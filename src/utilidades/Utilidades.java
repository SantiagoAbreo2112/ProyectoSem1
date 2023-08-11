package utilidades;

import entretenimiento.OfertaEntretenimiento;

import java.util.ArrayList;

public class Utilidades {
    public static String contcatenarEntretenimiento(ArrayList<OfertaEntretenimiento> contenido, int cantidadEspaciosIndentacion){
        String contenidoConcatenado = "";
        String indentacion = " ".repeat(cantidadEspaciosIndentacion);
        for(int i = 0; i < contenido.size(); i++){
            OfertaEntretenimiento elementoContenido = contenido.get(i);
            boolean esUltimoIndex = i == contenido.size() - 1;
            contenidoConcatenado += indentacion + elementoContenido + (esUltimoIndex ? "" : ",\n");
        }

        return contenidoConcatenado;
    }
}
