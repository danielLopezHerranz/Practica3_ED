package listaordinal;

public class PruebasLista {
    public static void main(String[] args) {
        Producto mesaEscritorio=new Producto("Mesa escritorio", 185,2);
        Producto sillaOficina=new Producto("Silla oficina",(float) 95.9,3);
        Producto mesaCocina=new Producto("Mesa cocina",125,1);
        Producto sillonReciclable=new Producto("Sillón reciclable",230,2);
        Producto sillaOficina1=new Producto("Silla oficina",(float) 95.9,1);

        ListaOrdinal lista1=new ListaOrdinal();

        lista1.insertar(mesaEscritorio);
        lista1.insertar(sillaOficina);
        lista1.insertar(mesaCocina);
        lista1.insertar(sillonReciclable);

        lista1.mostrar();

        for (int i=3; i>0;){
            lista1.borrar(sillaOficina);
            i--;
        }

        lista1.mostrar();

        Factura factura1=new Factura("12345678B","17/03/2021");
        factura1.añadirProducto(mesaEscritorio);
        factura1.añadirProducto(sillaOficina);
        factura1.añadirProducto(mesaCocina);
        factura1.añadirProducto(sillonReciclable);
        factura1.añadirProducto(sillaOficina1);

        factura1.mostrar();
    }
}
