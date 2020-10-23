package proyectoCovid;

import java.util.ArrayList;
import java.util.HashMap;

public class ClasePrincipal {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String ruta_csv="C:\\covid\\datos_ccaas.csv";
        String ruta_html="C:\\covid\\fichero.html";
        HashMap<String , ArrayList<Incidencia>> mapa_incidencias=AccesoFichero.leerFichero(ruta_csv);
        String html_tabla=PintaHTML.crearTabla(mapa_incidencias);
        GrabarFichero.grabarLinea(html_tabla,ruta_html);
    }

}