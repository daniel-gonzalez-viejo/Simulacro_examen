package practicacom.practica.programacion.simulacroExamen2;

import practicacom.practica.programacion.simulacroExamen2.clientes.CLIENTES;

public class supermercado extends productos implements servicios.SERVICIOS, clientes.CLIENTES {

    //public supermercado(int id_producto, String seccion_producto, String descripcion_producto, int iva) {
    //    super(id_producto, seccion_producto, descripcion_producto, iva);
    //}

    public void imprimirTicket() {
        String numero_tarjeta = String.valueOf(CLIENTES.getTarjeta_cliente());
        System.out.println(CLIENTES.getNombre_cliente() + "   " + CLIENTES.getApellidos_cliente());
        System.out.println(numero_tarjeta.substring(numero_tarjeta.length() -4));
    }

    
    
}
