package POO.Momento3;

public class BotonPiso extends Boton {

    private boolean presionado;

    private boolean iluminado;

    private int numeroPiso;

    private String estado;

    public BotonPiso(boolean presionado, boolean iluminado, int numeroPiso, String estado){

        super(presionado, iluminado);

        this.presionado = presionado;

        this.iluminado = iluminado;

        this.numeroPiso = numeroPiso;

        this.estado = estado;

    }

    public int getNumeroPiso(){

        return numeroPiso;

    }
 
    public String getEstado(){

        return estado;

    }

    public void presionarBoton(String direccion){

        presionado=true;

        iluminado=true;

        if(estado.equals(direccion)){

            estado = "subir";

        }else {

            estado = "bajar";

        }

    }
 
    public String toString(){

        return "BotonPiso [ presionado: " + presionado + " iluminado: " + iluminado + " Piso: " + numeroPiso + " estado: " + estado + "]";

    }

}
 
