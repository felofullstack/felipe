package Momento1y2;

public class Producto {
    private int numero;
    private final double Precio;

    public Producto(int numero, double Precio) {
        this.numero = numero;
        this.Precio = Precio;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public double getPrecio() {
        return Precio;
    }
    public void setPrecio(double precio) {
        // No se puede modificar el precio ya que es final
    }
    public void calcularPrecio(double precio) {
        precio=precio*numero;
        System.out.println("el precio total es: " + precio);
    }

}
