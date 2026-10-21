package POO.Momento1y2;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("julio alvarez", "1005123456");

        Foto foto = new Foto("vacaciones.jpg");
        Impresion impresion = new Impresion("rojo", foto, 3, 5000.00);
        Camara camara = new Camara("EOS 250D", "Canon", 2, 10000.00);

        Producto[] productos = { impresion, camara };
        Pedido pedido = new Pedido(cliente, productos, "19/10/2026");

        System.out.println("Formas de pago:");
        pedido.mostrarFormasPago();
        pedido.elegirFormaPago(2);

        System.out.println();
        System.out.println("Cliente: " + cliente.getnombre());
        System.out.println("Fecha: " + pedido.getFecha());
        System.out.println("Forma de pago: " + pedido.getFormaPagoElegida());
        System.out.println();

        double total = 0;
        for (Producto p : productos) {
            String tipo = "";
            if (p instanceof Impresion) {
                tipo = "Impresion";
            } else if (p instanceof Camara) {
                tipo = "Camara";
            }

            System.out.println("Producto: " + tipo);
            System.out.println("Cantidad (numero): " + p.getNumero());
            System.out.println("Valor: " + p.getPrecio());
            System.out.println("Valor a pagar: " + p.getNumero() + " x " + p.getPrecio()
                    + " = " + (p.getNumero() * p.getPrecio()));
            System.out.println();

                total += p.getNumero() * p.getPrecio();
        }

        System.out.println("TOTAL A PAGAR: " + total);
        System.out.println("Pago con: " + pedido.getFormaPagoElegida());
    }
}