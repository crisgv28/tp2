import java.util.ArrayList;

/**
 * La siguiente clase define el objeto tarea el cual contiene id, nombre, fecha inicio, fecha fin, responsable, estimacion, grado de avance.
 * 
 * @author (Cristopher Gomez B32927) 
 * @version (1)
 */
public class tarea
{
    int id = 0;
    String nombre = ""; // nombre de la tarea (pintar una pared, revisar una computadora, tarea de progra, ...)
    String fecha_inicio = ""; // inicio de tarea
    String fecha_fin = ""; // fin de tarea
    ArrayList<colaborador> responsables = new ArrayList<colaborador>(); //contiene los responsables a cargo de la tarea
    String estimacion = ""; // estimacion en horas o dinero
    String grado_avance = ""; // grado de avance %
    String estado = ""; // pendiente, en pausa, ...
    /* 
     * Metodo constructor de la tarea
     * @param identificador = id de la tarea
     * @param nombre_ = nombre de la tarea
     * @param fechainicio = fecha de inicio de la tarea
     * @param fechafin = fecha de finalizacion
     * @param estimacion_ = duracion o presupuesto de la tarea
     * @param gradoavance = porcentaje de la tarea que esta completo
     * @param estado_ = estado de la tarea
    */
    public tarea(int identificador, String nombre_, String fechainicio, String fechafin, String estimacion_, String gradoavance, String estado_){
        id = identificador;
        nombre = nombre_;
        fecha_inicio = fechainicio;
        fecha_fin = fechafin;
        estimacion = estimacion_;
        grado_avance = gradoavance; 
        estado = estado_;
    }
    /* 
     * anade colaboradores a las tareas
     * @param nuevo_responsable = colaborador que se desea agregar
    */
    public void anadirColaborador(colaborador nuevo_responsable){
        responsables.add(nuevo_responsable);
    }
    /* 
     * quita colaboradores a las tareas
     * @param quitar_responsable = colaborador que se desea quitar
    */
    public void quitarColaborador(colaborador quitar_responsable){
        responsables.remove(quitar_responsable);
    }
    /* 
     * cambia estado de la tarea
     * @param nuevo_estado = estado nuevo de la tarea
    */
    public void cambiarEstado(String nuevo_estado){
        estado = nuevo_estado;
    }
    /* 
     * muestra estado de la tarea
     * @return estado
    */
    public String consultarEstado(){
        return estado;
    }
    /* 
     * muestra nombre de la tarea
     * @return nombre
    */
    public String darTarea(){
        return nombre;
    }
    /* 
     * muestra colaboradores de la tarea
     * @return String con todos los colaboradores
    */
    public String darColaboradores(){
        String s = "";
        for(colaborador c : responsables){
            s += c.darNombre() + " / ";
        }
        return s;
    }
    
}
