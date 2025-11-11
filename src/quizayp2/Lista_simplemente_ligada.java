
package quizayp2;


public class Lista_simplemente_ligada {
    private Nodo punta;

    public Lista_simplemente_ligada() {
        punta = null;
    }

    public Nodo getPunta() {
        return punta;
    }

    public void setPunta(Nodo punta) {
        this.punta = punta;
    }
    
    public void InsertarInicio(int dato){
        Nodo nuevo = new Nodo(dato);
        nuevo.setEnlace(punta);
        punta = nuevo;
    }
    
    public void MostrarDatos(){
        if(punta == null){
            System.out.println("\nLista Vacia \n");
        }
        else
        {
            Nodo p = punta;
            System.out.println(" ");
            while(p != null){
                
                if(p!=punta)
                {
                    System.out.print(" - ");
                }
                System.out.print(p.getDato());
                p = p.getEnlace();
            }
            System.out.println(" ");
        }
    }
     
    public void InsertarFinal(int dato){
        Nodo nuevo = new Nodo(dato);
        Nodo p = punta;
        if(punta != null){
            while(p.getEnlace()!=null){
                p = p.getEnlace();
            }
            p.setEnlace(nuevo);
        }
        else {
            punta = nuevo;
        }
    }
    
    public void InsertarEnMedio(int dato){
        Nodo nuevo = new Nodo(dato);
        Nodo p = punta;
        Nodo q = punta;
        if(punta != null){
            while(p.getDato() < nuevo.getDato()){
                q = p;
                p = p.getEnlace();
            }
            nuevo.setEnlace(p);
            q.setEnlace(nuevo);
        }
        else {
            punta = nuevo;
        }
    }
    
    public void BorrarInicio(){
        punta = punta.getEnlace();
    }
    
    public void BorrarAlFinal(){
        Nodo p = punta;
        Nodo q = punta;
        while(p.getEnlace()!=null){
            q = p;
            p = p.getEnlace();
        }
        q.setEnlace(null);
    }
    
    public void BorrarEnMedio(int dato){
        Nodo p = punta;
        Nodo q = punta;
        while (p.getDato() != dato){
            q = p;
            p = p.getEnlace();
        }
        q.setEnlace(p.getEnlace());
        p.setEnlace(null);
    }
    
    public void BorrarDatoMayor(){
        Nodo p = punta;
        Nodo q = null;
        int DatoMayor=0;
        while(p!=null){
            if(p.getDato()>DatoMayor){
              DatoMayor=p.getDato();
            }
             p=p.getEnlace();  
            }
        p = punta;
        while(p.getDato()!=DatoMayor){
            q = p;
            p = p.getEnlace();
        }
        q.setEnlace(p.getEnlace());
        p.setEnlace(null);
    }
    
    public void listaInvertida (){
        Nodo p= punta;
        Nodo q=null;
        Nodo r=null;
        while(p!=null){
          r=p.getEnlace();
          p.setEnlace(q);
          q=p;
          p=r;
        }
        punta=q;
    }
            
        }
    
    
