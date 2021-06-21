import java.util.ArrayList;

/**
 * La lista contiene una serie de tareas.
 * 
 * @author (Cristopher Gomez B32927) 
 * @version (1)
 */
public class lista
{
    int id = 0;
    String nombre = ""; // nombre de la lista (lista de compras, estudio , ...)
    String descripcion = ""; // descripcion de la lista
    ArrayList<tarea> tareas = new ArrayList<tarea>(); // contiene todas las tareas de la lista
    /* 
     * Metodo constructor de la lista
     * @param identificador = id de la lista
     * @param nombre_ = nombre de la lista
     * @param descripcion_ = descripcion de la lista
    */
    public lista(int identificador, String nombre_, String descripcion_){
        id = identificador;
        nombre = nombre_;
        descripcion = descripcion_;
    }
    /* 
     * Da el nombre de la lista
     * @return nombre de la lista
    */
    public String darNombre(){
        return nombre;
    }
    /* 
     * Devuelve la descripcion de la lista
     * @return descripcion
    */
    public String darDescripcion(){
        return descripcion;
    }
    /* 
     * anade tarea a la lista
     * @param t  = tarea que se desea agregar
    */
    public void anadirTarea(tarea t){
        tareas.add(t);
    }
    /* 
     * quita tareas de la lista
     * @param t = tarea que se desea quitar
    */
    public void quitarTarea(tarea t){
        tareas.remove(t);
    }
    
    /* 
     * devuelve una tarea de interes
     * @param t = tarea de interes
     * @return tarea de interes
    */
    public String consultarTarea(tarea t){
        return t.consultarEstado();
    }
}
