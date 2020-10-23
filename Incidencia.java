package proyectoCovid;

public class Incidencia {
private String fecha;
private int num_casos,num_casos_pcr;
public Incidencia(String fecha, int num_casos, int num_casos_pcr) {
	super();
	this.fecha = fecha;
	this.num_casos = num_casos;
	this.num_casos_pcr = num_casos_pcr;
}
public String getFecha() {
	return fecha;
}
public void setFecha(String fecha) {
	this.fecha = fecha;
}
public int getNum_casos() {
	return num_casos;
}
public void setNum_casos(int num_casos) {
	this.num_casos = num_casos;
}
public int getNum_casos_pcr() {
	return num_casos_pcr;
}
public void setNum_casos_pcr(int num_casos_pcr) {
	this.num_casos_pcr = num_casos_pcr;
}
}