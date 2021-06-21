import java.util.ArrayList;

/**
 * La lista contiene una serie de tareas.
 * 
 * @author (B32927) 
 * @version (1)
 */
public class lista
{
    int id = 0;
    String nombre = "";
    String descripcion = "";
    ArrayList<tarea> tareas = new ArrayList<tarea>();
    
    public lista(int identificador, String nombre_, String descripcion_){
        id = identificador;
        nombre = nombre_;
        descripcion = descripcion_;
    }
    
    public String darNombre(){
        return nombre;
    }
    
    public String darDescripcion(){
        return descripcion;
    }
    
    public void anadirTarea(tarea t){
        tareas.add(t);
    }
    
    public void quitarTarea(tarea t){
        tareas.remove(t);
    }
    
    public void cambiarEstadoTarea(tarea t, String nuevo_estado){
        t.cambiarEstado(t,nuevo_estado);
    }
    
    public String consultarTarea(tarea t){
        return t.consultarEstado();
    }
}
