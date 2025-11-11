
package quizayp2;

public class Nodo {
    private int dato;
    private Nodo enlace;

    public Nodo(int dato) {
        this.dato = dato;
        enlace = null;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getEnlace() {
        return enlace;
    }

    public void setEnlace(Nodo enlace) {
        this.enlace = enlace;
    }
            
}
