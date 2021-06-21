import java.util.ArrayList;

/**
 * Colaborador es la persona que puede hacer una o varias tareas.
 * 
 * @author (Cristopher Gomez B32927) 
 * @version (1)
 */
public class colaborador
{
    int id = 0;
    String nombre = ""; // nombre de la persona
    ArrayList<Integer> tiempo_en_tarea = new ArrayList<Integer>(); // contiene los tiempos asignados para cada tarea
    ArrayList<tarea> tareas_por_hacer = new ArrayList<tarea>(); // contiene las tareas por hacer
    /* 
     * Metodo constructor del colaborador
     * @param identificador = id del colaborador
     * @param nombre_ = nombre del colaborador
    */
    public colaborador(int identificador, String nombre_){
        id = identificador;
        nombre = nombre_;
    }
    /* 
     * Devuelver el nombre del colaborador
     * @return nombre
    */
    public String darNombre(){
        return nombre;
    }
    /* 
     * Asigna tarea al colaborador
     * @param t = tarea que se le va a asignar al colaborador
     * @param tiempo = tiempo asignado
    */
    public void asignarTarea(tarea t, int tiempo){
        tareas_por_hacer.add(t);
        tiempo_en_tarea.add(tiempo);
    }
    /* 
     * Quita tareas al colaborador
     * @param t = tarea que se desea quitar
    */
    public void quitarTarea(tarea t){
        tareas_por_hacer.add(t);
        tiempo_en_tarea.remove(t);
    }
    /* 
     * devuelve tareas del colaborador
     * @return tareas_por_hacer
    */
    public ArrayList estadoTareas(){
        return tareas_por_hacer;
    }
    /* 
     * devuelve un string de tareas del colaborador
     * @return s
    */
    public String darTareas(){
        String s = "";
        for(tarea t : tareas_por_hacer){
            s += " / "+t.darTarea();
        }
        return s;
    }
    
    
}
