package Momento1y2;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("1005123456", "Juan Perez");

        Foto foto1 = new Foto("vacaciones.jpg");
        Foto foto2 = new Foto("trabajo.jpg");
        Impresion impresion = new Impresion("rojo", foto1, 3, 5000);
        Camara camara = new Camara("Canon", "EOS 250D", 2, 20000);

        Producto[] productos = { impresion, camara };
        Pago[] pagos = new Pago[] { new Efectivo("Efectivo", 50000), new TarjetaDeCredito("Tarjeta de crédito", "1234567890123456", "12/25", "123"),
         new Transferencia("Transferencia", "001234567890", "bancolombia") };
    
        Pedido pedido = new Pedido(cliente, productos, "19/10/2026");

        
       
        
        System.out.println("Cliente: " + cliente.getnombre());
        System.out.println("Fecha: 19/10/2026");
        System.out.println("Pago: " + pagos[0].getFormaPago());

        double total = 0;
        Producto[] productosPedido = { productos[1] };
        for (Producto p : productosPedido) {
            // Se revisa si el producto es una Impresion o una Camara
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
                    + " = " + p.getNumero() * p.getPrecio());
            System.out.println();

            total = total + p.getNumero() * p.getPrecio();
        }

        System.out.println("TOTAL A PAGAR: " + total);
       
    }
}