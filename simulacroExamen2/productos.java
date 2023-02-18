package practicacom.practica.programacion.simulacroExamen2;

import practicacom.practica.programacion.simulacroExamen2.secciones.SECCIONES;

public class productos implements secciones.SECCIONES, ivaDeProductos.IVA_PRODUCTOS  {
    private String id_producto;
    private String nombre_producto;
    private String seccion_producto;
    private String descripcion_producto;
    private double precio;
    private double precioConIva;
    private int iva;
    private String ESPACIO = "     ";

    protected static productos pro[];

    static productos W1 = new productos("1", "Fregasuelos", SECCIONES.getSECCION_LIMPIEZA(), "Sirve para limpiar", 10, 0);
    static productos W2 = new productos("2", "Ambientador", SECCIONES.getSECCION_HOGAR(), "Sirve para ordenar", 20, 0);
    static productos W3 = new productos("3", "Sartenes", SECCIONES.getSECCION_COCINA(), "Sirve para cocinar", 12, 0);
    static productos W4 = new productos("4", "Merluza", SECCIONES.getSECCION_PESCADERIA(), "Sirve para comer pescao", 14, 0);
    static productos W5 = new productos("5", "Embutidos", SECCIONES.getSECCION_CARNICERIA(), "Sirve para comer carne", 13, 0);
    static productos W6 = new productos("6", "Los chuches", SECCIONES.getSECCION_DULCES(), "Sirve para comer dulce", 23, 0);

    final static productos[] PRODUCTOS_INICIALES = {W1, W2, W3, W4, W5, W6};

    public productos(String id_producto, String nombre_producto, double precio, double precioConIva) {
        this.id_producto = id_producto;
        this.nombre_producto = nombre_producto;
        this.precio = precio;
        if (this.seccion_producto == SECCIONES.getSECCION_LIMPIEZA()) {
            this.iva = 10;
        }

        else if (seccion_producto == SECCIONES.getSECCION_PESCADERIA()) {
            this.iva = 4;
        }

        else {
            this.iva = 21;
        }  
        this.precioConIva = precio + this.iva;
    };

    public productos() {};

    public productos(String id_producto, String nombre_producto, String seccion_producto,
            String descripcion_producto, double precio, int iva) {
        this.iva = iva;
        this.id_producto = id_producto;
        this.nombre_producto = nombre_producto;
        this.seccion_producto = seccion_producto;
        this.descripcion_producto = descripcion_producto;
        this.precio = precio;

        if (this.seccion_producto == SECCIONES.getSECCION_LIMPIEZA()) {
            this.iva = 10;
        }

        else if (seccion_producto == SECCIONES.getSECCION_PESCADERIA()) {
            this.iva = 4;
        }

        else {
            this.iva = 21;
        }  
    }


    public String getId_producto() {
        return id_producto;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public String getSeccion_producto() {
        return seccion_producto;
    }

    public String getDescripcion_producto() {
        return descripcion_producto;
    }

    public double getPrecio() {
        return precio;
    }

    public double getPrecioConIva() {
        return precioConIva;
    }

    public int getIva() {
        return iva;
    }

    public static productos[] getProductosIniciales() {
        return PRODUCTOS_INICIALES;
    }

    @Override
    public String toString() {
        String s = "ID: " + getId_producto() + ESPACIO + "Nombre: " + getNombre_producto() + ESPACIO +
                "Sección: " + getSeccion_producto() + ESPACIO + "Precio: " + getPrecio() + ESPACIO + "IVA: " + getIva()+ "%";
        System.out.println(s);
        return "";
    }
    

    

    

    



    

    
    
    
}
