import java.util.ArrayList;

/**
 * Columnas donde se organiza cada lista de tareas.
 * 
 * @author (Cristopher Gomez B32927) 
 * @version (1)
 */
public class columna
{
    String nombre = ""; // Nombre de la columna (por hacer, haciendo, finalizado ...)
    int id = 0;
    ArrayList<tarea> actividades = new ArrayList<tarea>(); //tareas en esta columna
    /* 
     * Metodo constructor de la columnas
     * @param id = identificador
     * @param nombre_ = nombre del colaborador
    */
    public columna(int id, String nombre_){
        nombre = nombre_;
    }
    /* 
     * anade tareas a la columna
     * @param t = tarea por agregar
    */
    public void anadirTarea(tarea t){
        actividades.add(t);
    }
    /* 
     * quita tareas a la columna
     * @param t = tarea por quitar
    */
    public void quitarTarea(tarea t){
        actividades.remove(t);
    }
    /* 
     * anade tareas a la columna
     * @return String de la columna con sus tareas. 
    */
    public String mostrarColumna(){
        String c = "";
        for(tarea t : actividades){
            c += actividades.indexOf(t) + "\t" + t.darTarea()+" - "+t.consultarEstado()+t.darColaboradores()+"\n";
        }
        String columna_con_tareas = "ID - Nombre - Estado - Colaboradores \n" + c;
        return columna_con_tareas;
    }
}
