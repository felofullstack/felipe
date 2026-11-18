package POO.Momento3;

public class Boton {
    private boolean presionado;
    private boolean iluminado;
    public Boton(boolean presionado, boolean iluminado){
        this.presionado = presionado;
        this.iluminado = iluminado;
    }
    public void setPresionado(boolean presionado){
        this.presionado = presionado;
    }
 
    public void setIluminado(boolean iluminado){
        this.iluminado = iluminado;
    }
    public void presionarBoton(){
        this.presionado = true;
        this.iluminado = true;
    }
    public String toString(){
        return "Boton [ presionado: " + presionado + " iluminado: " + iluminado + "]";
    }
}

    

