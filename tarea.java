import java.util.ArrayList;

/**
 * La siguiente clase define el objeto tarea el cual contiene id, nombre, fecha inicio, fecha fin, responsable, estimacion, grado de avance.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tarea
{
    int id = 0;
    String nombre = "";
    String fecha_inicio = "";
    String fecha_fin = "";
    ArrayList<colaborador> responsables = new ArrayList<colaborador>();
    String estimacion = "";
    String grado_avance = "";
    String estado = "";
    
    public tarea(int identificador, String nombre_, String fechainicio, String fechafin, String estimacion_, String gradoavance, String estado_){
        id = identificador;
        nombre = nombre_;
        fecha_inicio = fechainicio;
        fecha_fin = fechafin;
        estimacion = estimacion_;
        grado_avance = gradoavance; 
        estado = estado_;
    }
    
    public void anadirColaborador(colaborador nuevo_responsable){
        responsables.add(nuevo_responsable);
    }
    
    public void quitarColaborador(colaborador quitar_responsable){
        responsables.remove(quitar_responsable);
    }
    
    public void cambiarEstado(tarea t, String nuevo_estado){
        estado = nuevo_estado;
    }
    
    public String consultarEstado(){
        return estado;
    }
    
    public String darTarea(){
        return nombre;
    }
    
    public String darColaboradores(){
        String s = "";
        for(colaborador c : responsables){
            s += c.darNombre() + " / ";
        }
        return s;
    }
    
}
