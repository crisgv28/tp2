import java.util.ArrayList;

/**
 * Columnas donde se organiza cada lista de tareas.
 * 
 * @author (B32927) 
 * @version (1)
 */
public class columna
{
    String nombre = "";
    int id = 0;
    ArrayList actividades = new ArrayList();
    
    public columna(String nombre_, int id, ArrayList tareas){
        actividades = tareas;
        nombre = nombre_;
    }
 
    public void anadirTarea(tarea t){
        actividades.add(t);
    }
    
    public void quitarTarea(tarea t){
        actividades.remove(t);
    }
}
