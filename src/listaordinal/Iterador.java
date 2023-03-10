package listaordinal;

public class Iterador {
    private Nodo actual;

    public Iterador(Nodo actual) {
        this.actual = actual;
    }

    public boolean hasNext() {
        return actual != null;
    }

    public Producto next() {
        Producto resultado = actual.getProducto();
        actual = actual.getSiguiente();
        return resultado;
    }
}
