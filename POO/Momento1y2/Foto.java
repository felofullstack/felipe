package Momento1y2;

public class Foto  {
    private String fichero;

    public Foto(String fichero) {
        this.fichero = fichero;
    }

    public String getFichero() {
        return fichero;
    }

    public void setFichero(String fichero) {
        this.fichero = fichero;
    }
    public void printFoto() {
        System.out.println("imprimiendo foto: " + fichero);
    }
}