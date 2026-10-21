package Momento1y2;

public class Pedido {
    private Cliente cliente;
    private Producto[] producto;
    private String fecha;



    public Pedido(Cliente cliente, Producto[] producto, String fecha) {
        this.cliente = cliente;
        this.producto = producto;
        this.fecha = fecha;
    }

    }

