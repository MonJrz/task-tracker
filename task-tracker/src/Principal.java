import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        mostrarMenu();
    }

    private static void mostrarMenu() {
        //Se crea línea de comando para ingresar las opciones ofrecidas en el menú.
        Scanner comando = new Scanner(System.in);


        while (!(comando.nextLine().toLowerCase().equals("salir"))){
            switch(comando){
                case "agregar" -> agregarTarea();
                case "modificar" -> modificarTarea();
                case "eliminar" -> eliminarTarea();
                case "comenzar" -> comenzarTarea();
                case "finalizar" -> finalizarTarea();
                case "listar" ->listarTareas();
                case "tareas en progreso" -> listarTareasEnProgreso();
                case "tareas terminadas" -> listarTareasTerminadas();
                case "menu" -> mostrarMenu();
                default -> System.out.println("Comando no encontrado. Escribe 'menu' para ver las opciones.");
            }
        }
    salir();
    }

    private static void salir() {
    }

    private static void listarTareasTerminadas() {
    }

    private static void listarTareasEnProgreso() {
    }

    private static void eliminarTarea() {
    }

    private static void listarTareas() {
    }

    private static void finalizarTarea() {
    }

    private static void comenzarTarea() {
        
    }

    private static void modificarTarea() {
    }

    private static void agregarTarea() {
    }
}
