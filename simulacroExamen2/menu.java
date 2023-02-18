package practicacom.practica.programacion.simulacroExamen2;
import java.util.InputMismatchException;
import java.util.Scanner;

import practicacom.practica.programacion.simulacroExamen2.buscarProductos.BUSCAR_PRODUCTOS;

public class menu extends buscarEmpleados implements BUSCAR_PRODUCTOS{
    public static void main(String[] args) {
        final String OPCIONES = "¿Qué quieres hacer?";
        final String OPCION_1 = "[1] Ver empleados";
        final String OPCION_2 = "[2] Ver productos";
        final String OPCION_3 = "[3] Iniciar compra";
        final String SALIR = "[0] Salir";
        final String ERROR_MENU = "Se ha producido un error en la inserción de comando";
        final String ESPACIO_DIFERENCIADOR = "-------------------------------------------------------------------------------------------------";
        final String MENSAJE_DESPEDIDA = "Adiós";
        
        final int tamaño_empleados = EMPLEADOS_INICIALES.length;
        final int tamaño_productos = 6;

        final String[] OPCIONES_MENU = {OPCIONES, ESPACIO_DIFERENCIADOR,  OPCION_1, OPCION_2, OPCION_3, SALIR};

        Scanner sc = new Scanner(System.in);

        boolean interruptor = false;
        int opcion_menu = 0;

        buscarEmpleados empleados = new buscarEmpleados();
        buscarProductos productos = new buscarProductos(tamaño_productos);


        for (int i = 0; i < tamaño_empleados; i++) {
            empleados.agregar(EMPLEADOS_INICIALES[i]);
        }

        for (int i = 0; i < tamaño_productos; i++) {
            productos.agregar(productos.PRODUCTOS_INICIALES[i]);
        }

        while (!interruptor) {
        System.out.println(ESPACIO_DIFERENCIADOR);
            for (final String OPCION_MENU : OPCIONES_MENU) {
                System.out.println(OPCION_MENU);
            }
        System.out.println(ESPACIO_DIFERENCIADOR);

            try { 
                opcion_menu = sc.nextInt();
                System.out.println(ESPACIO_DIFERENCIADOR);
            }
            catch (InputMismatchException ime) {
                System.out.println(ERROR_MENU);
                sc.next();
                continue;
            }
    
            switch (opcion_menu){ 
                case 1: {
                    System.out.println(empleados.toStrin());
                    break;
                } 
                case 2: {
                    System.out.println(productos.toStrin());
                    break;
                }  
                case 3: {
                    compraCliente comp = new compraCliente();
                    System.out.println(comp.agregarProductosDeCompra());
                    break;
                }   
                default: {
                    System.out.println(ERROR_MENU);
                }
            } 
            
        }
        }

        
    
    }
