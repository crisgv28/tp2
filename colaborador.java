import java.util.ArrayList;

/**
 * Colaborador es la persona que puede hacer una o varias tareas.
 * 
 * @author (B32927) 
 * @version (1)
 */
public class colaborador
{
    int id = 0;
    String nombre = "";
    ArrayList<Integer> tiempo_en_tarea = new ArrayList<Integer>();
    ArrayList<tarea> tareas_por_hacer = new ArrayList<tarea>();
    
    public colaborador(int identificador, String nombre_){
        id = identificador;
        nombre = nombre_;
    }
    
    public String darNombre(){
        return nombre;
    }
    
    public void asignarTarea(tarea t, int tiempo){
        tareas_por_hacer.add(t);
        tiempo_en_tarea.add(tiempo);
    }
    
    public void quitarTarea(tarea t){
        tareas_por_hacer.add(t);
        tiempo_en_tarea.remove(t);
    }
    
    public ArrayList estadoTareas(){
        return tareas_por_hacer;
    }
    
    public String darTareas(){
        String s = "";
        for(tarea t : tareas_por_hacer){
            s += " / "+t.darTarea();
        }
        return s;
    }
    
    
}
