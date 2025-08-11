import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        correrMenu();
    }

    private static void correrMenu() {
        //Se crea línea de comando para ingresar las opciones ofrecidas en el menú.
        verOpciones();
        Scanner input = new Scanner(System.in);
        String comando;
        String salida = "salir";


        while (!(comando = input.nextLine()).equalsIgnoreCase(salida)) {
            switch(comando){
                case "agregar" -> agregarTarea();
                case "modificar" -> modificarTarea();
                case "eliminar" -> eliminarTarea();
                case "comenzar" -> comenzarTarea();
                case "finalizar" -> finalizarTarea();
                case "listar" ->listarTareas();
                case "tareas en progreso" -> listarTareasEnProgreso();
                case "tareas terminadas" -> listarTareasTerminadas();
                case "menu" -> correrMenu();
                default -> System.out.println("Comando no encontrado. Escribe 'menu' para ver las opciones.");
            }
        }
    salir();
    }

    private static void verOpciones() {
        System.out.println("""
                
                        ˖⁺‧₊˚♡˚₊‧⁺˖ Menú ˖⁺‧₊˚♡˚₊‧⁺˖
                
                Escribe la opción que quieras realizar:
                
                ♡ Agregar
                ♡ Modificar
                ♡ Eliminar
                ♡ Comenzar
                ♡ Finalizar
                ♡ Listar
                ♡ Tareas en progreso
                ♡ Tareas terminas
                ♡ Salir
                
                """
        );

    }

    private static void salir() {
        System.out.println("""
                
                ✮ ⋆ ˚｡𖦹 ⋆｡°✩
                
                Cerrando aplicación...
                
                𝓖𝓸𝓸𝓭𝓫𝔂𝓮 (˶ᵔ ᵕ ᵔ˶)
                
                ✮ ⋆ ˚｡𖦹 ⋆｡°✩
                """);

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
