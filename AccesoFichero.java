package proyectoCovid;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class AccesoFichero {

	public static HashMap<String, ArrayList<Incidencia>> leerFichero(String ruta_csv) {
		HashMap<String , ArrayList<Incidencia>> mapa_comunidades=new HashMap<>();
		try {
			FileReader f=new FileReader(ruta_csv);
			BufferedReader br=new BufferedReader(f);
			String linea=br.readLine();
			while(linea!=null)
			{
				String[] datos=linea.split(",");
				String nombre=datos[0];
				String fecha=datos[1];
				int casos=Integer.parseInt(datos[2]);
				int casos_pcr=Integer.parseInt(datos[3]);
				Incidencia a=new Incidencia(fecha,casos,casos_pcr);
				if(mapa_comunidades.containsKey(nombre))
				{
					mapa_comunidades.get(nombre).add(a);
				}
				else
				{
					ArrayList<Incidencia> lista=new ArrayList();
					lista.add(a);
					mapa_comunidades.put(nombre, lista);
				}
				linea=br.readLine();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mapa_comunidades;
	}

}