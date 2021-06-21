import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 * esta clase ejecuta la herramienta.
 * 
 * @author (Cristopher Gomez B32927) 
 * @version (1)
 */
public class controlador
{
    /* 
     *Metodo controlador de la herramienta elaborada 
    */
    public static void main (){
        ArrayList<colaborador> todos_los_colaboradores = new ArrayList<colaborador>(); //almacena todos los colaboradores
        ArrayList<tarea> todas_las_tareas = new ArrayList<tarea>(); //almacena todas las tareas 
        ArrayList<lista> todas_las_listas = new ArrayList<lista>(); //almacena todas las listas de tareas
        ArrayList<columna> todas_las_columnas = new ArrayList<columna>(); //almacena todas las columnas de tareas
        boolean b = true; // para mantener el menu principal activo
        JOptionPane.showMessageDialog(null, "Bienvenido al gestor de sus tareas :)\n Funcionalidades: \n1. Almacenar a los colaboradores de su empresa. \n2. Almacenar las tareas que desea, a esas tareas les puede anadir los colaboradores del paso 1. \n3. Puede hacer listas (Compras, Materia por estudiar, ...) y anadir las tareas del paso 2. \n4. Ademas puede hacer columnas (por hacer, haciendo, finalizado) y clasificar las tareas del punto 2 en esas columnas. \n5. Puede agregar/quitar/ver tareas, colaboradores, listas, columnas, etc.    \nhaz clic en OK para comenzar");

        while(b==true){
            String s = JOptionPane.showInputDialog("1. Gestionar colaboradores \n2. Gestionar tareas \n3. Gestionar listas \n4. Gestionar columnas \n5. Salir.");
            int i = Integer.parseInt(s);
            switch(i){
                case 1:
                    String index2 = JOptionPane.showInputDialog("1. Anadir colaborador \n2. Ver colaboradores \n3. Ver tareas de colaborador \n4. Eliminar colaborador \n5. Ver columnas \n6. Salir");
                    int j = Integer.parseInt(index2);
                    String nombres_colaboradores = "";
                    switch(j){
                        case 1:
                            String s3 = JOptionPane.showInputDialog("Nombre de nuevo colaborador");
                            colaborador c1 = new colaborador(todos_los_colaboradores.size(),s3);
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
                            String s4 = JOptionPane.showInputDialog("Ingrese ID del COLABORADOR de interes:");
                            JOptionPane.showMessageDialog(null, "Tareas asignadas: "+(todos_los_colaboradores.get(Integer.parseInt(s4))).darTareas());
                            break;
                        case 4:
                            String s21 = JOptionPane.showInputDialog("Ingrese ID del COLABORADOR que desea eliminar:");
                            todos_los_colaboradores.remove(Integer.parseInt(s21));
                            JOptionPane.showMessageDialog(null, "Colaborador eliminado con exito");
                            break;
                        case 5:
                            break;
                            
                                    
                    }
                    break;
                case 2:
                    String index3 = JOptionPane.showInputDialog("1. Anadir tarea \n2. Ver todas las tareas \n3. Consultar una tarea \n4. Anadir colaborador a una tarea \n5 Eliminar colaborador de una tarea \n6. Eliminar tarea \n7. Modificar estado de tarea \n8. Salir");
                    int k = Integer.parseInt(index3);
                    String arreglo_de_tareas = "";
                    switch(k){
                        case 1:
                            String s6 = JOptionPane.showInputDialog("Ingrese nombre de la tarea");
                            String s7 = JOptionPane.showInputDialog("Ingrese fecha de inicio de la tarea");
                            String s8 = JOptionPane.showInputDialog("Ingrese fecha de fin de la tarea");
                            String s9 = JOptionPane.showInputDialog("Ingrese estimacion(tiempo o dinero) de la tarea");
                            String s10 = JOptionPane.showInputDialog("Ingrese grado de avance hasta el momento");
                            String s11 = JOptionPane.showInputDialog("Ingrese estado(Por hacer, haciendo, terminados) de la tarea");
                            tarea t = new tarea(todas_las_tareas.size(), s6, s7, s8, s9, s10, s11);
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
                            String s12 = JOptionPane.showInputDialog("Ingrese ID de la TAREA que desea consultar");
                            String tarea_consultada = s12 + " - " + todas_las_tareas.get(Integer.parseInt(s12)).darTarea()+" - "+todas_las_tareas.get(Integer.parseInt(s12)).consultarEstado()+" - "+todas_las_tareas.get(Integer.parseInt(s12)).darColaboradores()+"\n";
                            JOptionPane.showMessageDialog(null, "ID de Tarea - Nombre - estado - Colaboradores a cargo \n"+tarea_consultada);
                            break;
                        case 4:
                            String s13 = JOptionPane.showInputDialog("Ingrese ID de la TAREA donde quiere anadir colaboradores");
                            String s14 = JOptionPane.showInputDialog("Ingrese ID del COLABORADOR que quiere anadir a esta tarea");
                            todas_las_tareas.get(Integer.parseInt(s13)).anadirColaborador(todos_los_colaboradores.get(Integer.parseInt(s14)));
                            String tarea_con_nuevo_colab = s13 + " - " + todas_las_tareas.get(Integer.parseInt(s13)).darTarea()+" - "+todas_las_tareas.get(Integer.parseInt(s13)).consultarEstado()+" - "+todas_las_tareas.get(Integer.parseInt(s13)).darColaboradores()+"\n";
                            JOptionPane.showMessageDialog(null, "ID de Tarea - Nombre - estado - Colaboradores a cargo \n"+tarea_con_nuevo_colab);
                            break;
                        case 5:
                            String s26 = JOptionPane.showInputDialog("Ingrese ID de la TAREA donde quiere eliminar colaboradores");
                            String s27 = JOptionPane.showInputDialog("Ingrese ID del COLABORADOR que quiere eliminar de esta tarea");
                            todas_las_tareas.get(Integer.parseInt(s26)).quitarColaborador(todos_los_colaboradores.get(Integer.parseInt(s27)));
                            JOptionPane.showMessageDialog(null, "Colaborador eliminado con exito");
                            break;
                        case 6:
                            String s22 = JOptionPane.showInputDialog("Ingrese ID de la TAREA que desea eliminar:");
                            todas_las_tareas.remove(Integer.parseInt(s22));
                            JOptionPane.showMessageDialog(null, "Tarea eliminada con exito");
                            break;
                        case 7:
                            String s35 = JOptionPane.showInputDialog("Ingrese ID de la TAREA que desea cambiar el estado:");
                            String s36 = JOptionPane.showInputDialog("Ingrese el estado nuevo de la tarea:");
                            todas_las_tareas.get(Integer.parseInt(s35)).cambiarEstado(s36);
                            JOptionPane.showMessageDialog(null, "El estado se cambio");
                            break;
                        case 8:
                            break;
                    }
                    
                    break;
                case 3:
                    String index4 = JOptionPane.showInputDialog("1. Anadir lista nueva \n2. Ver todas las listas \n3. Consultar una lista \n4. Anadir tarea a una lista \n5. Quitar tarea de una lista \n6. Eliminar lista \n7. Salir");
                    int k2 = Integer.parseInt(index4);
                    String arreglo_de_listas = "";
                    switch(k2){
                        case 1:
                            String s16 = JOptionPane.showInputDialog("Ingrese nombre de la lista");
                            String s17 = JOptionPane.showInputDialog("Ingrese una descripcion");
                            lista l = new lista(todas_las_listas.size(),s16,s17);
                            todas_las_listas.add(l);
                            for(lista l1 : todas_las_listas){
                                arreglo_de_listas += todas_las_listas.indexOf(l1) + " - " + l1.darNombre()+" - "+l1.darDescripcion()+"\n";
                            }
                            JOptionPane.showMessageDialog(null, "ID de lista - Nombre - Descripcion \n"+arreglo_de_listas);
                            break;
                        case 2:
                            arreglo_de_listas = "";
                            for(lista l1 : todas_las_listas){
                                arreglo_de_listas += todas_las_listas.indexOf(l1) + " - " + l1.darNombre()+" - "+l1.darDescripcion()+"\n";
                            }
                            JOptionPane.showMessageDialog(null, "ID de lista - Nombre - Descripcion \n"+arreglo_de_listas);
                            break;
                        case 3:
                            String s18 = JOptionPane.showInputDialog("Ingrese ID de la LISTA que desea consultar");
                            String lista_consultada = s18 + " - " + todas_las_listas.get(Integer.parseInt(s18)).darNombre()+" - "+todas_las_listas.get(Integer.parseInt(s18)).darDescripcion();
                            JOptionPane.showMessageDialog(null, "ID de lista - Nombre - Descripcion \n"+lista_consultada);
                            break;
                        case 4:
                            String s19 = JOptionPane.showInputDialog("Ingrese ID de la LISTA donde quiere anadir tareas");
                            String s20 = JOptionPane.showInputDialog("Ingrese ID del la TAREA que quiere anadir a esta lista");
                            todas_las_listas.get(Integer.parseInt(s19)).anadirTarea(todas_las_tareas.get(Integer.parseInt(s20)));
                            break;
                        case 5:
                            String s24 = JOptionPane.showInputDialog("Ingrese ID de la LISTA donde quiere eliminar tareas");
                            String s25 = JOptionPane.showInputDialog("Ingrese ID del la TAREA que quiere eliminar de esta lista");
                            todas_las_listas.get(Integer.parseInt(s24)).quitarTarea(todas_las_tareas.get(Integer.parseInt(s25)));
                            JOptionPane.showMessageDialog(null, "Tarea eliminada con exito");
                            break;
                        case 6:
                            String s23 = JOptionPane.showInputDialog("Ingrese ID de la LISTA que desea eliminar:");
                            todas_las_listas.remove(Integer.parseInt(s23));
                            JOptionPane.showMessageDialog(null, "Lista eliminada con exito");
                            break;
                        case 7:
                            break;
                    }
                    break;
                case 4:
                    String index5 = JOptionPane.showInputDialog("1. Anadir columna \n2. Ver columna \n3. Anadir tarea a una columna \n4. Quitar tarea de una columna \n5. Eliminar columna \n6. Salir");
                    int k3 = Integer.parseInt(index5);
                    switch(k3){
                        case 1:
                            String s26 = JOptionPane.showInputDialog("Ingrese nombre de la columna");
                            String s27 = JOptionPane.showInputDialog("Ingrese ID de la tarea que desea agregar");
                            columna col = new columna(todas_las_columnas.size(), s26);
                            col.anadirTarea(todas_las_tareas.get(Integer.parseInt(s27)));
                            break;
                        case 2:
                            String s28 = JOptionPane.showInputDialog("Ingrese ID de la columna que desea ver (entre 0 y "+(todas_las_columnas.size()-1)+")");
                            JOptionPane.showMessageDialog(null, todas_las_columnas.get(Integer.parseInt(s28)).mostrarColumna());
                            break;
                        case 3:
                            String s32 = JOptionPane.showInputDialog("Ingrese ID de la COLUMNA donde desea agregar la tarea");
                            String s33 = JOptionPane.showInputDialog("Ingrese ID de la TAREA que desea agregar");
                            todas_las_columnas.get(Integer.parseInt(s32)).anadirTarea(todas_las_tareas.get(Integer.parseInt(s33)));
                            break;
                        case 4:
                            String s29 = JOptionPane.showInputDialog("Ingrese ID de la COLUMNA donde se encuentra la tarea que desea eliminar");
                            String s30 = JOptionPane.showInputDialog("Ingrese ID de la TAREA que desea eliminar");
                            todas_las_columnas.get(Integer.parseInt(s29)).quitarTarea(todas_las_tareas.get(Integer.parseInt(s30)));
                            break;
                        case 5:
                            String s31 = JOptionPane.showInputDialog("Ingrese ID de la COLUMNA que desea eliminar");
                            todas_las_columnas.remove(Integer.parseInt(s31));
                            break;
                        case 6:
                            break;
                        
                    }
                    break;
                case 5:
                    b=false;
                    break;
            
            }
            
        }
        
    }
}
