import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 * esta clase ejecuta la herramienta.
 * 
 * @author (B32927) 
 * @version (1)
 */
public class controlador
{
    public static void main (){
        ArrayList<colaborador> todos_los_colaboradores = new ArrayList<colaborador>(); //almacena todos los colaboradores
        ArrayList<tarea> todas_las_tareas = new ArrayList<tarea>(); //almacena todas las tareas 
        ArrayList<lista> todas_las_listas = new ArrayList<lista>(); //almacena todas las listas de tareas
        boolean b = true;
        JOptionPane.showMessageDialog(null, "Bienvenido al gestor de sus tareas, \nhaz clic en OK para comenzar");

        while(b==true){
            String s = JOptionPane.showInputDialog("1. Gestionar colaboradores \n2. Gestionar tareas \n3. Gestionar listas \n4. Salir.");
            int i = Integer.parseInt(s);
            switch(i){
                case 1:
                    String index2 = JOptionPane.showInputDialog("1. Anadir colaborador \n2. Ver colaboradores \n3. Ver tareas de colaborador \n4. Salir");
                    int j = Integer.parseInt(index2);
                    String nombres_colaboradores = "";
                    switch(j){
                        case 1:
                            String s2 = JOptionPane.showInputDialog("No de colaborador nuevo");
                            String s3 = JOptionPane.showInputDialog("Nombre de nuevo colaborador");
                            colaborador c1 = new colaborador(Integer.parseInt(s2),s3);
                            todos_los_colaboradores.add(c1);
                            for(colaborador c : todos_los_colaboradores){
                                nombres_colaboradores += "\n# ID: "+todos_los_colaboradores.indexOf(c)+" - Nombre: "+c.darNombre();
                            }
                            JOptionPane.showMessageDialog(null, "Colaboradores en este equipo: " +nombres_colaboradores);
                            break;
                        case 2: 
                            for(colaborador c : todos_los_colaboradores){
                                nombres_colaboradores += "\n# ID: "+todos_los_colaboradores.indexOf(c)+" - Nombre: "+c.darNombre();
                            }
                            JOptionPane.showMessageDialog(null, "Colaboradores en este equipo: " +nombres_colaboradores);
                            break;
                        case 3:
                            String s4 = JOptionPane.showInputDialog("Ingrese ID del colaborador de interes:");
                            JOptionPane.showMessageDialog(null, "Tareas asignadas: "+(todos_los_colaboradores.get(Integer.parseInt(s4))).darTareas());
                            break;
                            
                        case 4:
                            break;
                            
                                    
                    }
                    break;
                case 2:
                    String index3 = JOptionPane.showInputDialog("1. Anadir tarea \n2. Ver todas las tareas \n3. Consultar una tarea \n4. Anadir colaborador a una tarea \n5. Salir");
                    int k = Integer.parseInt(index3);
                    String arreglo_de_tareas = "";
                    switch(k){
                        case 1:
                            String s5 = JOptionPane.showInputDialog("Ingrese ID de la tarea");
                            String s6 = JOptionPane.showInputDialog("Ingrese nombre de la tarea");
                            String s7 = JOptionPane.showInputDialog("Ingrese fecha de inicio de la tarea");
                            String s8 = JOptionPane.showInputDialog("Ingrese fecha de fin de la tarea");
                            String s9 = JOptionPane.showInputDialog("Ingrese estimacion(tiempo o dinero) de la tarea");
                            String s10 = JOptionPane.showInputDialog("Ingrese grado de avance hasta el momento");
                            String s11 = JOptionPane.showInputDialog("Ingrese estado(Por hacer, haciendo, terminados) de la tarea");
                            tarea t = new tarea(Integer.parseInt(s5), s6, s7, s8, s9, s10, s11);
                            todas_las_tareas.add(t);
                            for(tarea t1 : todas_las_tareas){
                                arreglo_de_tareas += todas_las_tareas.indexOf(t1) + " - " + t1.darTarea()+" - "+t1.consultarEstado()+" - "+t1.darColaboradores()+"\n";
                            }
                            JOptionPane.showMessageDialog(null, "ID de Tarea - Nombre - estado - Colaboradores a cargo \n"+arreglo_de_tareas);
                            break;
                        case 2:
                            arreglo_de_tareas = "";
                            for(tarea t1 : todas_las_tareas){
                                arreglo_de_tareas += todas_las_tareas.indexOf(t1) + " - " + t1.darTarea()+" - "+t1.consultarEstado()+" - "+t1.darColaboradores()+"\n";
                            }
                            JOptionPane.showMessageDialog(null, "ID de Tarea - Nombre - estado - Colaboradores a cargo \n"+arreglo_de_tareas);
                            break;
                        case 3:
                            String s12 = JOptionPane.showInputDialog("Ingrese ID de la tarea que desea consultar");
                            String tarea_consultada = s12 + " - " + todas_las_tareas.get(Integer.parseInt(s12)).darTarea()+" - "+todas_las_tareas.get(Integer.parseInt(s12)).consultarEstado()+" - "+todas_las_tareas.get(Integer.parseInt(s12)).darColaboradores()+"\n";
                            JOptionPane.showMessageDialog(null, "ID de Tarea - Nombre - estado - Colaboradores a cargo \n"+tarea_consultada);
                            break;
                        case 4:
                            String s13 = JOptionPane.showInputDialog("Ingrese ID de la tarea donde quiere anadir colaboradores");
                            String s14 = JOptionPane.showInputDialog("Ingrese ID del colaborador que quiere anadir a esta tarea");
                            todas_las_tareas.get(Integer.parseInt(s13)).anadirColaborador(todos_los_colaboradores.get(Integer.parseInt(s14)));
                            String tarea_con_nuevo_colab = s13 + " - " + todas_las_tareas.get(Integer.parseInt(s13)).darTarea()+" - "+todas_las_tareas.get(Integer.parseInt(s13)).consultarEstado()+" - "+todas_las_tareas.get(Integer.parseInt(s13)).darColaboradores()+"\n";
                            JOptionPane.showMessageDialog(null, "ID de Tarea - Nombre - estado - Colaboradores a cargo \n"+tarea_con_nuevo_colab);
                            break;
                        case 5:
                            break;
                    }
                    
                    break;
                case 3:
                    String index4 = JOptionPane.showInputDialog("1. Anadir lista nueva \n2. Ver todas las listas \n3. Consultar una lista \n4. Anadir tarea a una lista \n5. Salir");
                    int k2 = Integer.parseInt(index4);
                    String arreglo_de_listas = "";
                    switch(k2){
                        case 1:
                            String s15 = JOptionPane.showInputDialog("Ingrese ID de la nueva lista");
                            String s16 = JOptionPane.showInputDialog("Ingrese nombre de la lista");
                            String s17 = JOptionPane.showInputDialog("Ingrese una descripcion");
                            lista l = new lista(Integer.parseInt(s15),s16,s17);
                            todas_las_listas.add(l);
                            for(lista l1 : todas_las_listas){
                                arreglo_de_listas += todas_las_listas.indexOf(l1) + " - " + l1.darNombre()+" - "+l1.darDescripcion()+"\n";
                            }
                            JOptionPane.showMessageDialog(null, "ID de Tarea - Nombre - estado - Colaboradores a cargo \n"+arreglo_de_listas);
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        case 5:
                            break;
                    }
                    break;
                case 4:
                    break;
            
            }
            
        }
        
    }
}
