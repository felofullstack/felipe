package POO.Momento1y2;

public class Impresion  extends Producto{
    private String color; 
    private Foto foto;
 
    public Impresion(String color, Foto foto, int numero, double precio) {
        super( numero, precio ); // Llama al constructor de la clase padre con valores predeterminados
        this.color = color;
        this.foto = foto;
    }
    public String getColor() {
        return color;
    }   
    public void setColor(String color) {
        this.color = color;
    }
    public Foto getFoto() {
        return foto;
    }
    public void setFoto(Foto foto) {
        this.foto = foto;
    }
    public void imprimir() {
        System.out.println("Imprimiendo foto en color: " + color);
        foto.printFoto();
    }
}