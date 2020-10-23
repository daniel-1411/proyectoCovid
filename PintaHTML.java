package proyectoCovid;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class PintaHTML {

	public static String crearTabla(HashMap<String, ArrayList<Incidencia>> mapa_incidencias) {
        String html="<html><head></head><body>";
        for (String incidencia : mapa_incidencias.keySet()) {
            html=html+"<table border=1><tr><th>C�digo de CA: "+incidencia+"</th><th>N� casos</th><th>N� casos PCR</th></tr>";
            ArrayList<Incidencia> lista=mapa_incidencias.get(incidencia);
            for (Incidencia incidencia2 : lista) {
                html=html+"<tr><td>"+incidencia2.getFecha()+"</td><td>"+incidencia2.getNum_casos()+"</td><td>"+incidencia2.getNum_casos_pcr()+"</td></tr>";
            }
            html=html+"</table></body></html>";
        }
        return html;
    }

}