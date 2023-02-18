package practicacom.practica.programacion.simulacroExamen2;
import java.util.Scanner;

import practicacom.practica.programacion.simulacroExamen2.buscarProductos.BUSCAR_PRODUCTOS;

public class compraCliente extends productos implements servicios.SERVICIOS, buscarProductos.BUSCAR_PRODUCTOS {
    
    protected static compraCliente vec[];
    private boolean compra = false;


    public compraCliente(String id_producto, String nombre_producto, double precio, double precioConIva) {
        super(id_producto, nombre_producto, precio, precioConIva);
    }

    public compraCliente() {
    }

    Scanner sc = new Scanner(System.in);

    public void cestaCompra() {
        BUSCAR_PRODUCTOS.buscar(sc.nextLine());
        getNombre_producto();
        getPrecio();
        getPrecioConIva();
    }


    public productos agregarProductosDeCompra() {
            System.out.println("¿Quiéres añadir algún producto a la cesta?");
            cestaCompra();
            compraCliente comp = new compraCliente(getId_producto(), getNombre_producto(), getPrecio(), getPrecioConIva());
            return comp;
    }
}
